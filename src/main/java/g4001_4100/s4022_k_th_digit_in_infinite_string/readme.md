4022\. K-th Digit in Infinite String

Medium

You are given an integer `k`.

An **infinite** string is formed by **concatenating** the **decimal** representations of the **positive** integers, without separators.

For every nonnegative integer `b`, block `b` contains the **positive** integers from `10 * b` through `10 * b + 9`. The integers in each block are appended as follows:

*   If `b` is even, append the integers in **increasing** order.
*   If `b` is odd, append the integers in **decreasing** order.

Therefore, the string starts with the integers 1 through 9, followed by 19 through 10, then 20 through 29, then 39 through 30, and so on.

Return the <code>k<sup>th</sup></code> digit (1-indexed) of this string.

**Example 1:**

**Input:** k = 4

**Output:** 4

**Explanation:**

The string begins as <code>"123<ins>4</ins>56789.."</code>. The 4<sup>th</sup> digit is `'4'`.

**Example 2:**

**Input:** k = 15

**Output:** 7

**Explanation:**

The string begins as <code>"12345678919181<ins>7</ins>.."</code>. The 15<sup>th</sup> digit is `'7'`.

**Example 3:**

**Input:** k = 11

**Output:** 9

**Explanation:**

The string begins as <code>"1234567891<ins>9</ins>.."</code>. The 11<sup>th</sup> digit is `'9'`.

**Constraints:**

*   <code>1 <= k <= 10<sup>15</sup></code>