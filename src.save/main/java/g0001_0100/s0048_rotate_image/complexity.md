**Time Complexity (Big O Time):**

1. The program uses two nested loops, where `i` and `j` iterate from 0 to `n/2-1`, where `n` is the number of rows (and columns) in the square matrix.

2. The innermost loop, represented by `k`, runs four times for each element (corner) in the matrix. The innermost loop contains constant-time operations.

3. Therefore, the time complexity of the program is O(n^2), where `n` is the number of rows (and columns) in the square matrix. This is because we perform constant-time operations for each element in the matrix.

**Space Complexity (Big O Space):**

1. The space complexity of the program is O(1), which means it uses a constant amount of additional space regardless of the size of the input matrix.

2. The program uses a few integer variables (`n`, `i`, `j`, `k`, `t`, `temp`, `pos` array), but the space required for these variables remains constant as the input matrix size increases. The space complexity does not depend on the size of the input matrix.

In summary, the time complexity of the provided program is O(n^2), and the space complexity is O(1), where `n` is the number of rows (and columns) in the square matrix.
