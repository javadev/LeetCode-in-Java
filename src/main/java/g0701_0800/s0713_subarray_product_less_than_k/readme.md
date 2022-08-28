713\. Subarray Product Less Than K

Medium

Given an array of integers `nums` and an integer `k`, return _the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than_ `k`.

**Example 1:**

**Input:** nums = [10,5,2,6], k = 100

**Output:** 8

**Explanation:** 

The 8 subarrays that have product less than 100 are: 

[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6] 

Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

**Example 2:**

**Input:** nums = [1,2,3], k = 0

**Output:** 0

**Constraints:**

*   <code>1 <= nums.length <= 3 * 10<sup>4</sup></code>
*   `1 <= nums[i] <= 1000`
*   <code>0 <= k <= 10<sup>6</sup></code>