417\. Pacific Atlantic Water Flow

Medium

There is an `m x n` rectangular island that borders both the **Pacific Ocean** and **Atlantic Ocean**. The **Pacific Ocean** touches the island's left and top edges, and the **Atlantic Ocean** touches the island's right and bottom edges.

The island is partitioned into a grid of square cells. You are given an `m x n` integer matrix `heights` where `heights[r][c]` represents the **height above sea level** of the cell at coordinate `(r, c)`.

The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is **less than or equal to** the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.

Return _a **2D list** of grid coordinates_ `result` _where_ <code>result[i] = [r<sub>i</sub>, c<sub>i</sub>]</code> _denotes that rain water can flow from cell_ <code>(r<sub>i</sub>, c<sub>i</sub>)</code> _to **both** the Pacific and Atlantic oceans_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/06/08/waterflow-grid.jpg)

**Input:** heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]

**Output:** [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]] 

**Example 2:**

**Input:** heights = [[2,1],[1,2]]

**Output:** [[0,0],[0,1],[1,0],[1,1]] 

**Constraints:**

*   `m == heights.length`
*   `n == heights[r].length`
*   `1 <= m, n <= 200`
*   <code>0 <= heights[r][c] <= 10<sup>5</sup></code>