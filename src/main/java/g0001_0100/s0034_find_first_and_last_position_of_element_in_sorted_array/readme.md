34\. Find First and Last Position of Element in Sorted Array

Medium

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**

**Input:** nums = [5,7,7,8,8,10], target = 8

**Output:** [3,4] 

**Example 2:**

**Input:** nums = [5,7,7,8,8,10], target = 6

**Output:** [-1,-1] 

**Example 3:**

**Input:** nums = [], target = 0

**Output:** [-1,-1] 

**Constraints:**

*   <code>0 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
*   `nums` is a non-decreasing array.
*   <code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code>

To solve the "Find First and Last Position of Element in Sorted Array" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `searchRange` that takes an integer array `nums` and an integer `target` as input and returns an integer array representing the starting and ending positions of `target` in `nums`. If `target` is not found, return `[-1, -1]`.
3. Implement binary search to find the first and last occurrences of `target`.
4. Set the left pointer `left` to 0 and the right pointer `right` to the length of `nums` minus 1.
5. Initialize two variables `firstOccurrence` and `lastOccurrence` to -1.
6. Perform two binary search operations:
   - First, find the first occurrence of `target`:
     - While `left` is less than or equal to `right`:
       - Calculate the middle index `mid` as `(left + right) / 2`.
       - If `nums[mid]` is equal to `target`, update `firstOccurrence = mid` and continue searching on the left half by updating `right = mid - 1`.
       - Otherwise, if `target` is less than `nums[mid]`, update `right = mid - 1`.
       - Otherwise, update `left = mid + 1`.
   - Second, find the last occurrence of `target`:
     - Reset `left` to 0 and `right` to the length of `nums` minus 1.
     - While `left` is less than or equal to `right`:
       - Calculate the middle index `mid` as `(left + right) / 2`.
       - If `nums[mid]` is equal to `target`, update `lastOccurrence = mid` and continue searching on the right half by updating `left = mid + 1`.
       - Otherwise, if `target` is greater than `nums[mid]`, update `left = mid + 1`.
       - Otherwise, update `right = mid - 1`.
7. Return the array `[firstOccurrence, lastOccurrence]`.

Here's the implementation:

```java
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        // Find first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Find last occurrence
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{firstOccurrence, lastOccurrence};
    }
}
```

This implementation provides a solution to the "Find First and Last Position of Element in Sorted Array" problem in Java. It returns the starting and ending positions of `target` in `nums` using binary search, with a time complexity of O(log n).