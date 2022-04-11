1513\. Number of Substrings With Only 1s

Medium

Given a binary string `s`, return _the number of substrings with all characters_ `1`_'s_. Since the answer may be too large, return it modulo <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** s = "0110111"

**Output:** 9

**Explanation:** There are 9 substring in total with only 1's characters. "1" -> 5 times. "11" -> 3 times. "111" -> 1 time.

**Example 2:**

**Input:** s = "101"

**Output:** 2

**Explanation:** Substring "1" is shown 2 times in s.

**Example 3:**

**Input:** s = "111111"

**Output:** 21

**Explanation:** Each substring contains only 1's characters.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s[i]` is either `'0'` or `'1'`.