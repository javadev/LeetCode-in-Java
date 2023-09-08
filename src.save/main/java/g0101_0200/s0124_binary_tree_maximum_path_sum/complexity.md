**Time Complexity (Big O Time):**

The time complexity of the program is determined by the recursive traversal of the binary tree. Here's the breakdown:

- The program uses a recursive function `helper` to traverse the binary tree.

- In the worst case, the program visits each node of the binary tree exactly once. Therefore, the time complexity of this program is O(N), where N is the number of nodes in the binary tree.

- Within each function call, there are constant-time operations such as comparisons and arithmetic operations.

- Therefore, the dominant factor in the time complexity is the traversal of the tree, which is O(N).

**Space Complexity (Big O Space):**

The space complexity of the program is primarily determined by the call stack during the recursive traversal. Here's the analysis:

- In the worst case, the maximum depth of the call stack is equal to the height of the binary tree.

- In the case of a balanced binary tree, the height is approximately log₂(N), where N is the number of nodes. Therefore, the space complexity of the program can be approximated as O(log N) for balanced trees.

- In the worst case scenario of an unbalanced tree, the height can be as large as N, leading to a space complexity of O(N) for pathological cases.

- Additionally, the program uses a few integer variables (`max`, `left`, `right`, and `current`) that occupy constant space, regardless of the tree's size.

- Therefore, the overall space complexity of the program is O(N) in the worst case due to the call stack's space usage during recursion, and it can be considered O(log N) for balanced trees.

In summary, the time complexity of the program is O(N), where N is the number of nodes in the binary tree, and the space complexity is O(N) in the worst case due to the call stack space during recursion, but it can be more space-efficient (O(log N)) for balanced trees. The program efficiently finds the maximum path sum in the binary tree.
