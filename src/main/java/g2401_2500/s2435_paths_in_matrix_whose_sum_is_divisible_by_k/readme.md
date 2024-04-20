2435\. Paths in Matrix Whose Sum Is Divisible by K

Hard

You are given a **0-indexed** `m x n` integer matrix `grid` and an integer `k`. You are currently at position `(0, 0)` and you want to reach position `(m - 1, n - 1)` moving only **down** or **right**.

Return _the number of paths where the sum of the elements on the path is divisible by_ `k`. Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/08/13/image-20220813183124-1.png)

**Input:** grid = [[5,2,4],[3,0,5],[0,7,2]], k = 3

**Output:** 2

**Explanation:** There are two paths where the sum of the elements on the path is divisible by k. The first path highlighted in red has a sum of 5 + 2 + 4 + 5 + 2 = 18 which is divisible by 3. The second path highlighted in blue has a sum of 5 + 3 + 0 + 5 + 2 = 15 which is divisible by 3.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/08/17/image-20220817112930-3.png)

**Input:** grid = [[0,0]], k = 5

**Output:** 1

**Explanation:** The path highlighted in red has a sum of 0 + 0 = 0 which is divisible by 5.

**Example 3:**

![](https://assets.leetcode.com/uploads/2022/08/12/image-20220812224605-3.png)

**Input:** grid = [[7,3,4,9],[2,3,6,2],[2,3,7,0]], k = 1

**Output:** 10

**Explanation:** Every integer is divisible by 1 so the sum of the elements on every possible path is divisible by k.

**Constraints:**

*   `m == grid.length`
*   `n == grid[i].length`
*   <code>1 <= m, n <= 5 * 10<sup>4</sup></code>
*   <code>1 <= m * n <= 5 * 10<sup>4</sup></code>
*   `0 <= grid[i][j] <= 100`
*   `1 <= k <= 50`