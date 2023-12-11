**Time Complexity (Big O Time):**

The time complexity of the program is determined by the number of nodes it visits in the binary tree.

- In the worst case, the program visits all nodes in the binary tree, making a recursive call for each node in a post-order traversal fashion.

- For each node, it performs a constant amount of work (comparing values and checking if `left` and `right` are not `null`).

- Therefore, the time complexity of the program is O(n), where "n" is the number of nodes in the binary tree.

**Space Complexity (Big O Space):**

The space complexity of the program is determined by the space used in the recursive call stack.

- In the worst case, the depth of the recursive call stack is equal to the height of the binary tree.

- If the binary tree is balanced (height "h" is O(log n)), the space complexity is O(log n) because that's the maximum depth of the recursive call stack.

- If the binary tree is skewed (height "h" is O(n)), the space complexity is O(n) because the depth of the recursive call stack can be as large as "n."

In summary, the space complexity can be O(log n) in the best-case scenario (balanced tree) and O(n) in the worst-case scenario (skewed tree).
