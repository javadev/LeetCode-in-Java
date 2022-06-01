996\. Number of Squareful Arrays

Hard

An array is **squareful** if the sum of every pair of adjacent elements is a **perfect square**.

Given an integer array nums, return _the number of permutations of_ `nums` _that are **squareful**_.

Two permutations `perm1` and `perm2` are different if there is some index `i` such that `perm1[i] != perm2[i]`.

**Example 1:**

**Input:** nums = [1,17,8]

**Output:** 2

**Explanation:** [1,8,17] and [17,8,1] are the valid permutations. 

**Example 2:**

**Input:** nums = [2,2,2]

**Output:** 1 

**Constraints:**

*   `1 <= nums.length <= 12`
*   <code>0 <= nums[i] <= 10<sup>9</sup></code>