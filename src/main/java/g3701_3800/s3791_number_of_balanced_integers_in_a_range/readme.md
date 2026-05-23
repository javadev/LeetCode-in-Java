3791\. Number of Balanced Integers in a Range

Hard

You are given two integers `low` and `high`.

An integer is called **balanced** if it satisfies **both** of the following conditions:

*   It contains **at least** two digits.
*   The **sum of digits at even positions** is equal to the **sum of digits at odd positions** (the leftmost digit has position 1).

Return an integer representing the number of balanced integers in the range `[low, high]` (both inclusive).

**Example 1:**

**Input:** low = 1, high = 100

**Output:** 9

**Explanation:**

The 9 balanced numbers between 1 and 100 are 11, 22, 33, 44, 55, 66, 77, 88, and 99.

**Example 2:**

**Input:** low = 120, high = 129

**Output:** 1

**Explanation:**

Only 121 is balanced because the sum of digits at even and odd positions are both 2.

**Example 3:**

**Input:** low = 1234, high = 1234

**Output:** 0

**Explanation:**

1234 is not balanced because the sum of digits at odd positions `(1 + 3 = 4)` does not equal the sum at even positions `(2 + 4 = 6)`.

**Constraints:**

*   <code>1 <= low <= high <= 10<sup>15</sup></code>