**Time Complexity (Big O Time):**

1. **First Pass**: In the first pass, the program iterates through the original linked list and creates a cloned node for each node in the original list. This operation takes O(N) time, where N is the number of nodes in the original list, as it processes each node once.

2. **Second Pass**: In the second pass, the program updates the random pointers of the cloned nodes based on the random pointers of the original nodes. This operation also takes O(N) time since it processes each node once.

3. **Third Pass**: In the third pass, the program separates the cloned linked list from the original linked list and restores the original linked list's next pointers. This final pass also takes O(N) time, as it processes each node once.

Overall, the time complexity of the program is O(N), where N is the number of nodes in the linked list. All three passes contribute linearly to the time complexity.

**Space Complexity (Big O Space):**

The space complexity of the program is O(N), where N is the number of nodes in the linked list. Here's how the space is allocated:

1. **Cloned Nodes**: During the first pass, the program creates cloned nodes for each node in the original linked list. This results in N additional nodes, each taking constant space. Therefore, the space used for the cloned nodes is O(N).

2. **Random Pointers**: No additional space is used for random pointers since the program manipulates the existing nodes in the original linked list to connect to their corresponding cloned nodes.

3. **New Head Node**: A single variable `newHead` is used to store the head of the cloned linked list. This variable takes constant space.

4. **Other Variables**: The program uses a few additional variables (`curr`, `clonedNode`) to traverse and manipulate the linked list. These variables take constant space.

Overall, the space complexity is O(N) due to the cloned nodes created during the first pass, which directly corresponds to the number of nodes in the linked list.
