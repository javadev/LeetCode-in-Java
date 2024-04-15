1791\. Find Center of Star Graph

Easy

There is an undirected **star** graph consisting of `n` nodes labeled from `1` to `n`. A star graph is a graph where there is one **center** node and **exactly** `n - 1` edges that connect the center node with every other node.

You are given a 2D integer array `edges` where each <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that there is an edge between the nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>. Return the center of the given star graph.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/24/star_graph.png)

**Input:** edges = [[1,2],[2,3],[4,2]]

**Output:** 2

**Explanation:** As shown in the figure above, node 2 is connected to every other node, so 2 is the center. 

**Example 2:**

**Input:** edges = [[1,2],[5,1],[1,3],[1,4]]

**Output:** 1 

**Constraints:**

*   <code>3 <= n <= 10<sup>5</sup></code>
*   `edges.length == n - 1`
*   `edges[i].length == 2`
*   <code>1 <= u<sub>i,</sub> v<sub>i</sub> <= n</code>
*   <code>u<sub>i</sub> != v<sub>i</sub></code>
*   The given `edges` represent a valid star graph.