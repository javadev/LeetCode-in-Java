3291\. Minimum Number of Valid Strings to Form Target I

Medium

You are given an array of strings `words` and a string `target`.

A string `x` is called **valid** if `x` is a prefix of **any** string in `words`.

Return the **minimum** number of **valid** strings that can be _concatenated_ to form `target`. If it is **not** possible to form `target`, return `-1`.

A prefix of a string is a substring that starts from the beginning of the string and extends to any point within it.

**Example 1:**

**Input:** words = ["abc","aaaaa","bcdef"], target = "aabcdabc"

**Output:** 3

**Explanation:**

The target string can be formed by concatenating:

*   Prefix of length 2 of `words[1]`, i.e. `"aa"`.
*   Prefix of length 3 of `words[2]`, i.e. `"bcd"`.
*   Prefix of length 3 of `words[0]`, i.e. `"abc"`.

**Example 2:**

**Input:** words = ["abababab","ab"], target = "ababaababa"

**Output:** 2

**Explanation:**

The target string can be formed by concatenating:

*   Prefix of length 5 of `words[0]`, i.e. `"ababa"`.
*   Prefix of length 5 of `words[0]`, i.e. `"ababa"`.

**Example 3:**

**Input:** words = ["abcdef"], target = "xyz"

**Output:** \-1

**Constraints:**

*   `1 <= words.length <= 100`
*   <code>1 <= words[i].length <= 5 * 10<sup>3</sup></code>
*   The input is generated such that <code>sum(words[i].length) <= 10<sup>5</sup></code>.
*   `words[i]` consists only of lowercase English letters.
*   <code>1 <= target.length <= 5 * 10<sup>3</sup></code>
*   `target` consists only of lowercase English letters.