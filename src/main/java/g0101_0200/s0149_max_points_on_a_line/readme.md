149\. Max Points on a Line

Hard

Given an array of `points` where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> represents a point on the **X-Y** plane, return _the maximum number of points that lie on the same straight line_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/25/plane1.jpg)

**Input:** points = [[1,1],[2,2],[3,3]]

**Output:** 3 

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/02/25/plane2.jpg)

**Input:** points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]

**Output:** 4 

**Constraints:**

*   `1 <= points.length <= 300`
*   `points[i].length == 2`
*   <code>-10<sup>4</sup> <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>4</sup></code>
*   All the `points` are **unique**.