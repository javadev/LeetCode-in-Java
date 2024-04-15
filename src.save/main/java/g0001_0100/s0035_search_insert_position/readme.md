35\. Search Insert Position

Easy

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

**Input:** nums = [1,3,5,6], target = 5

**Output:** 2 

**Example 2:**

**Input:** nums = [1,3,5,6], target = 2

**Output:** 1 

**Example 3:**

**Input:** nums = [1,3,5,6], target = 7

**Output:** 4 

**Example 4:**

**Input:** nums = [1,3,5,6], target = 0

**Output:** 0 

**Example 5:**

**Input:** nums = [1], target = 0

**Output:** 0 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>4</sup></code>
*   <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
*   `nums` contains **distinct** values sorted in **ascending** order.
*   <code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code>

To solve the "Search Insert Position" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `searchInsert` that takes an integer array `nums` and an integer `target` as input and returns an integer representing the index where `target` would be inserted in order.
3. Implement binary search to find the insertion position of `target`.
4. Set the left pointer `left` to 0 and the right pointer `right` to the length of `nums` minus 1.
5. While `left` is less than or equal to `right`:
   - Calculate the middle index `mid` as `(left + right) / 2`.
   - If `nums[mid]` is equal to `target`, return `mid`.
   - If `target` is less than `nums[mid]`, update `right = mid - 1`.
   - If `target` is greater than `nums[mid]`, update `left = mid + 1`.
6. If `target` is not found in `nums`, return the value of `left`, which represents the index where `target` would be inserted in order.

Here's the implementation:

```java
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
```

This implementation provides a solution to the "Search Insert Position" problem in Java. It returns the index where `target` would be inserted in `nums` using binary search, with a time complexity of O(log n).