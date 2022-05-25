1001\. Grid Illumination

Hard

There is a 2D `grid` of size `n x n` where each cell of this grid has a lamp that is initially **turned off**.

You are given a 2D array of lamp positions `lamps`, where <code>lamps[i] = [row<sub>i</sub>, col<sub>i</sub>]</code> indicates that the lamp at <code>grid[row<sub>i</sub>][col<sub>i</sub>]</code> is **turned on**. Even if the same lamp is listed more than once, it is turned on.

When a lamp is turned on, it **illuminates its cell** and **all other cells** in the same **row, column, or diagonal**.

You are also given another 2D array `queries`, where <code>queries[j] = [row<sub>j</sub>, col<sub>j</sub>]</code>. For the <code>j<sup>th</sup></code> query, determine whether <code>grid[row<sub>j</sub>][col<sub>j</sub>]</code> is illuminated or not. After answering the <code>j<sup>th</sup></code> query, **turn off** the lamp at <code>grid[row<sub>j</sub>][col<sub>j</sub>]</code> and its **8 adjacent lamps** if they exist. A lamp is adjacent if its cell shares either a side or corner with <code>grid[row<sub>j</sub>][col<sub>j</sub>]</code>.

Return _an array of integers_ `ans`_,_ _where_ `ans[j]` _should be_ `1` _if the cell in the_ <code>j<sup>th</sup></code> _query was illuminated, or_ `0` _if the lamp was not._

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/19/illu_1.jpg)

**Input:** n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]

**Output:** [1,0]

**Explanation:** We have the initial grid with all lamps turned off. In the above picture we see the grid after turning on the lamp at grid[0][0] then turning on the lamp at grid[4][4]. The 0<sup>th</sup> query asks if the lamp at grid[1][1] is illuminated or not (the blue square). It is illuminated, so set ans[0] = 1. Then, we turn off all lamps in the red square. ![](https://assets.leetcode.com/uploads/2020/08/19/illu_step1.jpg) The 1<sup>st</sup> query asks if the lamp at grid[1][0] is illuminated or not (the blue square). It is not illuminated, so set ans[1] = 0. Then, we turn off all lamps in the red rectangle. ![](https://assets.leetcode.com/uploads/2020/08/19/illu_step2.jpg)

**Example 2:**

**Input:** n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]

**Output:** [1,1]

**Example 3:**

**Input:** n = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]

**Output:** [1,1,0]

**Constraints:**

*   <code>1 <= n <= 10<sup>9</sup></code>
*   `0 <= lamps.length <= 20000`
*   `0 <= queries.length <= 20000`
*   `lamps[i].length == 2`
*   <code>0 <= row<sub>i</sub>, col<sub>i</sub> < n</code>
*   `queries[j].length == 2`
*   <code>0 <= row<sub>j</sub>, col<sub>j</sub> < n</code>