3910\. Count Connected Subgraphs with Even Node Sum

Hard

You are given an undirected graph with `n` nodes labeled from 0 to `n - 1`. Node `i` has a **value** of `nums[i]`, which is either 0 or 1. The edges of the graph are given by a 2D array `edges` where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> represents an edge between node <code>u<sub>i</sub></code> and node <code>v<sub>i</sub></code>.

For a **non-empty subset** `s` of nodes in the graph, we consider the **induced subgraph** of `s` generated as follows:

*   We keep only the nodes in `s`.
*   We keep only the edges whose two endpoints are both in `s`.

Return an integer representing the number of **non-empty** subsets `s` of nodes in the graph such that:

*   The **induced subgraph** of `s` is **connected**.
*   The **sum** of node **values** in `s` is **even**.

**Example 1:**

**Input:** nums = [1,0,1], edges = [[0,1],[1,2]]

**Output:** 2

**Explanation:**

`s`

connected?

sum of node values

counted?

`[0]`

Yes

1

No

`[1]`

Yes

0

Yes

`[2]`

Yes

1

No

`[0,1]`

Yes

1

No

`[0,2]`

No, node 0 and node 2 are disconnected.

2

No

`[1,2]`

Yes

1

No

`[0,1,2]`

Yes

2

Yes

**Example 2:**

**Input:** nums = [1], edges = []

**Output:** 0

**Explanation:**

`s`

connected?

sum of node values

counted?

`[0]`

Yes

1

No

**Constraints:**

*   `1 <= n == nums.length <= 13`
*   `nums[i]` is 0 or 1.
*   `0 <= edges.length <= n * (n - 1) / 2`
*   <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub> < v<sub>i</sub> < n</code>
*   All edges are **distinct**.