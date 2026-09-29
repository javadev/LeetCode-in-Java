3922\. Minimum Flips to Make Binary String Coherent

Medium

You are given a binary string `s`.

A string is considered **coherent** if it does **not** contain `"011"` or `"110"` as subsequences.

In one operation, you can **flip** any character in `s` (`'0'` to `'1'` or `'1'` to `'0'`).

Return an integer denoting the **minimum** number of operations required to make `s` coherent.

**Example 1:**

**Input:** s = "1010"

**Output:** 1

**Explanation:**

Flip `s[0]` to get `"0010"`, which contains no `"011"` or `"110"` subsequences.

**Example 2:**

**Input:** s = "0110"

**Output:** 1

**Explanation:**

Flip `s[1]` to get `"0010"`, removing all forbidden subsequences `"011"` and `"110"`.

**Example 3:**

**Input:** s = "1000"

**Output:** 0

**Explanation:**

The string already has no `"011"` or `"110"` subsequences, so no flips are needed.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s[i]` is either `'0'` or `'1'`.