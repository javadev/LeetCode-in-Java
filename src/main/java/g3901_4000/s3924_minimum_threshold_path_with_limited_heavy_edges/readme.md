3924\. Minimum Threshold Path With Limited Heavy Edges

Hard

There is an undirected weighted graph with `n` nodes labeled from 0 to `n - 1`.

The graph is represented by a 2D integer array `edges`, where each edge <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>]</code> indicates that there is an undirected edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code> with weight <code>w<sub>i</sub></code>.

You are also given integers `source`, `target` and `k`.

A `threshold` value determines whether an edge is considered **light** or **heavy**:

*   An edge is **light** if its weight is **less than** or **equal** to `threshold`.

*   An edge is **heavy** if its weight is **greater than** `threshold`.


A path from `source` to `target` is **valid** if it contains **at most** `k` heavy edges.

Return the **minimum integer** `threshold` such that **at least** one **valid** path exists from `source` to `target`. If no such path exists, return -1.

**Example 1:**

![](https://assets.leetcode.com/uploads/2025/10/13/g6.png)

**Input:** n = 6, edges = [[0,1,5],[1,2,3],[3,4,4],[4,5,1],[1,4,2]], source = 0, target = 3, k = 1

**Output:** 4

**Explanation:**

The minimum `threshold` such that a path from node 0 to node 3 uses at most 1 heavy edge is 4.

*   Light edges: `[1, 2, 3]`, `[3, 4, 4]`, `[4, 5, 1]`, `[1, 4, 2]`

*   Heavy edges: `[0, 1, 5]`


A valid path is `0 → 1 → 4 → 3`. It uses only 1 heavy edge (`[0, 1, 5]`), which satisfies the limit `k = 1`.

Any smaller `threshold` would make it impossible to reach node 3 without exceeding 1 heavy edge.

**Example 2:**

![](https://assets.leetcode.com/uploads/2025/10/12/g3_f.png)

**Input:** n = 6, edges = [[0,1,3],[1,2,4],[3,4,5],[4,5,6]], source = 0, target = 4, k = 1

**Output:** \-1

**Explanation:**

There is no path from node 0 to node 4. Since the target cannot be reached, the output is -1.

**Example 3:**

**![](https://assets.leetcode.com/uploads/2025/10/12/g5.png)**

**Input:** n = 4, edges = [[0,1,2],[1,2,2],[2,3,2],[3,0,2]], source = 0, target = 0, k = 0

**Output:** 0

**Explanation:**

The source and target are the same node. No edges need to be traversed, so the minimum `threshold` is 0.

**Constraints:**

*   <code>1 <= n <= 10<sup>3</sup></code>
*   <code>0 <= edges.length <= 10<sup>3</sup></code>
*   <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
*   <code>1 <= w<sub>i</sub> <= 10<sup>9</sup></code>
*   `0 <= source, target <= n - 1`
*   `0 <= k <= edges.length`