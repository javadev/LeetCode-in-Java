53\. Maximum Subarray

Easy

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return _its sum_.

A **subarray** is a **contiguous** part of an array.

**Example 1:**

**Input:** nums = [-2,1,-3,4,-1,2,1,-5,4]

**Output:** 6

**Explanation:** [4,-1,2,1] has the largest sum = 6. 

**Example 2:**

**Input:** nums = [1]

**Output:** 1 

**Example 3:**

**Input:** nums = [5,4,-1,7,8]

**Output:** 23 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution using the **divide and conquer** approach, which is more subtle.

To solve the "Maximum Subarray" problem in Java with the Solution class, follow these steps:

1. Define a method `maxSubArray` in the `Solution` class that takes an integer array `nums` as input and returns an integer representing the largest sum of a contiguous subarray.
2. Initialize two variables `maxSum` and `currentSum` to store the maximum sum found so far and the sum of the current subarray being considered, respectively. Set both to the value of the first element in `nums`.
3. Iterate through the array `nums` from index `1` to `nums.length - 1`:
   - Update `currentSum` as the maximum of the current element and the sum of the current element plus `currentSum`.
   - Update `maxSum` as the maximum of `maxSum` and `currentSum`.
4. After iterating through all elements in `nums`, return `maxSum`.

Here's the implementation of the `maxSubArray` method in Java:

```java
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
```

This implementation efficiently finds the largest sum of a contiguous subarray in the given array `nums` using the Kadane's algorithm, which has a time complexity of O(n).