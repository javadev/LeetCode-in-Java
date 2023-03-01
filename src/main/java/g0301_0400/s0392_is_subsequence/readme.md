392\. Is Subsequence

Easy

Given two strings `s` and `t`, return `true` _if_ `s` _is a **subsequence** of_ `t`_, or_ `false` _otherwise_.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not).

**Example 1:**

**Input:** s = "abc", t = "ahbgdc"

**Output:** true

**Example 2:**

**Input:** s = "axc", t = "ahbgdc"

**Output:** false

**Constraints:**

*   `0 <= s.length <= 100`
*   <code>0 <= t.length <= 10<sup>4</sup></code>
*   `s` and `t` consist only of lowercase English letters.

**Follow up:** Suppose there are lots of incoming `s`, say <code>s<sub>1</sub>, s<sub>2</sub>, ..., s<sub>k</sub></code> where <code>k >= 10<sup>9</sup></code>, and you want to check one by one to see if `t` has its subsequence. In this scenario, how would you change your code?