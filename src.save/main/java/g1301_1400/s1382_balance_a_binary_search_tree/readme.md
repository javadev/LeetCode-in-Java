1382\. Balance a Binary Search Tree

Medium

Given the `root` of a binary search tree, return _a **balanced** binary search tree with the same node values_. If there is more than one answer, return **any of them**.

A binary search tree is **balanced** if the depth of the two subtrees of every node never differs by more than `1`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/08/10/balance1-tree.jpg)

**Input:** root = [1,null,2,null,3,null,4,null,null]

**Output:** [2,1,3,null,null,null,4]

**Explanation:** This is not the only correct answer, [3,1,4,null,2] is also correct. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/08/10/balanced2-tree.jpg)

**Input:** root = [2,1,3]

**Output:** [2,1,3] 

**Constraints:**

*   The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.
*   <code>1 <= Node.val <= 10<sup>5</sup></code>