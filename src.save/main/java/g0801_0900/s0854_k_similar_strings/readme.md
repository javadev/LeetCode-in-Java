854\. K-Similar Strings

Hard

Strings `s1` and `s2` are `k`**\-similar** (for some non-negative integer `k`) if we can swap the positions of two letters in `s1` exactly `k` times so that the resulting string equals `s2`.

Given two anagrams `s1` and `s2`, return the smallest `k` for which `s1` and `s2` are `k`**\-similar**.

**Example 1:**

**Input:** s1 = "ab", s2 = "ba"

**Output:** 1

**Example 2:**

**Input:** s1 = "abc", s2 = "bca"

**Output:** 2

**Constraints:**

*   `1 <= s1.length <= 20`
*   `s2.length == s1.length`
*   `s1` and `s2` contain only lowercase letters from the set `{'a', 'b', 'c', 'd', 'e', 'f'}`.
*   `s2` is an anagram of `s1`.