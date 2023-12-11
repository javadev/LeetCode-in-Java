447\. Number of Boomerangs

Medium

You are given `n` `points` in the plane that are all **distinct**, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>. A **boomerang** is a tuple of points `(i, j, k)` such that the distance between `i` and `j` equals the distance between `i` and `k` **(the order of the tuple matters)**.

Return _the number of boomerangs_.

**Example 1:**

**Input:** points = [[0,0],[1,0],[2,0]]

**Output:** 2

**Explanation:** The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]. 

**Example 2:**

**Input:** points = [[1,1],[2,2],[3,3]]

**Output:** 2 

**Example 3:**

**Input:** points = [[1,1]]

**Output:** 0 

**Constraints:**

*   `n == points.length`
*   `1 <= n <= 500`
*   `points[i].length == 2`
*   <code>-10<sup>4</sup> <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>4</sup></code>
*   All the points are **unique**.