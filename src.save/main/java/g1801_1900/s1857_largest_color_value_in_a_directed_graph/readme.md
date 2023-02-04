1857\. Largest Color Value in a Directed Graph

Hard

There is a **directed graph** of `n` colored nodes and `m` edges. The nodes are numbered from `0` to `n - 1`.

You are given a string `colors` where `colors[i]` is a lowercase English letter representing the **color** of the <code>i<sup>th</sup></code> node in this graph (**0-indexed**). You are also given a 2D array `edges` where <code>edges[j] = [a<sub>j</sub>, b<sub>j</sub>]</code> indicates that there is a **directed edge** from node <code>a<sub>j</sub></code> to node <code>b<sub>j</sub></code>.

A valid **path** in the graph is a sequence of nodes <code>x<sub>1</sub> -> x<sub>2</sub> -> x<sub>3</sub> -> ... -> x<sub>k</sub></code> such that there is a directed edge from <code>x<sub>i</sub></code> to <code>x<sub>i+1</sub></code> for every `1 <= i < k`. The **color value** of the path is the number of nodes that are colored the **most frequently** occurring color along that path.

Return _the **largest color value** of any valid path in the given graph, or_ `-1` _if the graph contains a cycle_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/21/leet1.png)

**Input:** colors = "abaca", edges = [[0,1],[0,2],[2,3],[3,4]]

**Output:** 3

**Explanation:** The path 0 -> 2 -> 3 -> 4 contains 3 nodes that are colored `"a" (red in the above image)`.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/04/21/leet2.png)

**Input:** colors = "a", edges = [[0,0]]

**Output:** -1

**Explanation:** There is a cycle from 0 to 0.

**Constraints:**

*   `n == colors.length`
*   `m == edges.length`
*   <code>1 <= n <= 10<sup>5</sup></code>
*   <code>0 <= m <= 10<sup>5</sup></code>
*   `colors` consists of lowercase English letters.
*   <code>0 <= a<sub>j</sub>, b<sub>j</sub> < n</code>