1400\. Construct K Palindrome Strings

Medium

Given a string `s` and an integer `k`, return `true` _if you can use all the characters in_ `s` _to construct_ `k` _palindrome strings or_ `false` _otherwise_.

**Example 1:**

**Input:** s = "annabelle", k = 2

**Output:** true

**Explanation:** You can construct two palindromes using all characters in s. Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"

**Example 2:**

**Input:** s = "leetcode", k = 3

**Output:** false

**Explanation:** It is impossible to construct 3 palindromes using all the characters of s.

**Example 3:**

**Input:** s = "true", k = 4

**Output:** true

**Explanation:** The only possible solution is to put each character in a separate string.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s` consists of lowercase English letters.
*   <code>1 <= k <= 10<sup>5</sup></code>