701\. Insert into a Binary Search Tree

Medium

You are given the `root` node of a binary search tree (BST) and a `value` to insert into the tree. Return _the root node of the BST after the insertion_. It is **guaranteed** that the new value does not exist in the original BST.

**Notice** that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return **any of them**.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/05/insertbst.jpg)

**Input:** root = [4,2,7,1,3], val = 5

**Output:** [4,2,7,1,3,5]

**Explanation:** Another accepted tree is: ![](https://assets.leetcode.com/uploads/2020/10/05/bst.jpg)

**Example 2:**

**Input:** root = [40,20,60,10,30,50,70], val = 25

**Output:** [40,20,60,10,30,50,70,null,null,25]

**Example 3:**

**Input:** root = [4,2,7,1,3,null,null,null,null,null,null], val = 5

**Output:** [4,2,7,1,3,5]

**Constraints:**

*   The number of nodes in the tree will be in the range <code>[0, 10<sup>4</sup>]</code>.
*   <code>-10<sup>8</sup> <= Node.val <= 10<sup>8</sup></code>
*   All the values `Node.val` are **unique**.
*   <code>-10<sup>8</sup> <= val <= 10<sup>8</sup></code>
*   It's **guaranteed** that `val` does not exist in the original BST.