3777\. Minimum Deletions to Make Alternating Substring

Hard

You are given a string `s` of length `n` consisting only of the characters `'A'` and `'B'`.

You are also given a 2D integer array `queries` of length `q`, where each `queries[i]` is one of the following:

*   `[1, j]`: **Flip** the character at index `j` of `s` i.e. `'A'` changes to `'B'` (and vice versa). This operation mutates `s` and affects subsequent queries.
*   `[2, l, r]`: **Compute** the **minimum** number of character deletions required to make the **substring** `s[l..r]` **alternating**. This operation does not modify `s`; the length of `s` remains `n`.

A **substring** is **alternating** if no two **adjacent** characters are **equal**. A substring of length 1 is always alternating.

Return an integer array `answer`, where `answer[i]` is the result of the <code>i<sup>th</sup></code> query of type `[2, l, r]`.

**Example 1:**

**Input:** s = "ABA", queries = [[2,1,2],[1,1],[2,0,2]]

**Output:** [0,2]

**Explanation:**

| i | queries[i] | j | l | r | s before query | s[l..r] | Result | Answer |
|---|------------|---|---|---|----------------|---------|--------|--------|
| 0 | [2, 1, 2]  | - | 1 | 2 | `"ABA"`        | `"BA"`  | Already alternating | 0 |
| 1 | [1, 1]     | 1 | - | - | `"ABA"`        | -       | Flip `s[1]` from `'B'` to `'A'` | - |
| 2 | [2, 0, 2]  | - | 0 | 2 | `"AAA"`        | `"AAA"` | Delete any two `'A'`s to get `"A"` | 2 |

Thus, the answer is `[0, 2]`.

**Example 2:**

**Input:** s = "ABB", queries = [[2,0,2],[1,2],[2,0,2]]

**Output:** [1,0]

**Explanation:**

| i | queries[i] | j | l | r | s before query | s[l..r] | Result | Answer |
|---|------------|---|---|---|----------------|---------|--------|--------|
| 0 | [2, 0, 2]  | - | 0 | 2 | `"ABB"`        | `"ABB"` | Delete one `'B'` to get `"AB"` | 1 |
| 1 | [1, 2]     | 2 | - | - | `"ABB"`        | -       | Flip `s[2]` from `'B'` to `'A'` | - |
| 2 | [2, 0, 2]  | - | 0 | 2 | `"ABA"`        | `"ABA"` | Already alternating | 0 |

Thus, the answer is `[1, 0]`.

**Example 3:**

**Input:** s = "BABA", queries = [[2,0,3],[1,1],[2,1,3]]

**Output:** [0,1]

**Explanation:**

| i | queries[i] | j | l | r | s before query | s[l..r] | Result | Answer |
|---|------------|---|---|---|----------------|---------|--------|--------|
| 0 | [2, 0, 3]  | - | 0 | 3 | `"BABA"`       | `"BABA"`| Already alternating | 0 |
| 1 | [1, 1]     | 1 | - | - | `"BABA"`       | -       | Flip `s[1]` from `'A'` to `'B'` | - |
| 2 | [2, 1, 3]  | - | 1 | 3 | `"BBBA"`       | `"BBA"` | Delete one `'B'` to get `"BA"` | 1 |

Thus, the answer is `[0, 1]`.

**Constraints:**

*   <code>1 <= n == s.length <= 10<sup>5</sup></code>
*   `s[i]` is either `'A'` or `'B'`.
*   <code>1 <= q == queries.length <= 10<sup>5</sup></code>
*   `queries[i].length == 2` or `3`
    *   `queries[i] == [1, j]` or,
    *   `queries[i] == [2, l, r]`
    *   `0 <= j <= n - 1`
    *   `0 <= l <= r <= n - 1`