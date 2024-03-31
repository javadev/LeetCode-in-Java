104\. Maximum Depth of Binary Tree

Easy

Given the `root` of a binary tree, return _its maximum depth_.

A binary tree's **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg)

**Input:** root = [3,9,20,null,null,15,7]

**Output:** 3 

**Example 2:**

**Input:** root = [1,null,2]

**Output:** 2 

**Example 3:**

**Input:** root = []

**Output:** 0 

**Example 4:**

**Input:** root = [0]

**Output:** 1 

**Constraints:**

*   The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.
*   `-100 <= Node.val <= 100`

To solve this problem in Java with a `Solution` class, we'll use a depth-first search (DFS) traversal approach. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `maxDepth` method**: This method takes the root node of the binary tree as input and returns its maximum depth.

3. **Check for null root**: Check if the root is null. If so, return 0, as an empty tree has a maximum depth of 0.

4. **Recursively calculate the maximum depth**: Define a helper method `dfs` to recursively calculate the maximum depth of the binary tree.
   - If the current node is null, return 0.
   - Otherwise, recursively calculate the maximum depth of the left and right subtrees.
   - Return the maximum depth of the left and right subtrees, plus 1 (to account for the current node).

5. **Return the maximum depth**: After traversing the entire tree, return the maximum depth calculated.

Here's the Java implementation:

```java
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // Check for empty tree
        return dfs(root); // Recursively calculate maximum depth
    }
    
    // Helper method to recursively calculate maximum depth
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = dfs(node.left); // Calculate maximum depth of left subtree
        int rightDepth = dfs(node.right); // Calculate maximum depth of right subtree
        return Math.max(leftDepth, rightDepth) + 1; // Return maximum depth plus 1 for current node
    }
    
    // TreeNode definition
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
```

This implementation follows the steps outlined above and efficiently solves the problem of finding the maximum depth of a binary tree in Java.