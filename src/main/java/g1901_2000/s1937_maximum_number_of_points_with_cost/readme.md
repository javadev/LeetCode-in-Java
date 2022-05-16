1937\. Maximum Number of Points with Cost

Medium

You are given an `m x n` integer matrix `points` (**0-indexed**). Starting with `0` points, you want to **maximize** the number of points you can get from the matrix.

To gain points, you must pick one cell in **each row**. Picking the cell at coordinates `(r, c)` will **add** `points[r][c]` to your score.

However, you will lose points if you pick a cell too far from the cell that you picked in the previous row. For every two adjacent rows `r` and `r + 1` (where `0 <= r < m - 1`), picking cells at coordinates <code>(r, c<sub>1</sub>)</code> and <code>(r + 1, c<sub>2</sub>)</code> will **subtract** <code>abs(c<sub>1</sub> - c<sub>2</sub>)</code> from your score.

Return _the **maximum** number of points you can achieve_.

`abs(x)` is defined as:

*   `x` for `x >= 0`.
*   `-x` for `x < 0`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/07/12/screenshot-2021-07-12-at-13-40-26-diagram-drawio-diagrams-net.png)

**Input:** points = [[1,2,3],[1,5,1],[3,1,1]]

**Output:** 9

**Explanation:** 

The blue cells denote the optimal cells to pick, which have coordinates (0, 2), (1, 1), and (2, 0). 

You add 3 + 5 + 3 = 11 to your score. 

However, you must subtract abs(2 - 1) + abs(1 - 0) = 2 from your score. 

Your final score is 11 - 2 = 9.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/07/12/screenshot-2021-07-12-at-13-42-14-diagram-drawio-diagrams-net.png)

**Input:** points = [[1,5],[2,3],[4,2]]

**Output:** 11

**Explanation:** 

The blue cells denote the optimal cells to pick, which have coordinates (0, 1), (1, 1), and (2, 0).

You add 5 + 3 + 4 = 12 to your score. 

However, you must subtract abs(1 - 1) + abs(1 - 0) = 1 from your score. 

Your final score is 12 - 1 = 11.

**Constraints:**

*   `m == points.length`
*   `n == points[r].length`
*   <code>1 <= m, n <= 10<sup>5</sup></code>
*   <code>1 <= m * n <= 10<sup>5</sup></code>
*   <code>0 <= points[r][c] <= 10<sup>5</sup></code>