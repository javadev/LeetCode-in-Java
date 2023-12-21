1234\. Replace the Substring for Balanced String

Medium

You are given a string s of length `n` containing only four kinds of characters: `'Q'`, `'W'`, `'E'`, and `'R'`.

A string is said to be **balanced** if each of its characters appears `n / 4` times where `n` is the length of the string.

Return _the minimum length of the substring that can be replaced with **any** other string of the same length to make_ `s` _**balanced**_. If s is already **balanced**, return `0`.

**Example 1:**

**Input:** s = "QWER"

**Output:** 0

**Explanation:** s is already balanced.

**Example 2:**

**Input:** s = "QQWE"

**Output:** 1

**Explanation:** We need to replace a 'Q' to 'R', so that "RQWE" (or "QRWE") is balanced.

**Example 3:**

**Input:** s = "QQQW"

**Output:** 2

**Explanation:** We can replace the first "QQ" to "ER".

**Constraints:**

*   `n == s.length`
*   <code>4 <= n <= 10<sup>5</sup></code>
*   `n` is a multiple of `4`.
*   `s` contains only `'Q'`, `'W'`, `'E'`, and `'R'`.