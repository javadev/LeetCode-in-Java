581\. Shortest Unsorted Continuous Subarray

Medium

Given an integer array `nums`, you need to find one **continuous subarray** that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.

Return _the shortest such subarray and output its length_.

**Example 1:**

**Input:** nums = [2,6,4,8,10,9,15]

**Output:** 5

**Explanation:** You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

**Example 2:**

**Input:** nums = [1,2,3,4]

**Output:** 0

**Example 3:**

**Input:** nums = [1]

**Output:** 0

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>4</sup></code>
*   <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code>

**Follow up:** Can you solve it in `O(n)` time complexity?