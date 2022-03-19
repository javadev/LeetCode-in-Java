1339\. Maximum Product of Splitted Binary Tree

Medium

Given the `root` of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.

Return _the maximum product of the sums of the two subtrees_. Since the answer may be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Note** that you need to maximize the answer before taking the mod and not after taking it.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/01/21/sample_1_1699.png)

**Input:** root = [1,2,3,4,5,6]

**Output:** 110

**Explanation:** Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11\*10)

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/01/21/sample_2_1699.png)

**Input:** root = [1,null,2,3,4,null,null,5,6]

**Output:** 90

**Explanation:** Remove the red edge and get 2 binary trees with sum 15 and 6.Their product is 90 (15\*6)

**Constraints:**

*   The number of nodes in the tree is in the range <code>[2, 5 * 10<sup>4</sup>]</code>.
*   <code>1 <= Node.val <= 10<sup>4</sup></code>