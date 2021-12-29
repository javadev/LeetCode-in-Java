220\. Contains Duplicate III

Medium

Given an integer array `nums` and two integers `k` and `t`, return `true` if there are **two distinct indices** `i` and `j` in the array such that `abs(nums[i] - nums[j]) <= t` and `abs(i - j) <= k`.

**Example 1:**

**Input:** nums = [1,2,3,1], k = 3, t = 0

**Output:** true 

**Example 2:**

**Input:** nums = [1,0,1,1], k = 1, t = 2

**Output:** true 

**Example 3:**

**Input:** nums = [1,5,9,1,5,9], k = 2, t = 3

**Output:** false 

**Constraints:**

*   <code>1 <= nums.length <= 2 * 10<sup>4</sup></code>
*   <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>
*   <code>0 <= k <= 10<sup>4</sup></code>
*   <code>0 <= t <= 2<sup>31</sup> - 1</code>