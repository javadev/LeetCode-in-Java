102\. Binary Tree Level Order Traversal

Medium

Given the `root` of a binary tree, return _the level order traversal of its nodes' values_. (i.e., from left to right, level by level).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg)

**Input:** root = [3,9,20,null,null,15,7]

**Output:** [[3],[9,20],[15,7]] 

**Example 2:**

**Input:** root = [1]

**Output:** [[1]] 

**Example 3:**

**Input:** root = []

**Output:** [] 

**Constraints:**

*   The number of nodes in the tree is in the range `[0, 2000]`.
*   `-1000 <= Node.val <= 1000`

To solve the "Binary Tree Level Order Traversal" problem in Java with a `Solution` class, we'll perform a breadth-first search (BFS) traversal of the binary tree. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `levelOrder` method**: This method takes the root node of the binary tree as input and returns the level order traversal of its nodes' values.

3. **Initialize a queue**: Create a queue to store the nodes during BFS traversal.

4. **Check for null root**: Check if the root is null. If it is, return an empty list.

5. **Perform BFS traversal**: Enqueue the root node into the queue. While the queue is not empty:
   - Dequeue the front node from the queue.
   - Add the value of the dequeued node to the current level list.
   - Enqueue the left and right children of the dequeued node if they exist.
   - Move to the next level when all nodes in the current level are processed.

6. **Return the result**: After the BFS traversal is complete, return the list containing the level order traversal of the binary tree.

Here's the Java implementation:

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // Initialize list to store level order traversal
        if (root == null) return result; // Check for empty tree
        
        Queue<TreeNode> queue = new LinkedList<>(); // Initialize queue for BFS traversal
        queue.offer(root); // Enqueue the root node
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Get the number of nodes in the current level
            List<Integer> level = new ArrayList<>(); // Initialize list for the current level
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // Dequeue the front node
                level.add(node.val); // Add node value to the current level list
                
                // Enqueue the left and right children if they exist
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            result.add(level); // Add the current level list to the result list
        }
        
        return result; // Return the level order traversal
    }
    
    // Definition for a TreeNode
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

This implementation follows the steps outlined above and efficiently computes the level order traversal of the binary tree in Java using BFS.