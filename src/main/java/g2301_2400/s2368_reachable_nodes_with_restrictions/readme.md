2368\. Reachable Nodes With Restrictions

Medium

There is an undirected tree with `n` nodes labeled from `0` to `n - 1` and `n - 1` edges.

You are given a 2D integer array `edges` of length `n - 1` where <code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that there is an edge between nodes <code>a<sub>i</sub></code> and <code>b<sub>i</sub></code> in the tree. You are also given an integer array `restricted` which represents **restricted** nodes.

Return _the **maximum** number of nodes you can reach from node_ `0` _without visiting a restricted node._

Note that node `0` will **not** be a restricted node.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/06/15/ex1drawio.png)

**Input:** n = 7, edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], restricted = [4,5]

**Output:** 4

**Explanation:** The diagram above shows the tree. We have that [0,1,2,3] are the only nodes that can be reached from node 0 without visiting a restricted node.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/06/15/ex2drawio.png)

**Input:** n = 7, edges = [[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]], restricted = [4,2,1]

**Output:** 3

**Explanation:** The diagram above shows the tree. We have that [0,5,6] are the only nodes that can be reached from node 0 without visiting a restricted node.

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   `edges.length == n - 1`
*   `edges[i].length == 2`
*   <code>0 <= a<sub>i</sub>, b<sub>i</sub> < n</code>
*   <code>a<sub>i</sub> != b<sub>i</sub></code>
*   `edges` represents a valid tree.
*   `1 <= restricted.length < n`
*   `1 <= restricted[i] < n`
*   All the values of `restricted` are **unique**.