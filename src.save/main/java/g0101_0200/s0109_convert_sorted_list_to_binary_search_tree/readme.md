109\. Convert Sorted List to Binary Search Tree

Medium

Given the `head` of a singly linked list where elements are **sorted in ascending order**, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of _every_ node never differ by more than 1.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/17/linked.jpg)

**Input:** head = [-10,-3,0,5,9]

**Output:** [0,-3,9,-10,null,5]

**Explanation:** One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST. 

**Example 2:**

**Input:** head = []

**Output:** [] 

**Example 3:**

**Input:** head = [0]

**Output:** [0] 

**Example 4:**

**Input:** head = [1,3]

**Output:** [3,1] 

**Constraints:**

*   The number of nodes in `head` is in the range <code>[0, 2 * 10<sup>4</sup>]</code>.
*   <code>-10<sup>5</sup> <= Node.val <= 10<sup>5</sup></code>