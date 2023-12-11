1296\. Divide Array in Sets of K Consecutive Numbers

Medium

Given an array of integers `nums` and a positive integer `k`, check whether it is possible to divide this array into sets of `k` consecutive numbers.

Return `true` _if it is possible_. Otherwise, return `false`.

**Example 1:**

**Input:** nums = [1,2,3,3,4,4,5,6], k = 4

**Output:** true

**Explanation:** Array can be divided into [1,2,3,4] and [3,4,5,6].

**Example 2:**

**Input:** nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3

**Output:** true

**Explanation:** Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11].

**Example 3:**

**Input:** nums = [1,2,3,4], k = 3

**Output:** false

**Explanation:** Each array should be divided in subarrays of size 3.

**Constraints:**

*   <code>1 <= k <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>

**Note:** This question is the same as 846: [https://leetcode.com/problems/hand-of-straights/](https://leetcode.com/problems/hand-of-straights/)