2516\. Take K of Each Character From Left and Right

Medium

You are given a string `s` consisting of the characters `'a'`, `'b'`, and `'c'` and a non-negative integer `k`. Each minute, you may take either the **leftmost** character of `s`, or the **rightmost** character of `s`.

Return _the **minimum** number of minutes needed for you to take **at least**_ `k` _of each character, or return_ `-1` _if it is not possible to take_ `k` _of each character._

**Example 1:**

**Input:** s = "aabaaaacaabc", k = 2

**Output:** 8

**Explanation:**

Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.

Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.

A total of 3 + 5 = 8 minutes is needed.

It can be proven that 8 is the minimum number of minutes needed. 

**Example 2:**

**Input:** s = "a", k = 1

**Output:** -1

**Explanation:** It is not possible to take one 'b' or 'c' so return -1. 

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s` consists of only the letters `'a'`, `'b'`, and `'c'`.
*   `0 <= k <= s.length`