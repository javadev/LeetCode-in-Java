617\. Merge Two Binary Trees

Easy

You are given two binary trees `root1` and `root2`.

Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.

Return _the merged tree_.

**Note:** The merging process must start from the root nodes of both trees.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/05/merge.jpg)

**Input:** root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]

**Output:** [3,4,5,5,4,null,7] 

**Example 2:**

**Input:** root1 = [1], root2 = [1,2]

**Output:** [2,2] 

**Constraints:**

*   The number of nodes in both trees is in the range `[0, 2000]`.
*   <code>-10<sup>4</sup> <= Node.val <= 10<sup>4</sup></code>