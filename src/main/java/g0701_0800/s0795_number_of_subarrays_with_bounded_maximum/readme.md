795\. Number of Subarrays with Bounded Maximum

Medium

Given an integer array `nums` and two integers `left` and `right`, return _the number of contiguous non-empty **subarrays** such that the value of the maximum array element in that subarray is in the range_ `[left, right]`.

The test cases are generated so that the answer will fit in a **32-bit** integer.

**Example 1:**

**Input:** nums = [2,1,4,3], left = 2, right = 3

**Output:** 3

**Explanation:** There are three subarrays that meet the requirements: [2], [2, 1], [3]. 

**Example 2:**

**Input:** nums = [2,9,2,5,6], left = 2, right = 8

**Output:** 7 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>9</sup></code>
*   <code>0 <= left <= right <= 10<sup>9</sup></code>