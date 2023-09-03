2536\. Increment Submatrices by One

Medium

You are given a positive integer `n`, indicating that we initially have an `n x n` **0-indexed** integer matrix `mat` filled with zeroes.

You are also given a 2D integer array `query`. For each <code>query[i] = [row1<sub>i</sub>, col1<sub>i</sub>, row2<sub>i</sub>, col2<sub>i</sub>]</code>, you should do the following operation:

*   Add `1` to **every element** in the submatrix with the **top left** corner <code>(row1<sub>i</sub>, col1<sub>i</sub>)</code> and the **bottom right** corner <code>(row2<sub>i</sub>, col2<sub>i</sub>)</code>. That is, add `1` to `mat[x][y]` for all <code>row1<sub>i</sub> <= x <= row2<sub>i</sub></code> and <code>col1<sub>i</sub> <= y <= col2<sub>i</sub></code>.

Return _the matrix_ `mat` _after performing every query._

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/11/24/p2example11.png)

**Input:** n = 3, queries = [[1,1,2,2],[0,0,1,1]]

**Output:** [[1,1,0],[1,2,1],[0,1,1]]

**Explanation:** The diagram above shows the initial matrix, the matrix after the first query, and the matrix after the second query. 

- In the first query, we add 1 to every element in the submatrix with the top left corner (1, 1) and bottom right corner (2, 2). 

- In the second query, we add 1 to every element in the submatrix with the top left corner (0, 0) and bottom right corner (1, 1).

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/11/24/p2example22.png)

**Input:** n = 2, queries = [[0,0,1,1]]

**Output:** [[1,1],[1,1]]

**Explanation:** The diagram above shows the initial matrix and the matrix after the first query. 

- In the first query we add 1 to every element in the matrix.

**Constraints:**

*   `1 <= n <= 500`
*   <code>1 <= queries.length <= 10<sup>4</sup></code>
*   <code>0 <= row1<sub>i</sub> <= row2<sub>i</sub> < n</code>
*   <code>0 <= col1<sub>i</sub> <= col2<sub>i</sub> < n</code>