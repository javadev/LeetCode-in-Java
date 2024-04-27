3112\. Minimum Time to Visit Disappearing Nodes

Medium

There is an undirected graph of `n` nodes. You are given a 2D array `edges`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, length<sub>i</sub>]</code> describes an edge between node <code>u<sub>i</sub></code> and node <code>v<sub>i</sub></code> with a traversal time of <code>length<sub>i</sub></code> units.

Additionally, you are given an array `disappear`, where `disappear[i]` denotes the time when the node `i` disappears from the graph and you won't be able to visit it.

**Notice** that the graph might be disconnected and might contain multiple edges.

Return the array `answer`, with `answer[i]` denoting the **minimum** units of time required to reach node `i` from node 0. If node `i` is **unreachable** from node 0 then `answer[i]` is `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2024/03/09/example1.png)

**Input:** n = 3, edges = [[0,1,2],[1,2,1],[0,2,4]], disappear = [1,1,5]

**Output:** [0,-1,4]

**Explanation:**

We are starting our journey from node 0, and our goal is to find the minimum time required to reach each node before it disappears.

*   For node 0, we don't need any time as it is our starting point.
*   For node 1, we need at least 2 units of time to traverse `edges[0]`. Unfortunately, it disappears at that moment, so we won't be able to visit it.
*   For node 2, we need at least 4 units of time to traverse `edges[2]`.

**Example 2:**

![](https://assets.leetcode.com/uploads/2024/03/09/example2.png)

**Input:** n = 3, edges = [[0,1,2],[1,2,1],[0,2,4]], disappear = [1,3,5]

**Output:** [0,2,3]

**Explanation:**

We are starting our journey from node 0, and our goal is to find the minimum time required to reach each node before it disappears.

*   For node 0, we don't need any time as it is the starting point.
*   For node 1, we need at least 2 units of time to traverse `edges[0]`.
*   For node 2, we need at least 3 units of time to traverse `edges[0]` and `edges[1]`.

**Example 3:**

**Input:** n = 2, edges = [[0,1,1]], disappear = [1,1]

**Output:** [0,-1]

**Explanation:**

Exactly when we reach node 1, it disappears.

**Constraints:**

*   <code>1 <= n <= 5 * 10<sup>4</sup></code>
*   <code>0 <= edges.length <= 10<sup>5</sup></code>
*   <code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>, length<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
*   <code>1 <= length<sub>i</sub> <= 10<sup>5</sup></code>
*   `disappear.length == n`
*   <code>1 <= disappear[i] <= 10<sup>5</sup></code>