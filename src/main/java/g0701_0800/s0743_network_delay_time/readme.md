743\. Network Delay Time

Medium

You are given a network of `n` nodes, labeled from `1` to `n`. You are also given `times`, a list of travel times as directed edges <code>times[i] = (u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>)</code>, where <code>u<sub>i</sub></code> is the source node, <code>v<sub>i</sub></code> is the target node, and <code>w<sub>i</sub></code> is the time it takes for a signal to travel from source to target.

We will send a signal from a given node `k`. Return the time it takes for all the `n` nodes to receive the signal. If it is impossible for all the `n` nodes to receive the signal, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/05/23/931_example_1.png)

**Input:** times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2

**Output:** 2

**Example 2:**

**Input:** times = [[1,2,1]], n = 2, k = 1

**Output:** 1

**Example 3:**

**Input:** times = [[1,2,1]], n = 2, k = 2

**Output:** -1

**Constraints:**

*   `1 <= k <= n <= 100`
*   `1 <= times.length <= 6000`
*   `times[i].length == 3`
*   <code>1 <= u<sub>i</sub>, v<sub>i</sub> <= n</code>
*   <code>u<sub>i</sub> != v<sub>i</sub></code>
*   <code>0 <= w<sub>i</sub> <= 100</code>
*   All the pairs <code>(u<sub>i</sub>, v<sub>i</sub>)</code> are **unique**. (i.e., no multiple edges.)