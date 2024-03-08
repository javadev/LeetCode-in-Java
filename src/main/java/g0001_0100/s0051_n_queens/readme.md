51\. N-Queens

Hard

The **n-queens** puzzle is the problem of placing `n` queens on an `n x n` chessboard such that no two queens attack each other.

Given an integer `n`, return _all distinct solutions to the **n-queens puzzle**_. You may return the answer in **any order**.

Each solution contains a distinct board configuration of the n-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space, respectively.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/13/queens.jpg)

**Input:** n = 4

**Output:** [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]

**Explanation:** There exist two distinct solutions to the 4-queens puzzle as shown above 

**Example 2:**

**Input:** n = 1

**Output:** [["Q"]] 

**Constraints:**

*   `1 <= n <= 9`

To solve the "N-Queens" problem in Java with the Solution class, follow these steps:

1. Define a method `solveNQueens` in the `Solution` class that takes an integer `n` as input and returns a list of lists of strings.
2. Initialize a board represented as a 2D character array of size `n x n`. Initialize all cells to `'.'`, indicating an empty space.
3. Define a recursive backtracking function `backtrack` to explore all possible configurations of queens on the board.
4. In the `backtrack` function:
   - Base case: If the current row index `row` is equal to `n`, it means we have successfully placed `n` queens on the board. Add the current board configuration to the result.
   - Iterate through each column index `col` from `0` to `n - 1`:
     - Check if it's safe to place a queen at position `(row, col)` by calling a helper function `isSafe`.
     - If it's safe, place a queen at position `(row, col)` on the board, mark it as `'Q'`.
     - Recur to the next row by calling `backtrack(row + 1)`.
     - Backtrack: After exploring all possibilities, remove the queen from position `(row, col)` by marking it as `'.'`.
5. In the `solveNQueens` method, initialize an empty list `result` to store the solutions.
6. Call the `backtrack` function with initial parameters `0` for the row index.
7. Return the `result` list containing all distinct solutions.

Here's the implementation of the `solveNQueens` method in Java:

```java
import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        backtrack(board, 0, result);
        return result;
    }
    
    private void backtrack(char[][] board, int row, List<List<String>> result) {
        int n = board.length;
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(board, row + 1, result);
                board[row][col] = '.';
            }
        }
    }
    
    private boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    
    private List<String> constructBoard(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }
}
```

This implementation efficiently finds all distinct solutions to the N-Queens problem using backtracking.