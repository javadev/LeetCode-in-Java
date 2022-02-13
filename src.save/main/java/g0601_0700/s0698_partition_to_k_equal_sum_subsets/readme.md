698\. Partition to K Equal Sum Subsets

Medium

Given an integer array `nums` and an integer `k`, return `true` if it is possible to divide this array into `k` non-empty subsets whose sums are all equal.

**Example 1:**

**Input:** nums = [4,3,2,3,5,2,1], k = 4

**Output:** true

**Explanation:** It is possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums. 

**Example 2:**

**Input:** nums = [1,2,3,4], k = 3

**Output:** false 

**Constraints:**

*   `1 <= k <= nums.length <= 16`
*   <code>1 <= nums[i] <= 10<sup>4</sup></code>
*   The frequency of each element is in the range `[1, 4]`.