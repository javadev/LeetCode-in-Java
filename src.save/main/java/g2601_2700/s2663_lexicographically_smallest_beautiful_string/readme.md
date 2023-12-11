2663\. Lexicographically Smallest Beautiful String

Hard

A string is **beautiful** if:

*   It consists of the first `k` letters of the English lowercase alphabet.
*   It does not contain any substring of length `2` or more which is a palindrome.

You are given a beautiful string `s` of length `n` and a positive integer `k`.

Return _the lexicographically smallest string of length_ `n`_, which is larger than_ `s` _and is **beautiful**_. If there is no such string, return an empty string.

A string `a` is lexicographically larger than a string `b` (of the same length) if in the first position where `a` and `b` differ, `a` has a character strictly larger than the corresponding character in `b`.

*   For example, `"abcd"` is lexicographically larger than `"abcc"` because the first position they differ is at the fourth character, and `d` is greater than `c`.

**Example 1:**

**Input:** s = "abcz", k = 26

**Output:** "abda"

**Explanation:**

The string "abda" is beautiful and lexicographically larger than the string "abcz".

It can be proven that there is no string that is lexicographically larger than the string "abcz", beautiful, and lexicographically smaller than the string "abda".

**Example 2:**

**Input:** s = "dc", k = 4

**Output:** ""

**Explanation:** It can be proven that there is no string that is lexicographically larger than the string "dc" and is beautiful.

**Constraints:**

*   <code>1 <= n == s.length <= 10<sup>5</sup></code>
*   `4 <= k <= 26`
*   `s` is a beautiful string.
