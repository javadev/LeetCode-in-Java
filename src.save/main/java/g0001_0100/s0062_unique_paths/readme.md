62\. Unique Paths

Medium

A robot is located at the top-left corner of a `m x n` grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png)

**Input:** m = 3, n = 7

**Output:** 28 

**Example 2:**

**Input:** m = 3, n = 2

**Output:** 3

**Explanation:**

    From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
    1. Right -> Down -> Down
    2. Down -> Down -> Right
    3. Down -> Right -> Down 

**Example 3:**

**Input:** m = 7, n = 3

**Output:** 28 

**Example 4:**

**Input:** m = 3, n = 3

**Output:** 6 

**Constraints:**

*   `1 <= m, n <= 100`
*   It's guaranteed that the answer will be less than or equal to <code>2 * 10<sup>9</sup></code>.

To solve the "Unique Paths" problem in Java with the Solution class, follow these steps:

1. Define a method `uniquePaths` in the `Solution` class that takes two integers `m` and `n` as input and returns the number of unique paths from the top-left corner to the bottom-right corner of an `m x n` grid.
2. Initialize a 2D array `dp` of size `m x n` to store the number of unique paths for each position in the grid.
3. Initialize the first row and first column of `dp` to 1 since there is only one way to reach any position in the first row or column (by moving only right or down).
4. Iterate over each position `(i, j)` in the grid, starting from the second row and second column:
   - Update `dp[i][j]` by adding the number of unique paths from the cell above `(i-1, j)` and the cell to the left `(i, j-1)`.
5. Return the value of `dp[m-1][n-1]`, which represents the number of unique paths to reach the bottom-right corner of the grid.

Here's the implementation of the `uniquePaths` method in Java:

```java
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // Initialize first column to 1
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // Initialize first row to 1
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1]; // Calculate number of paths for current cell
            }
        }
        return dp[m-1][n-1]; // Return number of unique paths for bottom-right corner
    }
}
```

This implementation efficiently calculates the number of unique paths using dynamic programming, with a time complexity of O(m * n) and a space complexity of O(m * n).