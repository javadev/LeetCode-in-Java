**Time Complexity (Big O Time):**

1. The program performs two binary searches, one to find the leftmost occurrence of the target value and another to find the rightmost occurrence.

2. Each binary search operates on a sorted array of length n, and in each step, it reduces the search range by half.

3. Therefore, the time complexity of each binary search is O(log n), and since the program performs two binary searches sequentially, the overall time complexity is still O(log n).

**Space Complexity (Big O Space):**

The space complexity of the program is O(1), which means it uses a constant amount of additional space regardless of the size of the input array `nums`. The program only uses a few integer variables (`l`, `r`, `result`, `mid`) and an integer array of constant size to store the result.

In summary, the time complexity of the provided program is O(log n), and the space complexity is O(1), where n is the number of elements in the input array `nums`.
