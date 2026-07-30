3873\. Maximum Points Activated with One Addition

Hard

You are given a 2D integer array `points`, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> represents the coordinates of the <code>i<sup>th</sup></code> point. All coordinates in `points` are **distinct**.

If a point is **activated**, then all points that have the **same** x-coordinate **or** y-coordinate become **activated** as well.

Activation continues until no additional points can be activated.

You may add **one additional** point at any integer coordinate `(x, y)` not already present in `points`. Activation begins by **activating** this **newly added point**.

Return an integer denoting the **maximum** number of points that can be activated, including the newly added point.

**Example 1:**

**Input:** points = [[1,1],[1,2],[2,2]]

**Output:** 4

**Explanation:**

Adding and activating a point such as `(1, 3)` causes activations:

*   `(1, 3)` shares `x = 1` with `(1, 1)` and `(1, 2)` -> `(1, 1)` and `(1, 2)` become activated.
*   `(1, 2)` shares `y = 2` with `(2, 2)` -> `(2, 2)` becomes activated.

Thus, the activated points are `(1, 3)`, `(1, 1)`, `(1, 2)`, `(2, 2)`, so 4 points in total. We can show this is the maximum activated.

**Example 2:**

**Input:** points = [[2,2],[1,1],[3,3]]

**Output:** 3

**Explanation:**

Adding and activating a point such as `(1, 2)` causes activations:

*   `(1, 2)` shares `x = 1` with `(1, 1)` -> `(1, 1)` becomes activated.
*   `(1, 2)` shares `y = 2` with `(2, 2)` -> `(2, 2)` becomes activated.

Thus, the activated points are `(1, 2)`, `(1, 1)`, `(2, 2)`, so 3 points in total. We can show this is the maximum activated.

**Example 3:**

**Input:** points = [[2,3],[2,2],[1,1],[4,5]]

**Output:** 4

**Explanation:**

Adding and activating a point such as `(2, 1)` causes activations:

*   `(2, 1)` shares `x = 2` with `(2, 3)` and `(2, 2)` -> `(2, 3)` and `(2, 2)` become activated.
*   `(2, 1)` shares `y = 1` with `(1, 1)` -> `(1, 1)` becomes activated.

Thus, the activated points are `(2, 1)`, `(2, 3)`, `(2, 2)`, `(1, 1)`, so 4 points in total.

**Constraints:**

*   <code>1 <= points.length <= 10<sup>5</sup></code>
*   <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>
*   <code>-10<sup>9</sup> <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>9</sup></code>
*   `points` contains all **distinct** coordinates.