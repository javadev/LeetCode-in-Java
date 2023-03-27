1483\. Kth Ancestor of a Tree Node

Hard

You are given a tree with `n` nodes numbered from `0` to `n - 1` in the form of a parent array `parent` where `parent[i]` is the parent of <code>i<sup>th</sup></code> node. The root of the tree is node `0`. Find the <code>k<sup>th</sup></code> ancestor of a given node.

The <code>k<sup>th</sup></code> ancestor of a tree node is the <code>k<sup>th</sup></code> node in the path from that node to the root node.

Implement the `TreeAncestor` class:

*   `TreeAncestor(int n, int[] parent)` Initializes the object with the number of nodes in the tree and the parent array.
*   `int getKthAncestor(int node, int k)` return the <code>k<sup>th</sup></code> ancestor of the given node `node`. If there is no such ancestor, return `-1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/08/28/1528_ex1.png)

**Input** ["TreeAncestor", "getKthAncestor", "getKthAncestor", "getKthAncestor"] [[7, [-1, 0, 0, 1, 1, 2, 2]], [3, 1], [5, 2], [6, 3]]

**Output:** [null, 1, 0, -1]

**Explanation:**

TreeAncestor treeAncestor = new TreeAncestor(7, [-1, 0, 0, 1, 1, 2, 2]); 

treeAncestor.getKthAncestor(3, 1); // returns 1 which is the parent of 3

treeAncestor.getKthAncestor(5, 2); // returns 0 which is the grandparent of 5 

treeAncestor.getKthAncestor(6, 3); // returns -1 because there is no such ancestor

**Constraints:**

*   <code>1 <= k <= n <= 5 * 10<sup>4</sup></code>
*   `parent.length == n`
*   `parent[0] == -1`
*   `0 <= parent[i] < n` for all `0 < i < n`
*   `0 <= node < n`
*   There will be at most <code>5 * 10<sup>4</sup></code> queries.