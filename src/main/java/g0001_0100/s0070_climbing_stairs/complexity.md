**Time Complexity (Big O Time):**

1. The program uses dynamic programming with a loop that runs from 2 to `n-1` to fill in the `cache` array.

2. The loop iterates through all steps from 2 to `n-1`, and for each step `i`, it calculates the number of distinct ways by summing the values from the previous two steps (`cache[i-1]` and `cache[i-2]`).

3. Therefore, the loop runs in O(n) time because it iterates through all `n` steps once.

4. The other operations in the program, such as array assignments and comparisons, are constant time operations and do not depend on the input value `n`.

5. Overall, the time complexity of the program is O(n), where 'n' is the number of steps in the staircase.

**Space Complexity (Big O Space):**

1. The program uses an integer array `cache` of size `n` to store the intermediate results of the number of distinct ways to climb each step.

2. Therefore, the space complexity is O(n) because the space usage is directly proportional to the input value `n`.

3. The space complexity is dominated by the `cache` array, and it scales linearly with the size of the input staircase.

In summary, the time complexity of the provided program is O(n), and the space complexity is also O(n), where 'n' is the number of steps in the staircase. The program efficiently calculates the number of distinct ways to climb the staircase using dynamic programming with memoization.
