3604\. Minimum Time to Reach Destination in Directed Graph

Medium

You are given an integer `n` and a **directed** graph with `n` nodes labeled from 0 to `n - 1`. This is represented by a 2D array `edges`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, start<sub>i</sub>, end<sub>i</sub>]</code> indicates an edge from node <code>u<sub>i</sub></code> to <code>v<sub>i</sub></code> that can **only** be used at any integer time `t` such that <code>start<sub>i</sub> <= t <= end<sub>i</sub></code>.

You start at node 0 at time 0.

In one unit of time, you can either:

*   Wait at your current node without moving, or
*   Travel along an outgoing edge from your current node if the current time `t` satisfies <code>start<sub>i</sub> <= t <= end<sub>i</sub></code>.

Return the **minimum** time required to reach node `n - 1`. If it is impossible, return `-1`.

**Example 1:**

**Input:** n = 3, edges = [[0,1,0,1],[1,2,2,5]]

**Output:** 3

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/05/screenshot-2025-06-06-at-004535.png)

The optimal path is:

*   At time `t = 0`, take the edge `(0 → 1)` which is available from 0 to 1. You arrive at node 1 at time `t = 1`, then wait until `t = 2`.
*   At time ```t = `2` ```, take the edge `(1 → 2)` which is available from 2 to 5. You arrive at node 2 at time 3.

Hence, the minimum time to reach node 2 is 3.

**Example 2:**

**Input:** n = 4, edges = [[0,1,0,3],[1,3,7,8],[0,2,1,5],[2,3,4,7]]

**Output:** 5

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/05/screenshot-2025-06-06-at-004757.png)

The optimal path is:

*   Wait at node 0 until time `t = 1`, then take the edge `(0 → 2)` which is available from 1 to 5. You arrive at node 2 at `t = 2`.
*   Wait at node 2 until time `t = 4`, then take the edge `(2 → 3)` which is available from 4 to 7. You arrive at node 3 at `t = 5`.

Hence, the minimum time to reach node 3 is 5.

**Example 3:**

**Input:** n = 3, edges = [[1,0,1,3],[1,2,3,5]]

**Output:** \-1

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/05/screenshot-2025-06-06-at-004914.png)

*   Since there is no outgoing edge from node 0, it is impossible to reach node 2. Hence, the output is -1.

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>
*   <code>0 <= edges.length <= 10<sup>5</sup></code>
*   <code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>, start<sub>i</sub>, end<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
*   <code>u<sub>i</sub> != v<sub>i</sub></code>
*   <code>0 <= start<sub>i</sub> <= end<sub>i</sub> <= 10<sup>9</sup></code>