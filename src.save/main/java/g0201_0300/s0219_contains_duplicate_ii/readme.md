219\. Contains Duplicate II

Easy

Given an integer array `nums` and an integer `k`, return `true` if there are two **distinct indices** `i` and `j` in the array such that `nums[i] == nums[j]` and `abs(i - j) <= k`.

**Example 1:**

**Input:** nums = [1,2,3,1], k = 3

**Output:** true 

**Example 2:**

**Input:** nums = [1,0,1,1], k = 1

**Output:** true 

**Example 3:**

**Input:** nums = [1,2,3,1,2,3], k = 2

**Output:** false 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
*   <code>0 <= k <= 10<sup>5</sup></code>