3464\. Maximize the Distance Between Points on a Square

Hard

You are given an integer `side`, representing the edge length of a square with corners at `(0, 0)`, `(0, side)`, `(side, 0)`, and `(side, side)` on a Cartesian plane.

You are also given a **positive** integer `k` and a 2D integer array `points`, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> represents the coordinate of a point lying on the **boundary** of the square.

You need to select `k` elements among `points` such that the **minimum** Manhattan distance between any two points is **maximized**.

Return the **maximum** possible **minimum** Manhattan distance between the selected `k` points.

The Manhattan Distance between two cells <code>(x<sub>i</sub>, y<sub>i</sub>)</code> and <code>(x<sub>j</sub>, y<sub>j</sub>)</code> is <code>|x<sub>i</sub> - x<sub>j</sub>| + |y<sub>i</sub> - y<sub>j</sub>|</code>.

**Example 1:**

**Input:** side = 2, points = [[0,2],[2,0],[2,2],[0,0]], k = 4

**Output:** 2

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/01/28/4080_example0_revised.png)

Select all four points.

**Example 2:**

**Input:** side = 2, points = [[0,0],[1,2],[2,0],[2,2],[2,1]], k = 4

**Output:** 1

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/01/28/4080_example1_revised.png)

Select the points `(0, 0)`, `(2, 0)`, `(2, 2)`, and `(2, 1)`.

**Example 3:**

**Input:** side = 2, points = [[0,0],[0,1],[0,2],[1,2],[2,0],[2,2],[2,1]], k = 5

**Output:** 1

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/01/28/4080_example2_revised.png)

Select the points `(0, 0)`, `(0, 1)`, `(0, 2)`, `(1, 2)`, and `(2, 2)`.

**Constraints:**

*   <code>1 <= side <= 10<sup>9</sup></code>
*   <code>4 <= points.length <= min(4 * side, 15 * 10<sup>3</sup>)</code>
*   `points[i] == [xi, yi]`
*   The input is generated such that:
    *   `points[i]` lies on the boundary of the square.
    *   All `points[i]` are **unique**.
*   `4 <= k <= min(25, points.length)`