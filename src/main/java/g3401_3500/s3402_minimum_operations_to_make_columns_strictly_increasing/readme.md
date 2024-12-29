3402\. Minimum Operations to Make Columns Strictly Increasing

Easy

You are given a `m x n` matrix `grid` consisting of **non-negative** integers.

In one operation, you can increment the value of any `grid[i][j]` by 1.

Return the **minimum** number of operations needed to make all columns of `grid` **strictly increasing**.

**Example 1:**

**Input:** grid = [[3,2],[1,3],[3,4],[0,1]]

**Output:** 15

**Explanation:**

*   To make the <code>0<sup>th</sup></code> column strictly increasing, we can apply 3 operations on `grid[1][0]`, 2 operations on `grid[2][0]`, and 6 operations on `grid[3][0]`.
*   To make the <code>1<sup>st</sup></code> column strictly increasing, we can apply 4 operations on `grid[3][1]`.

![](https://assets.leetcode.com/uploads/2024/11/10/firstexample.png)

**Example 2:**

**Input:** grid = [[3,2,1],[2,1,0],[1,2,3]]

**Output:** 12

**Explanation:**

*   To make the <code>0<sup>th</sup></code> column strictly increasing, we can apply 2 operations on `grid[1][0]`, and 4 operations on `grid[2][0]`.
*   To make the <code>1<sup>st</sup></code> column strictly increasing, we can apply 2 operations on `grid[1][1]`, and 2 operations on `grid[2][1]`.
*   To make the <code>2<sup>nd</sup></code> column strictly increasing, we can apply 2 operations on `grid[1][2]`.

![](https://assets.leetcode.com/uploads/2024/11/10/secondexample.png)

**Constraints:**

*   `m == grid.length`
*   `n == grid[i].length`
*   `1 <= m, n <= 50`
*   `0 <= grid[i][j] < 2500`