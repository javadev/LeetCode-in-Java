3988\. Create Grid With Exactly K Paths I

Medium

You are given three integers `m`, `n`, and `k`.

Construct **any** `m x n` grid consisting only of the characters `'.'` and `'#'`, where:

*   `'.'` represents a free cell.
*   `'#'` represents an obstacle cell.

A **valid path** is a sequence of free cells that:

*   Starts at the top-left cell `(0, 0)`.
*   Ends at the bottom-right cell `(m - 1, n - 1)`.
*   Moves only:
    *   Right, from `(i, j)` to `(i, j + 1)`, or
    *   Down, from `(i, j)` to `(i + 1, j)`.

Return any grid such that there are **exactly** `k` **valid paths** from the top-left cell to the bottom-right cell. If no such grid exists, return an empty array.

**Example 1:**

**Input:** m = 2, n = 3, k = 2

**Output:** ["...","#.."]

**Explanation:**

![](https://assets.leetcode.com/uploads/2026/05/26/screenshot-2026-05-27-at-113554am.png)

There are exactly `k = 2` valid paths from `(0, 0)` to `(1, 2)`:

*   `(0, 0) → (0, 1) → (0, 2) → (1, 2)`
*   `(0, 0) → (0, 1) → (1, 1) → (1, 2)`

**Example 2:**

**Input:** m = 3, n = 3, k = 4

**Output:** ["..#","...","#.."]

**Explanation:**

![](https://assets.leetcode.com/uploads/2026/05/26/screenshot-2026-05-27-at-113452am.png)

There are exactly `k = 4` valid paths from `(0, 0)` to `(2, 2)`:

*   `(0, 0) → (0, 1) → (1, 1) → (1, 2) → (2, 2)`
*   `(0, 0) → (0, 1) → (1, 1) → (2, 1) → (2, 2)`
*   `(0, 0) → (1, 0) → (1, 1) → (1, 2) → (2, 2)`
*   `(0, 0) → (1, 0) → (1, 1) → (2, 1) → (2, 2)`

**Example 3:**

**Input:** m = 1, n = 4, k = 2

**Output:** []

**Explanation:**

No grid exists with exactly `k = 2` valid paths for a `1 x 4` grid, so the answer is an empty array.

**Constraints:**

*   `1 <= m, n <= 10`
*   `1 <= k <= 4`