3915\. Maximum Sum of Alternating Subsequence With Distance at Least K

Hard

You are given an integer array `nums` of length `n` and an integer `k`.

Pick a **subsequence** with indices <code>0 <= i<sub>1</sub> < i<sub>2</sub> < ... < i<sub>m</sub> < n</code> such that:

*   For every `1 <= t < m`, <code>i<sub>t+1</sub> - i<sub>t</sub> >= k</code>.
*   The selected values form a **strictly alternating** sequence. In other words, either:
    *   <code>nums[i<sub>1</sub>] < nums[i<sub>2</sub>] > nums[i<sub>3</sub>] < ...</code>, or
    *   <code>nums[i<sub>1</sub>] > nums[i<sub>2</sub>] < nums[i<sub>3</sub>] > ...</code>

A **subsequence** of length 1 is also considered **strictly** alternating. The score of a **valid** subsequence is the **sum** of its selected values.

Return an integer denoting the **maximum** possible **score** of a valid subsequence.

**Example 1:**

**Input:** nums = [5,4,2], k = 2

**Output:** 7

**Explanation:**

An optimal choice is indices `[0, 2]`, which gives values `[5, 2]`.

*   The distance condition holds because `2 - 0 = 2 >= k`.
*   The values are strictly alternating because `5 > 2`.

The score is `5 + 2 = 7`.

**Example 2:**

**Input:** nums = [3,5,4,2,4], k = 1

**Output:** 14

**Explanation:**

An optimal choice is indices `[0, 1, 3, 4]`, which gives values `[3, 5, 2, 4]`.

*   The distance condition holds because each pair of consecutive chosen indices differs by at least `k = 1`.
*   The values are strictly alternating since `3 < 5 > 2 < 4`.

The score is `3 + 5 + 2 + 4 = 14`.

**Example 3:**

**Input:** nums = [5], k = 1

**Output:** 5

**Explanation:**

The only valid subsequence is `[5]`. A subsequence with 1 element is always strictly alternating, so the score is 5.

**Constraints:**

*   <code>1 <= n == nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>
*   `1 <= k <= n`