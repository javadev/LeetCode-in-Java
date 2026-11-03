3981\. Count Distinct Ways to Form Target from Two Strings

Hard

You are given three strings `word1`, `word2`, and `target`.

Your task is to count the number of ways to form `target` by choosing characters from `word1` and `word2` under the following conditions:

*   For each character of `target`, choose one matching character from either `word1` or `word2`.
*   The chosen indices from `word1` must be **strictly** increasing.
*   The chosen indices from `word2` must be **strictly** increasing.
*   **At least** one character must be chosen from **both** `word1` and `word2`.

Two ways are considered different if, for **at least** one position in `target`, the chosen character comes from a different string or a different index.

Return the number of ways. Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** word1 = "abc", word2 = "bac", target = "abc"

**Output:** 5

**Explanation:**

There are 5 ways to form `target`:

*   `word1[0] = 'a'`, `word1[1] = 'b'`, `word2[2] = 'c'`
*   `word1[0] = 'a'`, `word2[0] = 'b'`, `word1[2] = 'c'`
*   `word1[0] = 'a'`, `word2[0] = 'b'`, `word2[2] = 'c'`
*   `word2[1] = 'a'`, `word1[1] = 'b'`, `word1[2] = 'c'`
*   `word2[1] = 'a'`, `word1[1] = 'b'`, `word2[2] = 'c'`

All ways preserve the increasing index order inside each string and choose at least one character from each string.

**Example 2:**

**Input:** word1 = "cd", word2 = "cd", target = "ccd"

**Output:** 4

**Explanation:**

There are 4 ways to form `target`:

*   `word1[0] = 'c'`, `word2[0] = 'c'`, `word1[1] = 'd'`
*   `word1[0] = 'c'`, `word2[0] = 'c'`, `word2[1] = 'd'`
*   `word2[0] = 'c'`, `word1[0] = 'c'`, `word1[1] = 'd'`
*   `word2[0] = 'c'`, `word1[0] = 'c'`, `word2[1] = 'd'`

The first two `'c'` characters in `target` must come one from each string. The final `'d'` can be chosen from either string.

**Example 3:**

**Input:** word1 = "xy", word2 = "xy", target = "xyxy"

**Output:** 2

**Explanation:**

There are 2 ways to form `target`:

*   `word1[0] = 'x'`, `word1[1] = 'y'`, `word2[0] = 'x'`, `word2[1] = 'y'`
*   `word2[0] = 'x'`, `word2[1] = 'y'`, `word1[0] = 'x'`, `word1[1] = 'y'`

Each `"xy"` part in `target` comes entirely from one string.

**Example 4:**

**Input:** word1 = "ab", word2 = "cde", target = "ace"

**Output:** 1

**Explanation:**

The only way is to choose `word1[0] = 'a'`, `word2[0] = 'c'`, and `word2[2] = 'e'`. Thus, the answer is 1.

**Constraints:**

*   `1 <= word1.length, word2.length, target.length <= 100`
*   `word1`, `word2`, and `target` consist of lowercase English letters only.