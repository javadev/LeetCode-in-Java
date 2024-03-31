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

To solve this problem in Java with a `Solution` class, we'll use a breadth-first search (BFS) traversal approach. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `levelOrder` method**: This method takes the root node of the binary tree as input and returns the level order traversal of its nodes' values.

3. **Check for null root**: Check if the root is null. If so, return an empty list since there are no nodes to traverse.

4. **Initialize a queue**: We'll use a queue to perform BFS traversal. Add the root node to the queue.

5. **Traverse the tree level by level**:
   - Start a loop that continues until the queue is empty.
   - Inside the loop, for each level, get the size of the queue (number of nodes at the current level).
   - Create a list to store the node values at the current level.
   - Iterate through all nodes at the current level:
     - Poll a node from the queue.
     - Add its value to the list.
     - If the node has left or right children, add them to the queue.
   - After processing all nodes at the current level, add the list of node values to the result list.

6. **Return the result**: After traversing the entire tree, return the result containing the level order traversal.

Here's the Java implementation:

```java
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) return result; // Check for empty tree
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // Add root to the queue
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Get the number of nodes at the current level
            List<Integer> levelNodes = new ArrayList<>(); // List to store node values at current level
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // Remove node from the queue
                levelNodes.add(node.val); // Add its value to the list
                
                // Add left and right children to the queue if they exist
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(levelNodes); // Add list of node values at current level to result
        }
        
        return result;
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

This implementation follows the steps outlined above and efficiently solves the problem of binary tree level order traversal in Java.