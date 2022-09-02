700\. Search in a Binary Search Tree

Easy

You are given the `root` of a binary search tree (BST) and an integer `val`.

Find the node in the BST that the node's value equals `val` and return the subtree rooted with that node. If such a node does not exist, return `null`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/01/12/tree1.jpg)

**Input:** root = [4,2,7,1,3], val = 2

**Output:** [2,1,3] 

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/01/12/tree2.jpg)

**Input:** root = [4,2,7,1,3], val = 5

**Output:** [] 

**Constraints:**

*   The number of nodes in the tree is in the range `[1, 5000]`.
*   <code>1 <= Node.val <= 10<sup>7</sup></code>
*   `root` is a binary search tree.
*   <code>1 <= val <= 10<sup>7</sup></code>