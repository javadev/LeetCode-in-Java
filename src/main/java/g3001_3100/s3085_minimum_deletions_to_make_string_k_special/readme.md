3085\. Minimum Deletions to Make String K-Special

Medium

You are given a string `word` and an integer `k`.

We consider `word` to be **k-special** if `|freq(word[i]) - freq(word[j])| <= k` for all indices `i` and `j` in the string.

Here, `freq(x)` denotes the frequency of the character `x` in `word`, and `|y|` denotes the absolute value of `y`.

Return _the **minimum** number of characters you need to delete to make_ `word` **_k-special_**.

**Example 1:**

**Input:** word = "aabcaba", k = 0

**Output:** 3

**Explanation:** We can make `word` `0`\-special by deleting `2` occurrences of `"a"` and `1` occurrence of `"c"`. Therefore, `word` becomes equal to `"baba"` where `freq('a') == freq('b') == 2`.

**Example 2:**

**Input:** word = "dabdcbdcdcd", k = 2

**Output:** 2

**Explanation:** We can make `word` `2`\-special by deleting `1` occurrence of `"a"` and `1` occurrence of `"d"`. Therefore, `word` becomes equal to "bdcbdcdcd" where `freq('b') == 2`, `freq('c') == 3`, and `freq('d') == 4`.

**Example 3:**

**Input:** word = "aaabaaa", k = 2

**Output:** 1

**Explanation:** We can make `word` `2`\-special by deleting `1` occurrence of `"b"`. Therefore, `word` becomes equal to `"aaaaaa"` where each letter's frequency is now uniformly `6`.

**Constraints:**

*   <code>1 <= word.length <= 10<sup>5</sup></code>
*   <code>0 <= k <= 10<sup>5</sup></code>
*   `word` consists only of lowercase English letters.