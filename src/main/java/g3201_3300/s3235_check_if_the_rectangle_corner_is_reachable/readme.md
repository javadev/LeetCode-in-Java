3235\. Check if the Rectangle Corner Is Reachable

Hard

You are given two positive integers `X` and `Y`, and a 2D array `circles`, where <code>circles[i] = [x<sub>i</sub>, y<sub>i</sub>, r<sub>i</sub>]</code> denotes a circle with center at <code>(x<sub>i</sub>, y<sub>i</sub>)</code> and radius <code>r<sub>i</sub></code>.

There is a rectangle in the coordinate plane with its bottom left corner at the origin and top right corner at the coordinate `(X, Y)`. You need to check whether there is a path from the bottom left corner to the top right corner such that the **entire path** lies inside the rectangle, **does not** touch or lie inside **any** circle, and touches the rectangle **only** at the two corners.

Return `true` if such a path exists, and `false` otherwise.

**Example 1:**

**Input:** X = 3, Y = 4, circles = [[2,1,1]]

**Output:** true

**Explanation:**

![](https://assets.leetcode.com/uploads/2024/05/18/example2circle1.png)

The black curve shows a possible path between `(0, 0)` and `(3, 4)`.

**Example 2:**

**Input:** X = 3, Y = 3, circles = [[1,1,2]]

**Output:** false

**Explanation:**

![](https://assets.leetcode.com/uploads/2024/05/18/example1circle.png)

No path exists from `(0, 0)` to `(3, 3)`.

**Example 3:**

**Input:** X = 3, Y = 3, circles = [[2,1,1],[1,2,1]]

**Output:** false

**Explanation:**

![](https://assets.leetcode.com/uploads/2024/05/18/example0circle.png)

No path exists from `(0, 0)` to `(3, 3)`.

**Example 4:**

**Input:** X = 4, Y = 4, circles = [[5,5,1]]

**Output:** true

**Explanation:**

![](https://assets.leetcode.com/uploads/2024/07/31/rectangleexample5.png)

**Constraints:**

*   <code>3 <= X, Y <= 10<sup>9</sup></code>
*   `1 <= circles.length <= 1000`
*   `circles[i].length == 3`
*   <code>1 <= x<sub>i</sub>, y<sub>i</sub>, r<sub>i</sub> <= 10<sup>9</sup></code>