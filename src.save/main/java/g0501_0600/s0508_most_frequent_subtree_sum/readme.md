508\. Most Frequent Subtree Sum

Medium

Given the `root` of a binary tree, return the most frequent **subtree sum**. If there is a tie, return all the values with the highest frequency in any order.

The **subtree sum** of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/24/freq1-tree.jpg)

**Input:** root = [5,2,-3]

**Output:** [2,-3,4]

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/04/24/freq2-tree.jpg)

**Input:** root = [5,2,-5]

**Output:** [2]c

**Constraints:**

*   The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.
*   <code>-10<sup>5</sup> <= Node.val <= 10<sup>5</sup></code>