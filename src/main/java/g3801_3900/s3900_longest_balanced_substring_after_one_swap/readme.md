3900\. Longest Balanced Substring After One Swap

Medium

You are given a binary string `s` consisting only of characters `'0'` and `'1'`.

A string is **balanced** if it contains an **equal** number of `'0'`s and `'1'`s.

You can perform **at most one** swap between any two characters in `s`. Then, you select a **balanced** substring from `s`.

Return an integer representing the **maximum** length of the **balanced** substring you can select.

**Example 1:**

**Input:** s = "100001"

**Output:** 4

**Explanation:**

*   Swap <code>"10<ins>**0**</ins>00<ins>**1**</ins>"</code>. The string becomes `"101000"`.
*   Select the substring <code>"<ins>**1010**</ins>00"</code>, which is balanced because it has two `'0'`s and two `'1'`s.

**Example 2:**

**Input:** s = "111"

**Output:** 0

**Explanation:**

*   Choose not to perform any swaps.
*   Select the empty substring, which is balanced because it has zero `'0'`s and zero `'1'`s.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s` consists only of the characters `'0'` and `'1'`.