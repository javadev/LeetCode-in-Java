3992\. Rearrange String to Avoid Character Pair

Easy

You are given a string `s` and two distinct lowercase English letters `x` and `y`.

Rearrange the characters of `s` to construct a new string `t` such that:

*   `t` is a permutation of `s`.
*   Every occurrence of `y` appears before every occurrence of `x` in `t`.

Return any valid string `t`.

**Example 1:**

**Input:** s = "aabc", x = "a", y = "c"

**Output:** "cbaa"

**Explanation:**

The string `"cbaa"` is a permutation of `"aabc"`, and every occurrence of `'c'` appears before every occurrence of `'a'`.

**Example 2:**

**Input:** s = "dcab", x = "d", y = "b"

**Output:** "cabd"

**Explanation:**

The string `"cabd"` is a permutation of `"dcab"`, and every occurrence of `'b'` appears before every occurrence of `'d'`.

**Example 3:**

**Input:** s = "axe", x = "o", y = "x"

**Output:** "axe"

**Explanation:**

The string `"axe"` is already valid. Since `'o'` does not occur in the string, the required condition is automatically satisfied.

**Constraints:**

*   `1 <= s.length <= 100`
*   `s` consists of lowercase English letters.
*   `x` and `y` are lowercase English letters.
*   `x != y`