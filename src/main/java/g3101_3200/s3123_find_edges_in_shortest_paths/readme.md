3123\. Find Edges in Shortest Paths

Hard

You are given an undirected weighted graph of `n` nodes numbered from 0 to `n - 1`. The graph consists of `m` edges represented by a 2D array `edges`, where <code>edges[i] = [a<sub>i</sub>, b<sub>i</sub>, w<sub>i</sub>]</code> indicates that there is an edge between nodes <code>a<sub>i</sub></code> and <code>b<sub>i</sub></code> with weight <code>w<sub>i</sub></code>.

Consider all the shortest paths from node 0 to node `n - 1` in the graph. You need to find a **boolean** array `answer` where `answer[i]` is `true` if the edge `edges[i]` is part of **at least** one shortest path. Otherwise, `answer[i]` is `false`.

Return the array `answer`.

**Note** that the graph may not be connected.

**Example 1:**

![](https://assets.leetcode.com/uploads/2024/03/05/graph35drawio-1.png)

**Input:** n = 6, edges = [[0,1,4],[0,2,1],[1,3,2],[1,4,3],[1,5,1],[2,3,1],[3,5,3],[4,5,2]]

**Output:** [true,true,true,false,true,true,true,false]

**Explanation:**

The following are **all** the shortest paths between nodes 0 and 5:

*   The path `0 -> 1 -> 5`: The sum of weights is `4 + 1 = 5`.
*   The path `0 -> 2 -> 3 -> 5`: The sum of weights is `1 + 1 + 3 = 5`.
*   The path `0 -> 2 -> 3 -> 1 -> 5`: The sum of weights is `1 + 1 + 2 + 1 = 5`.

**Example 2:**

![](https://assets.leetcode.com/uploads/2024/03/05/graphhhh.png)

**Input:** n = 4, edges = [[2,0,1],[0,1,1],[0,3,4],[3,2,2]]

**Output:** [true,false,false,true]

**Explanation:**

There is one shortest path between nodes 0 and 3, which is the path `0 -> 2 -> 3` with the sum of weights `1 + 2 = 3`.

**Constraints:**

*   <code>2 <= n <= 5 * 10<sup>4</sup></code>
*   `m == edges.length`
*   <code>1 <= m <= min(5 * 10<sup>4</sup>, n * (n - 1) / 2)</code>
*   <code>0 <= a<sub>i</sub>, b<sub>i</sub> < n</code>
*   <code>a<sub>i</sub> != b<sub>i</sub></code>
*   <code>1 <= w<sub>i</sub> <= 10<sup>5</sup></code>
*   There are no repeated edges.