730\. Count Different Palindromic Subsequences

Hard

Given a string s, return _the number of different non-empty palindromic subsequences in_ `s`. Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

A subsequence of a string is obtained by deleting zero or more characters from the string.

A sequence is palindromic if it is equal to the sequence reversed.

Two sequences <code>a<sub>1</sub>, a<sub>2</sub>, ...</code> and <code>b<sub>1</sub>, b<sub>2</sub>, ...</code> are different if there is some `i` for which <code>a<sub>i</sub> != b<sub>i</sub></code>.

**Example 1:**

**Input:** s = "bccb"

**Output:** 6

**Explanation:** The 6 different non-empty palindromic subsequences are 'b', 'c', 'bb', 'cc', 'bcb', 'bccb'. Note that 'bcb' is counted only once, even though it occurs twice.

**Example 2:**

**Input:** s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"

**Output:** 104860361

**Explanation:** There are 3104860382 different non-empty palindromic subsequences, which is 104860361 modulo 10<sup>9</sup> + 7.

**Constraints:**

*   `1 <= s.length <= 1000`
*   `s[i]` is either `'a'`, `'b'`, `'c'`, or `'d'`.