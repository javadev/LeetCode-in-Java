4003\. Minimum Cost Path with Alternating Directions III

Hard

You are given two integers `m` and `n` representing the number of rows and columns of a grid. Your goal is to reach cell `(m - 1, n - 1)`. You are also given a 2D integer array `penalty`.

The cost to enter cell `(i, j)` is `(i + 1) * (j + 1)`.

You begin at cell `(0, 0)` and initially pay its entrance cost. Actions performed after entering `(0, 0)` are numbered starting from 1.

On each action, you may move to an **adjacent** cell or wait in the current cell. A move follows the parity rule if:

*   On an **odd-numbered** action, you move **right** or **down**.
*   On an **even-numbered** action, you move **left** or **up**.

The cost of an action is determined as follows:

*   If you move according to the parity rule, pay only the entrance cost of the destination cell.
*   If you move in a direction that **violates** the parity rule, pay the entrance cost of the destination cell plus `penalty[i][j]`, where `(i, j)` is the cell you move from.
*   If you **wait** in cell `(i, j)`, pay `penalty[i][j]`.

After every move or wait, the action number increases by 1. Therefore, the required parity alternates after every action, regardless of whether a penalty was paid.

Return the **minimum** total cost required to reach `(m - 1, n - 1)`.

**Example 1:**

**Input:** m = 2, n = 2, penalty = [[5,3],[1,4]]

**Output:** 8

**Explanation:**

The optimal path is:

*   Start at cell `(0, 0)` with entry cost `(0 + 1) * (0 + 1) = 1`.
*   **Move 1**: Move down to cell `(1, 0)` with entry cost `(1 + 1) * (0 + 1) = 2`.
*   **Move 2**: Move right to cell `(1, 1)` with entry cost `(1 + 1) * (1 + 1) = 4` and an extra cost of `penalty[1][0] = 1` for violating the even parity rule.

Thus, the total cost is `1 + 2 + 4 + 1 = 8`.

**Example 2:**

**Input:** m = 2, n = 2, penalty = [[0,7],[3,2]]

**Output:** 7

**Explanation:**

The optimal path is:

*   Start at cell `(0, 0)` with entry cost `(0 + 1) * (0 + 1) = 1`.
*   **Move 1**: Wait at cell `(0, 0)` with an extra cost of `penalty[0][0] = 0` to flip to even parity.
*   **Move 2**: Move right to cell `(0, 1)` with entry cost `(0 + 1) * (1 + 1) = 2` and an extra cost of `penalty[0][0] = 0` for violating the even parity rule.
*   **Move 3**: Move down to cell `(1, 1)` with entry cost `(1 + 1) * (1 + 1) = 4`.

Thus, the total cost is `1 + 0 + 2 + 0 + 4 = 7`.

**Example 3:**

**Input:** m = 2, n = 3, penalty = [[8,0,9],[7,4,1]]

**Output:** 12

**Explanation:**

The optimal path is:

*   Start at cell `(0, 0)` with entry cost `(0 + 1) * (0 + 1) = 1`.
*   **Move 1**: Move right to cell `(0, 1)` with entry cost `(0 + 1) * (1 + 1) = 2`.
*   **Move 2**: Move right to cell `(0, 2)` with entry cost `(0 + 1) * (2 + 1) = 3` and an extra cost of `penalty[0][1] = 0` for violating the even parity rule.
*   **Move 3**: Move down to cell `(1, 2)` with entry cost `(1 + 1) * (2 + 1) = 6`.

Thus, the total cost is `1 + 2 + 3 + 0 + 6 = 12`.

**Constraints:**

*   <code>1 <= m, n <= 10<sup>5</sup></code>
*   <code>2 <= m * n <= 10<sup>5</sup></code>
*   `penalty.length == m`
*   `penalty[i].length == n`
*   <code>0 <= penalty[i][j] <= 10<sup>5</sup></code>