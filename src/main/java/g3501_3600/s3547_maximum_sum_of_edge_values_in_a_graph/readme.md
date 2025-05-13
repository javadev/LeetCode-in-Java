3547\. Maximum Sum of Edge Values in a Graph

Hard

You are given an **und****irected** graph of `n` nodes, numbered from `0` to `n - 1`. Each node is connected to **at most** 2 other nodes.

The graph consists of `m` edges, represented by a 2D array `edges`, where <code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that there is an edge between nodes <code>a<sub>i</sub></code> and <code>b<sub>i</sub></code>.

You have to assign a **unique** value from `1` to `n` to each node. The value of an edge will be the **product** of the values assigned to the two nodes it connects.

Your score is the sum of the values of all edges in the graph.

Return the **maximum** score you can achieve.

**Example 1:**

![](https://assets.leetcode.com/uploads/2025/03/23/graphproblemex1drawio.png)

**Input:** n = 7, edges = [[0,1],[1,2],[2,0],[3,4],[4,5],[5,6]]

**Output:** 130

**Explanation:**

The diagram above illustrates an optimal assignment of values to nodes. The sum of the values of the edges is: `(7 * 6) + (7 * 5) + (6 * 5) + (1 * 3) + (3 * 4) + (4 * 2) = 130`.

**Example 2:**

![](https://assets.leetcode.com/uploads/2025/03/23/graphproblemex2drawio.png)

**Input:** n = 6, edges = [[0,3],[4,5],[2,0],[1,3],[2,4],[1,5]]

**Output:** 82

**Explanation:**

The diagram above illustrates an optimal assignment of values to nodes. The sum of the values of the edges is: `(1 * 2) + (2 * 4) + (4 * 6) + (6 * 5) + (5 * 3) + (3 * 1) = 82`.

**Constraints:**

*   <code>1 <= n <= 5 * 10<sup>4</sup></code>
*   `m == edges.length`
*   `1 <= m <= n`
*   `edges[i].length == 2`
*   <code>0 <= a<sub>i</sub>, b<sub>i</sub> < n</code>
*   <code>a<sub>i</sub> != b<sub>i</sub></code>
*   There are no repeated edges.
*   Each node is connected to at most 2 other nodes.