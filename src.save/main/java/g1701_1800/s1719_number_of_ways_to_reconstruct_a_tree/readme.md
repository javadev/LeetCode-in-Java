1719\. Number Of Ways To Reconstruct A Tree

Hard

You are given an array `pairs`, where <code>pairs[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>, and:

*   There are no duplicates.
*   <code>x<sub>i</sub> < y<sub>i</sub></code>

Let `ways` be the number of rooted trees that satisfy the following conditions:

*   The tree consists of nodes whose values appeared in `pairs`.
*   A pair <code>[x<sub>i</sub>, y<sub>i</sub>]</code> exists in `pairs` **if and only if** <code>x<sub>i</sub></code> is an ancestor of <code>y<sub>i</sub></code> or <code>y<sub>i</sub></code> is an ancestor of <code>x<sub>i</sub></code>.
*   **Note:** the tree does not have to be a binary tree.

Two ways are considered to be different if there is at least one node that has different parents in both ways.

Return:

*   `0` if `ways == 0`
*   `1` if `ways == 1`
*   `2` if `ways > 1`

A **rooted tree** is a tree that has a single root node, and all edges are oriented to be outgoing from the root.

An **ancestor** of a node is any node on the path from the root to that node (excluding the node itself). The root has no ancestors.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/12/03/trees2.png)

**Input:** pairs = [[1,2],[2,3]]

**Output:** 1

**Explanation:** There is exactly one valid rooted tree, which is shown in the above figure.

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/12/03/tree.png)

**Input:** pairs = [[1,2],[2,3],[1,3]]

**Output:** 2

**Explanation:** There are multiple valid rooted trees. Three of them are shown in the above figures.

**Example 3:**

**Input:** pairs = [[1,2],[2,3],[2,4],[1,5]]

**Output:** 0

**Explanation:** There are no valid rooted trees.

**Constraints:**

*   <code>1 <= pairs.length <= 10<sup>5</sup></code>
*   <code>1 <= x<sub>i</sub> < y<sub>i</sub> <= 500</code>
*   The elements in `pairs` are unique.