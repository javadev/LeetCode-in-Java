3558\. Number of Ways to Assign Edge Weights I

Medium

There is an undirected tree with `n` nodes labeled from 1 to `n`, rooted at node 1. The tree is represented by a 2D integer array `edges` of length `n - 1`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that there is an edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>.

Initially, all edges have a weight of 0. You must assign each edge a weight of either **1** or **2**.

The **cost** of a path between any two nodes `u` and `v` is the total weight of all edges in the path connecting them.

Select any one node `x` at the **maximum** depth. Return the number of ways to assign edge weights in the path from node 1 to `x` such that its total cost is **odd**.

Since the answer may be large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Note:** Ignore all edges **not** in the path from node 1 to `x`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2025/03/23/screenshot-2025-03-24-at-060006.png)

**Input:** edges = [[1,2]]

**Output:** 1

**Explanation:**

*   The path from Node 1 to Node 2 consists of one edge (`1 → 2`).
*   Assigning weight 1 makes the cost odd, while 2 makes it even. Thus, the number of valid assignments is 1.

**Example 2:**

![](https://assets.leetcode.com/uploads/2025/03/23/screenshot-2025-03-24-at-055820.png)

**Input:** edges = [[1,2],[1,3],[3,4],[3,5]]

**Output:** 2

**Explanation:**

*   The maximum depth is 2, with nodes 4 and 5 at the same depth. Either node can be selected for processing.
*   For example, the path from Node 1 to Node 4 consists of two edges (`1 → 3` and `3 → 4`).
*   Assigning weights (1,2) or (2,1) results in an odd cost. Thus, the number of valid assignments is 2.

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   `edges.length == n - 1`
*   <code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>]</code>
*   <code>1 <= u<sub>i</sub>, v<sub>i</sub> <= n</code>
*   `edges` represents a valid tree.