687\. Longest Univalue Path

Medium

Given the `root` of a binary tree, return _the length of the longest path, where each node in the path has the same value_. This path may or may not pass through the root.

**The length of the path** between two nodes is represented by the number of edges between them.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/13/ex1.jpg)

**Input:** root = [5,4,5,1,1,5]

**Output:** 2

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/13/ex2.jpg)

**Input:** root = [1,4,5,4,4,5]

**Output:** 2

**Constraints:**

*   The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.
*   `-1000 <= Node.val <= 1000`
*   The depth of the tree will not exceed `1000`.