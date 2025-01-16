3212\. Count Submatrices With Equal Frequency of X and Y

Medium

Given a 2D character matrix `grid`, where `grid[i][j]` is either `'X'`, `'Y'`, or `'.'`, return the number of submatrices that contains:

*   `grid[0][0]`
*   an **equal** frequency of `'X'` and `'Y'`.
*   **at least** one `'X'`.

**Example 1:**

**Input:** grid = [["X","Y","."],["Y",".","."]]

**Output:** 3

**Explanation:**

**![](https://leetcode-in-java.github.io/src/main/java/g3201_3300/s3212_count_submatrices_with_equal_frequency_of_x_and_y/examplems.png)**

**Example 2:**

**Input:** grid = [["X","X"],["X","Y"]]

**Output:** 0

**Explanation:**

No submatrix has an equal frequency of `'X'` and `'Y'`.

**Example 3:**

**Input:** grid = [[".","."],[".","."]]

**Output:** 0

**Explanation:**

No submatrix has at least one `'X'`.

**Constraints:**

*   `1 <= grid.length, grid[i].length <= 1000`
*   `grid[i][j]` is either `'X'`, `'Y'`, or `'.'`.