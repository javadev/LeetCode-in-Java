1414\. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K

Medium

Given an integer `k`, _return the minimum number of Fibonacci numbers whose sum is equal to_ `k`. The same Fibonacci number can be used multiple times.

The Fibonacci numbers are defined as:

*   <code>F<sub>1</sub> = 1</code>
*   <code>F<sub>2</sub> = 1</code>
*   <code>F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub></code> for `n > 2.`

It is guaranteed that for the given constraints we can always find such Fibonacci numbers that sum up to `k`.

**Example 1:**

**Input:** k = 7

**Output:** 2

**Explanation:** The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ... For k = 7 we can use 2 + 5 = 7.

**Example 2:**

**Input:** k = 10

**Output:** 2

**Explanation:** For k = 10 we can use 2 + 8 = 10.

**Example 3:**

**Input:** k = 19

**Output:** 3

**Explanation:** For k = 19 we can use 1 + 5 + 13 = 19.

**Constraints:**

*   <code>1 <= k <= 10<sup>9</sup></code>