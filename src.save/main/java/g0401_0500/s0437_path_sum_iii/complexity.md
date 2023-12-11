**Time Complexity (Big O Time):**

The time complexity of the program primarily depends on two recursive functions:

1. `pathSum(TreeNode root, int targetSum)`: This function is the main driver of the calculation. It traverses the entire tree and calls the `helper` function for each node. In the worst case, it visits all nodes of the binary tree once. Therefore, its time complexity is O(n), where 'n' is the number of nodes in the tree.

2. `helper(TreeNode node, int targetSum, long currSum)`: This function recursively explores all possible paths from a given node downward to its descendants. In the worst case, it traverses all paths from the root to leaf nodes. Since each node is visited once, the time complexity of this function is also O(n).

Combining both functions, the overall time complexity of the program is O(n), where 'n' is the number of nodes in the binary tree.

**Space Complexity (Big O Space):**

The space complexity of the program is primarily determined by the function call stack during recursion and the constant space used for variables:

1. Function Call Stack: The maximum depth of the call stack is the height of the binary tree. In the worst case, when the tree is skewed (completely unbalanced), the height can be 'n,' making the space complexity due to the call stack O(n).

2. Various integer variables used for iteration and intermediate calculations: These variables require constant space, O(1).

Combining these factors, the dominant factor in the space complexity is the call stack, which can grow up to O(n) in the worst case.

In summary, the provided program has a time complexity of O(n) and a space complexity of O(n), where 'n' is the number of nodes in the binary tree.
