**Time Complexity (Big O Time):**

The program uses dynamic programming to fill in a 2D array `dp` of dimensions `(n+1) x (m+1)`, where `n` is the length of `text1`, and `m` is the length of `text2`. It iterates through this 2D array using nested loops:

- The outer loop runs `n` times, where `n` is the length of `text1`.
- The inner loop runs `m` times, where `m` is the length of `text2`.

Inside the nested loops, each iteration involves simple constant-time operations (comparisons, assignments, and max calculations). Therefore, the overall time complexity of the program is O(n * m), where 'n' and 'm' are the lengths of the input strings `text1` and `text2`, respectively.

**Space Complexity (Big O Space):**

The program uses a 2D array `dp` of dimensions `(n+1) x (m+1)` to store intermediate results for dynamic programming. As such, the space complexity is determined by the size of this array:

- The number of rows in `dp` is `(n+1)` where 'n' is the length of `text1`.
- The number of columns in `dp` is `(m+1)` where 'm' is the length of `text2`.

Therefore, the space complexity of the program is O(n * m) because it depends on the lengths of both input strings `text1` and `text2`.

In summary, the provided program has a time complexity of O(n * m) and a space complexity of O(n * m), where 'n' and 'm' are the lengths of the input strings `text1` and `text2`, respectively.
