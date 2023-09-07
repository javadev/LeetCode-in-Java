**Time Complexity (Big O Time):**

The program uses a loop that iterates from 0 to 'n' to calculate the number of unique binary search trees. Inside the loop, basic arithmetic operations (multiplication and division) are performed.

- The loop runs 'n' times, so the time complexity of the loop itself is O(n).

- Inside the loop, there are simple arithmetic operations involving long integers (multiplication and division), which are constant-time operations.

- Therefore, the overall time complexity of the program is O(n), where 'n' is the input value.

**Space Complexity (Big O Space):**

The program uses a single long variable (`result`) to store the intermediate and final results. It does not use any data structures that depend on the input size 'n'.

- Regardless of the input value 'n', the space used by the program remains constant.

- Therefore, the space complexity of the program is O(1), indicating constant space usage.

In summary, the time complexity of the program is O(n), and the space complexity is O(1), where 'n' is the input value. The time complexity is determined by the loop that runs 'n' times, and the space complexity is constant because the program uses only a fixed amount of memory regardless of the input size.
