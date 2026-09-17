3905\. Multi Source Flood Fill

Medium

You are given two integers `n` and `m` representing the number of rows and columns of a grid, respectively.

You are also given a 2D integer array `sources`, where <code>sources[i] = [r<sub>i</sub>, c<sub>i</sub>, color<sub>i</sub>]</code> indicates that the cell <code>(r<sub>i</sub>, c<sub>i</sub>)</code> is initially colored with <code>color<sub>i</sub></code>. All other cells are initially uncolored and represented as 0.

At each time step, every currently colored cell spreads its color to all adjacent **uncolored** cells in the four directions: up, down, left, and right. All spreads happen simultaneously.

If **multiple** colors reach the same uncolored cell at the same time step, the cell takes the color with the **maximum** value.

The process continues until no more cells can be colored.

Return a 2D integer array representing the final state of the grid, where each cell contains its final color.

**Example 1:**

**Input:** n = 3, m = 3, sources = [[0,0,1],[2,2,2]]

**Output:** [[1,1,2],[1,2,2],[2,2,2]]

**Explanation:**

The grid at each time step is as follows:

![](https://assets.leetcode.com/uploads/2026/03/29/g50new.png)

At time step 2, cells `(0, 2)`, `(1, 1)`, and `(2, 0)` are reached by both colors, so they are assigned color 2 as it has the maximum value among them.

**Example 2:**

**Input:** n = 3, m = 3, sources = [[0,1,3],[1,1,5]]

**Output:** [[3,3,3],[5,5,5],[5,5,5]]

**Explanation:**

The grid at each time step is as follows:

![](https://assets.leetcode.com/uploads/2026/03/29/g51new.png)

**Example 3:**

**Input:** n = 2, m = 2, sources = [[1,1,5]]

**Output:** [[5,5],[5,5]]

**Explanation:**

The grid at each time step is as follows:

![](https://assets.leetcode.com/uploads/2026/03/29/g52new.png)

Since there is only one source, all cells are assigned the same color.

**Constraints:**

*   <code>1 <= n, m <= 10<sup>5</sup></code>
*   <code>1 <= n * m <= 10<sup>5</sup></code>
*   `1 <= sources.length <= n * m`
*   <code>sources[i] = [r<sub>i</sub>, c<sub>i</sub>, color<sub>i</sub>]</code>
*   <code>0 <= r<sub>i</sub> <= n - 1</code>
*   <code>0 <= c<sub>i</sub> <= m - 1</code>
*   <code>1 <= color<sub>i</sub> <= 10<sup>6</sup></code>
*   All <code>(r<sub>i</sub>, c<sub>i</sub>)</code> in `sources` are distinct.