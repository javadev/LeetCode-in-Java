2531\. Make Number of Distinct Characters Equal

Medium

You are given two **0-indexed** strings `word1` and `word2`.

A **move** consists of choosing two indices `i` and `j` such that `0 <= i < word1.length` and `0 <= j < word2.length` and swapping `word1[i]` with `word2[j]`.

Return `true` _if it is possible to get the number of distinct characters in_ `word1` _and_ `word2` _to be equal with **exactly one** move._ Return `false` _otherwise_.

**Example 1:**

**Input:** word1 = "ac", word2 = "b"

**Output:** false

**Explanation:** Any pair of swaps would yield two distinct characters in the first string, and one in the second string.

**Example 2:**

**Input:** word1 = "abcc", word2 = "aab"

**Output:** true

**Explanation:** We swap index 2 of the first string with index 0 of the second string. The resulting strings are word1 = "abac" and word2 = "cab", which both have 3 distinct characters.

**Example 3:**

**Input:** word1 = "abcde", word2 = "fghij"

**Output:** true

**Explanation:** Both resulting strings will have 5 distinct characters, regardless of which indices we swap.

**Constraints:**

*   <code>1 <= word1.length, word2.length <= 10<sup>5</sup></code>
*   `word1` and `word2` consist of only lowercase English letters.