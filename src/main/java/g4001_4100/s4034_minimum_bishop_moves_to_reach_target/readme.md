4034\. Minimum Bishop Moves to Reach Target

Medium

There is an `8 x 8` empty chessboard with **1-indexed** rows and columns.

You are given an array `source = [sr, sc]` representing the starting position of a **bishop**, and an array `target = [tr, tc]` representing the target position.

In one move, the bishop travels one or more squares along a single **diagonal** direction, staying within the board.

Return the **minimum** number of moves for the bishop to land **exactly** on `target`. If it can never reach `target`, return -1.

**Example 1:**

**Input:** source = [8,1], target = [1,8]

**Output:** 1

**Explanation:**

**![](https://assets.leetcode.com/uploads/2026/08/31/111.png)**

A single diagonal move takes the bishop straight from `(8, 1)` to `(1, 8)`.

**Example 2:**

**Input:** source = [4,2], target = [1,3]

**Output:** 2

**Explanation:**

![](https://assets.leetcode.com/uploads/2026/08/31/22-ezgifcom-invert-colors.png)

The bishop moves from `(4, 2)` to `(3, 1)`, then from `(3, 1)` to `(1, 3)`, reaching the target in 2 moves.

**Example 3:**

**Input:** source = [1,1], target = [3,4]

**Output:** \-1

**Explanation:**

No matter how many diagonal moves it makes, the bishop starting at `(1, 1)` can never land on `(3, 4)`. Thus, the answer is -1.

**Constraints:**

*   `source.length == target.length == 2`
*   `1 <= sr, sc, tr, tc <= 8`
*   `source != target`