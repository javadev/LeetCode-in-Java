1015\. Smallest Integer Divisible by K

Medium

Given a positive integer `k`, you need to find the **length** of the **smallest** positive integer `n` such that `n` is divisible by `k`, and `n` only contains the digit `1`.

Return _the **length** of_ `n`. If there is no such `n`, return -1.

**Note:** `n` may not fit in a 64-bit signed integer.

**Example 1:**

**Input:** k = 1

**Output:** 1

**Explanation:** The smallest answer is n = 1, which has length 1.

**Example 2:**

**Input:** k = 2

**Output:** -1

**Explanation:** There is no such positive integer n divisible by 2.

**Example 3:**

**Input:** k = 3

**Output:** 3

**Explanation:** The smallest answer is n = 111, which has length 3.

**Constraints:**

*   <code>1 <= k <= 10<sup>5</sup></code>