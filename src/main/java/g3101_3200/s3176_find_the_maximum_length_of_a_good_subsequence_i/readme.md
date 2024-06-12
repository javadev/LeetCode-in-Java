3176\. Find the Maximum Length of a Good Subsequence I

Medium

You are given an integer array `nums` and a **non-negative** integer `k`. A sequence of integers `seq` is called **good** if there are **at most** `k` indices `i` in the range `[0, seq.length - 2]` such that `seq[i] != seq[i + 1]`.

Return the **maximum** possible length of a **good** subsequence of `nums`.

**Example 1:**

**Input:** nums = [1,2,1,1,3], k = 2

**Output:** 4

**Explanation:**

The maximum length subsequence is <code>[<ins>1</ins>,<ins>2</ins>,<ins>1</ins>,<ins>1</ins>,3]</code>.

**Example 2:**

**Input:** nums = [1,2,3,4,5,1], k = 0

**Output:** 2

**Explanation:**

The maximum length subsequence is <code>[<ins>1</ins>,2,3,4,5,<ins>1</ins>]</code>.

**Constraints:**

*   `1 <= nums.length <= 500`
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   `0 <= k <= min(nums.length, 25)`