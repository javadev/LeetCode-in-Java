1584\. Min Cost to Connect All Points

Medium

You are given an array `points` representing integer coordinates of some points on a 2D-plane, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>.

The cost of connecting two points <code>[x<sub>i</sub>, y<sub>i</sub>]</code> and <code>[x<sub>j</sub>, y<sub>j</sub>]</code> is the **manhattan distance** between them: <code>|x<sub>i</sub> - x<sub>j</sub>| + |y<sub>i</sub> - y<sub>j</sub>|</code>, where `|val|` denotes the absolute value of `val`.

Return _the minimum cost to make all points connected._ All points are connected if there is **exactly one** simple path between any two points.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/26/d.png)

**Input:** points = [[0,0],[2,2],[3,10],[5,2],[7,0]]

**Output:** 20

**Explanation:** ![](https://assets.leetcode.com/uploads/2020/08/26/c.png)

We can connect the points as shown above to get the minimum cost of 20.

Notice that there is a unique path between every pair of points.

**Example 2:**

**Input:** points = [[3,12],[-2,5],[-4,1]]

**Output:** 18

**Constraints:**

*   `1 <= points.length <= 1000`
*   <code>-10<sup>6</sup> <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>6</sup></code>
*   All pairs <code>(x<sub>i</sub>, y<sub>i</sub>)</code> are distinct.