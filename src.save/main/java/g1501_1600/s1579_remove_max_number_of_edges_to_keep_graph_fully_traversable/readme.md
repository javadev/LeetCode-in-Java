1579\. Remove Max Number of Edges to Keep Graph Fully Traversable

Hard

Alice and Bob have an undirected graph of `n` nodes and 3 types of edges:

*   Type 1: Can be traversed by Alice only.
*   Type 2: Can be traversed by Bob only.
*   Type 3: Can by traversed by both Alice and Bob.

Given an array `edges` where <code>edges[i] = [type<sub>i</sub>, u<sub>i</sub>, v<sub>i</sub>]</code> represents a bidirectional edge of type <code>type<sub>i</sub></code> between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>, find the maximum number of edges you can remove so that after removing the edges, the graph can still be fully traversed by both Alice and Bob. The graph is fully traversed by Alice and Bob if starting from any node, they can reach all other nodes.

Return _the maximum number of edges you can remove, or return_ `-1` _if it's impossible for the graph to be fully traversed by Alice and Bob._

**Example 1:**

**![](https://assets.leetcode.com/uploads/2020/08/19/ex1.png)**

**Input:** n = 4, edges = [[3,1,2],[3,2,3],[1,1,3],[1,2,4],[1,1,2],[2,3,4]]

**Output:** 2

**Explanation:** If we remove the 2 edges [1,1,2] and [1,1,3]. The graph will still be fully traversable by Alice and Bob. Removing any additional edge will not make it so. So the maximum number of edges we can remove is 2.

**Example 2:**

**![](https://assets.leetcode.com/uploads/2020/08/19/ex2.png)**

**Input:** n = 4, edges = [[3,1,2],[3,2,3],[1,1,4],[2,1,4]]

**Output:** 0

**Explanation:** Notice that removing any edge will not make the graph fully traversable by Alice and Bob.

**Example 3:**

**![](https://assets.leetcode.com/uploads/2020/08/19/ex3.png)**

**Input:** n = 4, edges = [[3,2,3],[1,1,2],[2,3,4]]

**Output:** -1

**Explanation:** In the current graph, Alice cannot reach node 4 from the other nodes. Likewise, Bob cannot reach 1. Therefore it's impossible to make the graph fully traversable.

**Constraints:**

*   `1 <= n <= 10^5`
*   `1 <= edges.length <= min(10^5, 3 * n * (n-1) / 2)`
*   `edges[i].length == 3`
*   `1 <= edges[i][0] <= 3`
*   `1 <= edges[i][1] < edges[i][2] <= n`
*   All tuples <code>(type<sub>i</sub>, u<sub>i</sub>, v<sub>i</sub>)</code> are distinct.