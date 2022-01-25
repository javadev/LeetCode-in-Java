236\. Lowest Common Ancestor of a Binary Tree

Medium

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow **a node to be a descendant of itself**).”

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/12/14/binarytree.png)

**Input:** root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1

**Output:** 3

**Explanation:** The LCA of nodes 5 and 1 is 3. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2018/12/14/binarytree.png)

**Input:** root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4

**Output:** 5

**Explanation:** The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition. 

**Example 3:**

**Input:** root = [1,2], p = 1, q = 2

**Output:** 1 

**Constraints:**

*   The number of nodes in the tree is in the range <code>[2, 10<sup>5</sup>]</code>.
*   <code>-10<sup>9</sup> <= Node.val <= 10<sup>9</sup></code>
*   All `Node.val` are **unique**.
*   `p != q`
*   `p` and `q` will exist in the tree.