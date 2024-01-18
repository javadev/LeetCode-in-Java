2981\. Find Longest Special Substring That Occurs Thrice I

Medium

You are given a string `s` that consists of lowercase English letters.

A string is called **special** if it is made up of only a single character. For example, the string `"abc"` is not special, whereas the strings `"ddd"`, `"zz"`, and `"f"` are special.

Return _the length of the **longest special substring** of_ `s` _which occurs **at least thrice**_, _or_ `-1` _if no special substring occurs at least thrice_.

A **substring** is a contiguous **non-empty** sequence of characters within a string.

**Example 1:**

**Input:** s = "aaaa"

**Output:** 2

**Explanation:** The longest special substring which occurs thrice is "aa": substrings "<ins>**aa**</ins>aa", "a<ins>**aa**</ins>a", and "aa<ins>**aa**</ins>".

It can be shown that the maximum length achievable is 2. 

**Example 2:**

**Input:** s = "abcdef"

**Output:** -1

**Explanation:** There exists no special substring which occurs at least thrice. Hence return -1. 

**Example 3:**

**Input:** s = "abcaba"

**Output:** 1

**Explanation:** The longest special substring which occurs thrice is "a": substrings "<ins>**a**</ins>bcaba", "abc<ins>**a**</ins>ba", and "abcab<ins>**a**</ins>".

It can be shown that the maximum length achievable is 1. 

**Constraints:**

*   `3 <= s.length <= 50`
*   `s` consists of only lowercase English letters.