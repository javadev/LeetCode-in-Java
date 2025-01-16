939\. Minimum Area Rectangle

Medium

You are given an array of points in the **X-Y** plane `points` where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>.

Return _the minimum area of a rectangle formed from these points, with sides parallel to the X and Y axes_. If there is not any such rectangle, return `0`.

**Example 1:**

![](https://leetcode-in-java.github.io/src/main/java/g0901_1000/s0939_minimum_area_rectangle/rec1.jpg)

**Input:** points = [[1,1],[1,3],[3,1],[3,3],[2,2]]

**Output:** 4

**Example 2:**

![](https://leetcode-in-java.github.io/src/main/java/g0901_1000/s0939_minimum_area_rectangle/rec2.jpg)

**Input:** points = [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]

**Output:** 2

**Constraints:**

*   `1 <= points.length <= 500`
*   `points[i].length == 2`
*   <code>0 <= x<sub>i</sub>, y<sub>i</sub> <= 4 * 10<sup>4</sup></code>
*   All the given points are **unique**.