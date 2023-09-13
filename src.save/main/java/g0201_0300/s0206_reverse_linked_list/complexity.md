**Time Complexity (Big O Time):**

The time complexity of this program is O(N), where N is the number of nodes in the linked list. Here's why:

1. The program uses a `while` loop that iterates through the linked list once, visiting each node exactly once. Therefore, the number of iterations in the loop is proportional to the number of nodes in the list, which is N.

2. Inside the loop, there are constant-time operations. Assignments and pointer adjustments such as `curr.next = prev` take constant time regardless of the list's size.

3. Overall, the time complexity is linear, O(N), because the program performs a constant amount of work for each node in the list.

**Space Complexity (Big O Space):**

The space complexity of this program is O(1), which means it uses a constant amount of additional space regardless of the size of the input linked list. Here's why:

1. The program uses a constant number of variables (`prev`, `curr`, `next`), and the space required for these variables does not depend on the size of the linked list. Therefore, the space complexity is O(1) for auxiliary space.

2. The program does not create any data structures or arrays whose space requirements depend on the size of the input.

In summary, the time complexity is O(N) because the program iterates through the linked list once, and the space complexity is O(1) because it uses a constant amount of additional space for variables.
