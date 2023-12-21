812\. Largest Triangle Area

Easy

Given an array of points on the **X-Y** plane `points` where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>, return _the area of the largest triangle that can be formed by any three different points_. Answers within <code>10<sup>-5</sup></code> of the actual answer will be accepted.

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/04/1027.png)

**Input:** points = [[0,0],[0,1],[1,0],[0,2],[2,0]]

**Output:** 2.00000

**Explanation:** The five points are shown in the above figure. The red triangle is the largest.

**Example 2:**

**Input:** points = [[1,0],[0,0],[0,1]]

**Output:** 0.50000

**Constraints:**

*   `3 <= points.length <= 50`
*   <code>-50 <= x<sub>i</sub>, y<sub>i</sub> <= 50</code>
*   All the given points are **unique**.