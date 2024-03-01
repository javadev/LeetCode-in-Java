33\. Search in Rotated Sorted Array

Medium

There is an integer array `nums` sorted in ascending order (with **distinct** values).

Prior to being passed to your function, `nums` is **possibly rotated** at an unknown pivot index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` and become `[4,5,6,7,0,1,2]`.

Given the array `nums` **after** the possible rotation and an integer `target`, return _the index of_ `target` _if it is in_ `nums`_, or_ `-1` _if it is not in_ `nums`.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

**Input:** nums = [4,5,6,7,0,1,2], target = 0

**Output:** 4 

**Example 2:**

**Input:** nums = [4,5,6,7,0,1,2], target = 3

**Output:** -1 

**Example 3:**

**Input:** nums = [1], target = 0

**Output:** -1 

**Constraints:**

*   `1 <= nums.length <= 5000`
*   <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
*   All values of `nums` are **unique**.
*   `nums` is an ascending array that is possibly rotated.
*   <code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code>

To solve the "Search in Rotated Sorted Array" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `search` that takes an integer array `nums` and an integer `target` as input and returns an integer representing the index of `target` in `nums`. If `target` is not found, return `-1`.
3. Implement the binary search algorithm to find the index of `target` in the rotated sorted array.
4. Set the left pointer `left` to 0 and the right pointer `right` to the length of `nums` minus 1.
5. While `left` is less than or equal to `right`:
   - Calculate the middle index `mid` as `(left + right) / 2`.
   - If `nums[mid]` is equal to `target`, return `mid`.
   - Check if the left half of the array (`nums[left]` to `nums[mid]`) is sorted:
     - If `nums[left] <= nums[mid]` and `nums[left] <= target < nums[mid]`, update `right = mid - 1`.
     - Otherwise, update `left = mid + 1`.
   - Otherwise, check if the right half of the array (`nums[mid]` to `nums[right]`) is sorted:
     - If `nums[mid] <= nums[right]` and `nums[mid] < target <= nums[right]`, update `left = mid + 1`.
     - Otherwise, update `right = mid - 1`.
6. If `target` is not found, return `-1`.

Here's the implementation:

```java
public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
```

This implementation provides a solution to the "Search in Rotated Sorted Array" problem in Java. It searches for the index of `target` in the rotated sorted array `nums`. The algorithm has a time complexity of O(log n).