1072\. Flip Columns For Maximum Number of Equal Rows

Medium

You are given an `m x n` binary matrix `matrix`.

You can choose any number of columns in the matrix and flip every cell in that column (i.e., Change the value of the cell from `0` to `1` or vice versa).

Return _the maximum number of rows that have all values equal after some number of flips_.

**Example 1:**

**Input:** matrix = [[0,1],[1,1]]

**Output:** 1

**Explanation:** After flipping no values, 1 row has all values equal.

**Example 2:**

**Input:** matrix = [[0,1],[1,0]]

**Output:** 2

**Explanation:** After flipping values in the first column, both rows have equal values.

**Example 3:**

**Input:** matrix = [[0,0,0],[0,0,1],[1,1,0]]

**Output:** 2

**Explanation:** After flipping values in the first two columns, the last two rows have equal values.

**Constraints:**

*   `m == matrix.length`
*   `n == matrix[i].length`
*   `1 <= m, n <= 300`
*   `matrix[i][j]` is either `0` or `1`.