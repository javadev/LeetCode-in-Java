3560\. Find Minimum Log Transportation Cost

Easy

You are given integers `n`, `m`, and `k`.

There are two logs of lengths `n` and `m` units, which need to be transported in three trucks where each truck can carry one log with length **at most** `k` units.

You may cut the logs into smaller pieces, where the cost of cutting a log of length `x` into logs of length `len1` and `len2` is `cost = len1 * len2` such that `len1 + len2 = x`.

Return the **minimum total cost** to distribute the logs onto the trucks. If the logs don't need to be cut, the total cost is 0.

**Example 1:**

**Input:** n = 6, m = 5, k = 5

**Output:** 5

**Explanation:**

Cut the log with length 6 into logs with length 1 and 5, at a cost equal to `1 * 5 == 5`. Now the three logs of length 1, 5, and 5 can fit in one truck each.

**Example 2:**

**Input:** n = 4, m = 4, k = 6

**Output:** 0

**Explanation:**

The two logs can fit in the trucks already, hence we don't need to cut the logs.

**Constraints:**

*   <code>2 <= k <= 10<sup>5</sup></code>
*   `1 <= n, m <= 2 * k`
*   The input is generated such that it is always possible to transport the logs.