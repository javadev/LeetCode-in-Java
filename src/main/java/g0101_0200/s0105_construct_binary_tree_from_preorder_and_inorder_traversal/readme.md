105\. Construct Binary Tree from Preorder and Inorder Traversal

Medium

Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return _the binary tree_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/tree.jpg)

**Input:** preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]

**Output:** [3,9,20,null,null,15,7] 

**Example 2:**

**Input:** preorder = [-1], inorder = [-1]

**Output:** [-1] 

**Constraints:**

*   `1 <= preorder.length <= 3000`
*   `inorder.length == preorder.length`
*   `-3000 <= preorder[i], inorder[i] <= 3000`
*   `preorder` and `inorder` consist of **unique** values.
*   Each value of `inorder` also appears in `preorder`.
*   `preorder` is **guaranteed** to be the preorder traversal of the tree.
*   `inorder` is **guaranteed** to be the inorder traversal of the tree.

To solve the "Construct Binary Tree from Preorder and Inorder Traversal" problem in Java with a `Solution` class, we'll use a recursive approach. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `buildTree` method**: This method takes two integer arrays, `preorder` and `inorder`, as input and returns the constructed binary tree.

3. **Check for empty arrays**: Check if either of the arrays `preorder` or `inorder` is empty. If so, return null, as there's no tree to construct.

4. **Define a helper method**: Define a recursive helper method `build` to construct the binary tree.
   - The method should take the indices representing the current subtree in both `preorder` and `inorder`.
   - The start and end indices in `preorder` represent the current subtree's preorder traversal.
   - The start and end indices in `inorder` represent the current subtree's inorder traversal.
   
5. **Base case**: If the start index of `preorder` is greater than the end index or if the start index of `inorder` is greater than the end index, return null.

6. **Find the root node**: The root node is the first element in the `preorder` array.

7. **Find the root's position in `inorder`**: Iterate through the `inorder` array to find the root's position.

8. **Recursively build left and right subtrees**: 
   - Recursively call the `build` method for the left subtree with updated indices.
   - Recursively call the `build` method for the right subtree with updated indices.
   
9. **Return the root node**: After constructing the left and right subtrees, return the root node.

Here's the Java implementation:

```java
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null; // Check for empty arrays
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1); // Construct binary tree
    }
    
    // Recursive helper method to construct binary tree
    private TreeNode build(int[] preorder, int[] inorder, int preStart, preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null; // Base case
        
        int rootValue = preorder[preStart]; // Root node value
        TreeNode root = new TreeNode(rootValue); // Create root node
        
        // Find root node's position in inorder array
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        
        // Recursively build left and right subtrees
        root.left = build(preorder, inorder, preStart + 1, preStart + rootIndex - inStart, inStart, rootIndex - 1);
        root.right = build(preorder, inorder, preStart + rootIndex - inStart + 1, preEnd, rootIndex + 1, inEnd);
        
        return root; // Return root node
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

This implementation follows the steps outlined above and efficiently constructs the binary tree from preorder and inorder traversals in Java.