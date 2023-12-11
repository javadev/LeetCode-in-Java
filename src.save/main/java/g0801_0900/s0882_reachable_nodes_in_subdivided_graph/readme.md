882\. Reachable Nodes In Subdivided Graph

Hard

You are given an undirected graph (the **"original graph"**) with `n` nodes labeled from `0` to `n - 1`. You decide to **subdivide** each edge in the graph into a chain of nodes, with the number of new nodes varying between each edge.

The graph is given as a 2D array of `edges` where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, cnt<sub>i</sub>]</code> indicates that there is an edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code> in the original graph, and <code>cnt<sub>i</sub></code> is the total number of new nodes that you will **subdivide** the edge into. Note that <code>cnt<sub>i</sub> == 0</code> means you will not subdivide the edge.

To **subdivide** the edge <code>[u<sub>i</sub>, v<sub>i</sub>]</code>, replace it with <code>(cnt<sub>i</sub> + 1)</code> new edges and <code>cnt<sub>i</sub></code> new nodes. The new nodes are <code>x<sub>1</sub></code>, <code>x<sub>2</sub></code>, ..., <code>x<sub>cnt<sub>i</sub></sub></code>, and the new edges are <code>[u<sub>i</sub>, x<sub>1</sub>]</code>, <code>[x<sub>1</sub>, x<sub>2</sub>]</code>, <code>[x<sub>2</sub>, x<sub>3</sub>]</code>, ..., <code>[x<sub>cnt<sub>i</sub>-1</sub>, x<sub>cnt<sub>i</sub></sub>]</code>, <code>[x<sub>cnt<sub>i</sub></sub>, v<sub>i</sub>]</code>.

In this **new graph**, you want to know how many nodes are **reachable** from the node `0`, where a node is **reachable** if the distance is `maxMoves` or less.

Given the original graph and `maxMoves`, return _the number of nodes that are **reachable** from node_ `0` _in the new graph_.

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/01/origfinal.png)

**Input:** edges = [[0,1,10],[0,2,1],[1,2,2]], maxMoves = 6, n = 3

**Output:** 13

**Explanation:** The edge subdivisions are shown in the image above. The nodes that are reachable are highlighted in yellow.

**Example 2:**

**Input:** edges = [[0,1,4],[1,2,6],[0,2,8],[1,3,1]], maxMoves = 10, n = 4

**Output:** 23

**Example 3:**

**Input:** edges = [[1,2,4],[1,4,5],[1,3,1],[2,3,4],[3,4,5]], maxMoves = 17, n = 5

**Output:** 1

**Explanation:** Node 0 is disconnected from the rest of the graph, so only node 0 is reachable.

**Constraints:**

*   <code>0 <= edges.length <= min(n * (n - 1) / 2, 10<sup>4</sup>)</code>
*   `edges[i].length == 3`
*   <code>0 <= u<sub>i</sub> < v<sub>i</sub> < n</code>
*   There are **no multiple edges** in the graph.
*   <code>0 <= cnt<sub>i</sub> <= 10<sup>4</sup></code>
*   <code>0 <= maxMoves <= 10<sup>9</sup></code>
*   `1 <= n <= 3000`