**Time Complexity (Big O Time):**

1. **push(int val):** The `push` operation has a time complexity of O(1). It involves creating a new node and updating pointers, both of which are constant time operations.

2. **pop():** The `pop` operation also has a time complexity of O(1). It simply involves moving the `currentNode` pointer to the previous node.

3. **top():** The `top` operation has a time complexity of O(1) because it directly accesses the `data` field of the current node.

4. **getMin():** The `getMin` operation has a time complexity of O(1) because it directly accesses the `min` field of the current node.

Overall, all the stack operations (push, pop, top, getMin) have a constant time complexity of O(1).

**Space Complexity (Big O Space):**

The space complexity of this MinStack implementation is O(N), where N is the number of elements pushed onto the stack. 

- Each element pushed onto the stack consumes space for a new node, which contains integer values (`min`, `data`), a reference to the previous node (`previousNode`), and a reference to the next node (`nextNode`).
- As you push more elements onto the stack, the memory usage increases linearly with the number of elements.

It's important to note that the space complexity is related to the number of elements in the stack (N), not the total number of operations performed. Each element added to the stack consumes additional memory.

In summary, the time complexity of all stack operations is O(1), and the space complexity is O(N), where N is the number of elements pushed onto the stack.
