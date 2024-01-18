2364\. Count Number of Bad Pairs

Medium

You are given a **0-indexed** integer array `nums`. A pair of indices `(i, j)` is a **bad pair** if `i < j` and `j - i != nums[j] - nums[i]`.

Return _the total number of **bad pairs** in_ `nums`.

**Example 1:**

**Input:** nums = [4,1,3,3]

**Output:** 5

**Explanation:** 

The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.

The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1. 

The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1. 

The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2. 

The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0. 

There are a total of 5 bad pairs, so we return 5.

**Example 2:**

**Input:** nums = [1,2,3,4,5]

**Output:** 0

**Explanation:** There are no bad pairs.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>