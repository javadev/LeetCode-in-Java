3578\. Count Partitions With Max-Min Difference at Most K

Medium

You are given an integer array `nums` and an integer `k`. Your task is to partition `nums` into one or more **non-empty** contiguous segments such that in each segment, the difference between its **maximum** and **minimum** elements is **at most** `k`.

Return the total number of ways to partition `nums` under this condition.

Since the answer may be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** nums = [9,4,1,3,7], k = 4

**Output:** 6

**Explanation:**

There are 6 valid partitions where the difference between the maximum and minimum elements in each segment is at most `k = 4`:

*   `[[9], [4], [1], [3], [7]]`
*   `[[9], [4], [1], [3, 7]]`
*   `[[9], [4], [1, 3], [7]]`
*   `[[9], [4, 1], [3], [7]]`
*   `[[9], [4, 1], [3, 7]]`
*   `[[9], [4, 1, 3], [7]]`

**Example 2:**

**Input:** nums = [3,3,4], k = 0

**Output:** 2

**Explanation:**

There are 2 valid partitions that satisfy the given conditions:

*   `[[3], [3], [4]]`
*   `[[3, 3], [4]]`

**Constraints:**

*   <code>2 <= nums.length <= 5 * 10<sup>4</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   <code>0 <= k <= 10<sup>9</sup></code>