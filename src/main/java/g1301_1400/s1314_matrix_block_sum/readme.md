1314\. Matrix Block Sum

Medium

Given a `m x n` matrix `mat` and an integer `k`, return _a matrix_ `answer` _where each_ `answer[i][j]` _is the sum of all elements_ `mat[r][c]` _for_:

*   `i - k <= r <= i + k,`
*   `j - k <= c <= j + k`, and
*   `(r, c)` is a valid position in the matrix.

**Example 1:**

**Input:** mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1

**Output:** [[12,21,16],[27,45,33],[24,39,28]]

**Example 2:**

**Input:** mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2

**Output:** [[45,45,45],[45,45,45],[45,45,45]]

**Constraints:**

*   `m == mat.length`
*   `n == mat[i].length`
*   `1 <= m, n, k <= 100`
*   `1 <= mat[i][j] <= 100`