3111\. Minimum Rectangles to Cover Points

Medium

You are given a 2D integer array `points`, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>. You are also given an integer `w`. Your task is to **cover** **all** the given points with rectangles.

Each rectangle has its lower end at some point <code>(x<sub>1</sub>, 0)</code> and its upper end at some point <code>(x<sub>2</sub>, y<sub>2</sub>)</code>, where <code>x<sub>1</sub> <= x<sub>2</sub></code>, <code>y<sub>2</sub> >= 0</code>, and the condition <code>x<sub>2</sub> - x<sub>1</sub> <= w</code> **must** be satisfied for each rectangle.

A point is considered covered by a rectangle if it lies within or on the boundary of the rectangle.

Return an integer denoting the **minimum** number of rectangles needed so that each point is covered by **at least one** rectangle_._

**Note:** A point may be covered by more than one rectangle.

**Example 1:**

![](https://assets.leetcode.com/uploads/2024/03/04/screenshot-from-2024-03-04-20-33-05.png)

**Input:** points = [[2,1],[1,0],[1,4],[1,8],[3,5],[4,6]], w = 1

**Output:** 2

**Explanation:**

The image above shows one possible placement of rectangles to cover the points:

*   A rectangle with a lower end at `(1, 0)` and its upper end at `(2, 8)`
*   A rectangle with a lower end at `(3, 0)` and its upper end at `(4, 8)`

**Example 2:**

![](https://assets.leetcode.com/uploads/2024/03/04/screenshot-from-2024-03-04-18-59-12.png)

**Input:** points = [[0,0],[1,1],[2,2],[3,3],[4,4],[5,5],[6,6]], w = 2

**Output:** 3

**Explanation:**

The image above shows one possible placement of rectangles to cover the points:

*   A rectangle with a lower end at `(0, 0)` and its upper end at `(2, 2)`
*   A rectangle with a lower end at `(3, 0)` and its upper end at `(5, 5)`
*   A rectangle with a lower end at `(6, 0)` and its upper end at `(6, 6)`

**Example 3:**

![](https://assets.leetcode.com/uploads/2024/03/04/screenshot-from-2024-03-04-20-24-03.png)

**Input:** points = [[2,3],[1,2]], w = 0

**Output:** 2

**Explanation:**

The image above shows one possible placement of rectangles to cover the points:

*   A rectangle with a lower end at `(1, 0)` and its upper end at `(1, 2)`
*   A rectangle with a lower end at `(2, 0)` and its upper end at `(2, 3)`

**Constraints:**

*   <code>1 <= points.length <= 10<sup>5</sup></code>
*   `points[i].length == 2`
*   <code>0 <= x<sub>i</sub> == points[i][0] <= 10<sup>9</sup></code>
*   <code>0 <= y<sub>i</sub> == points[i][1] <= 10<sup>9</sup></code>
*   <code>0 <= w <= 10<sup>9</sup></code>
*   All pairs <code>(x<sub>i</sub>, y<sub>i</sub>)</code> are distinct.