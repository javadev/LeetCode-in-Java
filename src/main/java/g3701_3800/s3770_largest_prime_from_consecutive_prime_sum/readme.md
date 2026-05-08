3770\. Largest Prime from Consecutive Prime Sum

Medium

You are given an integer `n`.

Return the **largest prime number** less than or equal to `n` that can be expressed as the **sum** of one or more **consecutive prime numbers** starting from 2. If no such number exists, return 0.

**Example 1:**

**Input:** n = 20

**Output:** 17

**Explanation:**

The prime numbers less than or equal to `n = 20` which are consecutive prime sums are:

*   `2 = 2`

*   `5 = 2 + 3`

*   `17 = 2 + 3 + 5 + 7`


The largest is 17, so it is the answer.

**Example 2:**

**Input:** n = 2

**Output:** 2

**Explanation:**

The only consecutive prime sum less than or equal to 2 is 2 itself.

**Constraints:**

*   <code>1 <= n <= 5 * 10<sup>5</sup></code>