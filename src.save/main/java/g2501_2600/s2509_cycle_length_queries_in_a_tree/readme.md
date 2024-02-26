2509\. Cycle Length Queries in a Tree

Hard

You are given an integer `n`. There is a **complete binary tree** with <code>2<sup>n</sup> - 1</code> nodes. The root of that tree is the node with the value `1`, and every node with a value `val` in the range <code>[1, 2<sup>n - 1</sup> - 1]</code> has two children where:

*   The left node has the value `2 * val`, and
*   The right node has the value `2 * val + 1`.

You are also given a 2D integer array `queries` of length `m`, where <code>queries[i] = [a<sub>i</sub>, b<sub>i</sub>]</code>. For each query, solve the following problem:

1.  Add an edge between the nodes with values <code>a<sub>i</sub></code> and <code>b<sub>i</sub></code>.
2.  Find the length of the cycle in the graph.
3.  Remove the added edge between nodes with values <code>a<sub>i</sub></code> and <code>b<sub>i</sub></code>.

**Note** that:

*   A **cycle** is a path that starts and ends at the same node, and each edge in the path is visited only once.
*   The length of a cycle is the number of edges visited in the cycle.
*   There could be multiple edges between two nodes in the tree after adding the edge of the query.

Return _an array_ `answer` _of length_ `m` _where_ `answer[i]` _is the answer to the_ <code>i<sup>th</sup></code> _query._

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/10/25/bexample1.png)

**Input:** n = 3, queries = [[5,3],[4,7],[2,3]]

**Output:** [4,5,3]

**Explanation:** The diagrams above show the tree of 2<sup>3</sup> - 1 nodes. Nodes colored in red describe the nodes in the cycle after adding the edge. 

- After adding the edge between nodes 3 and 5, the graph contains a cycle of nodes [5,2,1,3]. Thus answer to the first query is 4. We delete the added edge and process the next query. 

- After adding the edge between nodes 4 and 7, the graph contains a cycle of nodes [4,2,1,3,7]. Thus answer to the second query is 5. We delete the added edge and process the next query. 

- After adding the edge between nodes 2 and 3, the graph contains a cycle of nodes [2,1,3]. Thus answer to the third query is 3. We delete the added edge.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/10/25/aexample2.png)

**Input:** n = 2, queries = [[1,2]]

**Output:** [2]

**Explanation:** The diagram above shows the tree of 2<sup>2</sup> - 1 nodes. Nodes colored in red describe the nodes in the cycle after adding the edge. 

- After adding the edge between nodes 1 and 2, the graph contains a cycle of nodes [2,1]. Thus answer for the first query is 2. We delete the added edge.

**Constraints:**

*   `2 <= n <= 30`
*   `m == queries.length`
*   <code>1 <= m <= 10<sup>5</sup></code>
*   `queries[i].length == 2`
*   <code>1 <= a<sub>i</sub>, b<sub>i</sub> <= 2<sup>n</sup> - 1</code>
*   <code>a<sub>i</sub> != b<sub>i</sub></code>