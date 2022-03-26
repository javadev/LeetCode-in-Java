1411\. Number of Ways to Paint N × 3 Grid

Hard

You have a `grid` of size `n x 3` and you want to paint each cell of the grid with exactly one of the three colors: **Red**, **Yellow,** or **Green** while making sure that no two adjacent cells have the same color (i.e., no two cells that share vertical or horizontal sides have the same color).

Given `n` the number of rows of the grid, return _the number of ways_ you can paint this `grid`. As the answer may grow large, the answer **must be** computed modulo <code>10<sup>9</sup> + 7</code>.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/03/26/e1.png)

**Input:** n = 1

**Output:** 12

**Explanation:** There are 12 possible way to paint the grid as shown.

**Example 2:**

**Input:** n = 5000

**Output:** 30228214

**Constraints:**

*   `n == grid.length`
*   `1 <= n <= 5000`