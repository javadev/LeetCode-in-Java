3613\. Minimize Maximum Component Cost

Medium

You are given an undirected connected graph with `n` nodes labeled from 0 to `n - 1` and a 2D integer array `edges` where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>]</code> denotes an undirected edge between node <code>u<sub>i</sub></code> and node <code>v<sub>i</sub></code> with weight <code>w<sub>i</sub></code>, and an integer `k`.

You are allowed to remove any number of edges from the graph such that the resulting graph has **at most** `k` connected components.

The **cost** of a component is defined as the **maximum** edge weight in that component. If a component has no edges, its cost is 0.

Return the **minimum** possible value of the **maximum** cost among all components **after such removals**.

**Example 1:**

**Input:** n = 5, edges = [[0,1,4],[1,2,3],[1,3,2],[3,4,6]], k = 2

**Output:** 4

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/04/19/minimizemaximumm.jpg)

*   Remove the edge between nodes 3 and 4 (weight 6).
*   The resulting components have costs of 0 and 4, so the overall maximum cost is 4.

**Example 2:**

**Input:** n = 4, edges = [[0,1,5],[1,2,5],[2,3,5]], k = 1

**Output:** 5

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/04/19/minmax2.jpg)

*   No edge can be removed, since allowing only one component (`k = 1`) requires the graph to stay fully connected.
*   That single component’s cost equals its largest edge weight, which is 5.

**Constraints:**

*   <code>1 <= n <= 5 * 10<sup>4</sup></code>
*   <code>0 <= edges.length <= 10<sup>5</sup></code>
*   `edges[i].length == 3`
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> < n</code>
*   <code>1 <= w<sub>i</sub> <= 10<sup>6</sup></code>
*   `1 <= k <= n`
*   The input graph is connected.