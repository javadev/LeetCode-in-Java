3983\. Subsequence After One Replacement

Medium

You are given two strings `s` and `t` consisting of lowercase English letters.

You may choose **at most** one index in `s` and replace the character at that index with any lowercase English letter.

Return `true` if it is possible to make `s` a subsequence of `t`; otherwise, return `false`.

**Example 1:**

**Input:** s = "cat", t = "chat"

**Output:** true

**Explanation:**

*   Replace `s[1]` from `'a'` to `'h'`. The resulting string is `"cht"`.
*   `"cht"` is a subsequence of `"chat"` because we can match `'c'`, `'h'`, and `'t'` in order.

**Example 2:**

**Input:** s = "plane", t = "apple"

**Output:** false

**Explanation:**

*   The characters `'p'`, `'l'`, and `'e'` can be matched in `t`, but the remaining characters cannot be matched while preserving the required order.
*   Even after replacing any one character in `s`, it is impossible to make `s` a subsequence of `t`.

**Constraints:**

*   <code>1 <= s.length, t.length <= 10<sup>5</sup></code>
*   `s` and `t` consist only of lowercase English letters.