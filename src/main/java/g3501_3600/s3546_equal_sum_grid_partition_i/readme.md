3546\. Equal Sum Grid Partition I

Medium

You are given an `m x n` matrix `grid` of positive integers. Your task is to determine if it is possible to make **either one horizontal or one vertical cut** on the grid such that:

*   Each of the two resulting sections formed by the cut is **non-empty**.
*   The sum of the elements in both sections is **equal**.

Return `true` if such a partition exists; otherwise return `false`.

**Example 1:**

**Input:** grid = [[1,4],[2,3]]

**Output:** true

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/03/30/lc.png)![](https://assets.leetcode.com/uploads/2025/03/30/lc.jpeg)

A horizontal cut between row 0 and row 1 results in two non-empty sections, each with a sum of 5. Thus, the answer is `true`.

**Example 2:**

**Input:** grid = [[1,3],[2,4]]

**Output:** false

**Explanation:**

No horizontal or vertical cut results in two non-empty sections with equal sums. Thus, the answer is `false`.

**Constraints:**

*   <code>1 <= m == grid.length <= 10<sup>5</sup></code>
*   <code>1 <= n == grid[i].length <= 10<sup>5</sup></code>
*   <code>2 <= m * n <= 10<sup>5</sup></code>
*   <code>1 <= grid[i][j] <= 10<sup>5</sup></code>