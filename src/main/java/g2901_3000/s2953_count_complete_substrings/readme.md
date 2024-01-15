2953\. Count Complete Substrings

Hard

You are given a string `word` and an integer `k`.

A substring `s` of `word` is **complete** if:

*   Each character in `s` occurs **exactly** `k` times.
*   The difference between two adjacent characters is **at most** `2`. That is, for any two adjacent characters `c1` and `c2` in `s`, the absolute difference in their positions in the alphabet is **at most** `2`.

Return _the number of **complete** substrings of_ `word`.

A **substring** is a **non-empty** contiguous sequence of characters in a string.

**Example 1:**

**Input:** word = "igigee", k = 2

**Output:** 3

**Explanation:** The complete substrings where each character appears exactly twice and the difference between adjacent characters is at most 2 are: <ins>**igig**</ins>ee, igig<ins>**ee**</ins>, <ins>**igigee**</ins>.

**Example 2:**

**Input:** word = "aaabbbccc", k = 3

**Output:** 6

**Explanation:** The complete substrings where each character appears exactly three times and the difference between adjacent characters is at most 2 are: **<ins>aaa</ins>**bbbccc, aaa<ins>**bbb**</ins>ccc, aaabbb<ins>**ccc**</ins>, **<ins>aaabbb</ins>**ccc, aaa<ins>**bbbccc**</ins>, <ins>**aaabbbccc**</ins>.

**Constraints:**

*   <code>1 <= word.length <= 10<sup>5</sup></code>
*   `word` consists only of lowercase English letters.
*   `1 <= k <= word.length`