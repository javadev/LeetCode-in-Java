2943\. Maximize Area of Square Hole in Grid

Medium

There is a grid with `n + 2` **horizontal** bars and `m + 2` **vertical** bars, and initially containing `1 x 1` unit cells.

The bars are **1-indexed**.

You are given the two integers, `n` and `m`.

You are also given two integer arrays: `hBars` and `vBars`.

*   `hBars` contains **distinct** horizontal bars in the range `[2, n + 1]`.
*   `vBars` contains **distinct** vertical bars in the range `[2, m + 1]`.

You are allowed to **remove** bars that satisfy any of the following conditions:

*   If it is a horizontal bar, it must correspond to a value in `hBars`.
*   If it is a vertical bar, it must correspond to a value in `vBars`.

Return _an integer denoting the **maximum** area of a **square-shaped** hole in the grid after removing some bars (**possibly none**)._

**Example 1:**

![](https://assets.leetcode.com/uploads/2023/11/05/screenshot-from-2023-11-05-22-40-25.png)

**Input:** n = 2, m = 1, hBars = [2,3], vBars = [2]

**Output:** 4

**Explanation:** The left image shows the initial grid formed by the bars.

The horizontal bars are in the range [1,4], and the vertical bars are in the range [1,3].

It is allowed to remove horizontal bars [2,3] and the vertical bar [2].

One way to get the maximum square-shaped hole is by removing horizontal bar 2 and vertical bar 2.

The resulting grid is shown on the right.

The hole has an area of 4.

It can be shown that it is not possible to get a square hole with an area more than 4.

Hence, the answer is 4. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2023/11/04/screenshot-from-2023-11-04-17-01-02.png)

**Input:** n = 1, m = 1, hBars = [2], vBars = [2]

**Output:** 4

**Explanation:** The left image shows the initial grid formed by the bars.

The horizontal bars are in the range [1,3], and the vertical bars are in the range [1,3].

It is allowed to remove the horizontal bar [2] and the vertical bar [2].

To get the maximum square-shaped hole, we remove horizontal bar 2 and vertical bar 2.

The resulting grid is shown on the right.

The hole has an area of 4.

Hence, the answer is 4, and it is the maximum possible. 

**Example 3:**

![](https://assets.leetcode.com/uploads/2023/11/05/screenshot-from-2023-11-05-22-33-35.png)

**Input:** n = 2, m = 3, hBars = [2,3], vBars = [2,3,4]

**Output:** 9

**Explanation:** The left image shows the initial grid formed by the bars.

The horizontal bars are in the range [1,4], and the vertical bars are in the range [1,5].

It is allowed to remove horizontal bars [2,3] and vertical bars [2,3,4].

One way to get the maximum square-shaped hole is by removing horizontal bars 2 and 3, and vertical bars 3 and 4.

The resulting grid is shown on the right.

The hole has an area of 9.

It can be shown that it is not possible to get a square hole with an area more than 9. Hence, the answer is 9. 

**Constraints:**

*   <code>1 <= n <= 10<sup>9</sup></code>
*   <code>1 <= m <= 10<sup>9</sup></code>
*   `1 <= hBars.length <= 100`
*   `2 <= hBars[i] <= n + 1`
*   `1 <= vBars.length <= 100`
*   `2 <= vBars[i] <= m + 1`
*   All values in `hBars` are distinct.
*   All values in `vBars` are distinct.