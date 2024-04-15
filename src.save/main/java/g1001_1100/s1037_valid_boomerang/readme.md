1037\. Valid Boomerang

Easy

Given an array `points` where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> represents a point on the **X-Y** plane, return `true` _if these points are a **boomerang**_.

A **boomerang** is a set of three points that are **all distinct** and **not in a straight line**.

**Example 1:**

**Input:** points = [[1,1],[2,3],[3,2]]

**Output:** true

**Example 2:**

**Input:** points = [[1,1],[2,2],[3,3]]

**Output:** false

**Constraints:**

*   `points.length == 3`
*   `points[i].length == 2`
*   <code>0 <= x<sub>i</sub>, y<sub>i</sub> <= 100</code>