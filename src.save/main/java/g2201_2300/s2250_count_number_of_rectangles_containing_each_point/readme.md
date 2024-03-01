2250\. Count Number of Rectangles Containing Each Point

Medium

You are given a 2D integer array `rectangles` where <code>rectangles[i] = [l<sub>i</sub>, h<sub>i</sub>]</code> indicates that <code>i<sup>th</sup></code> rectangle has a length of <code>l<sub>i</sub></code> and a height of <code>h<sub>i</sub></code>. You are also given a 2D integer array `points` where <code>points[j] = [x<sub>j</sub>, y<sub>j</sub>]</code> is a point with coordinates <code>(x<sub>j</sub>, y<sub>j</sub>)</code>.

The <code>i<sup>th</sup></code> rectangle has its **bottom-left corner** point at the coordinates `(0, 0)` and its **top-right corner** point at <code>(l<sub>i</sub>, h<sub>i</sub>)</code>.

Return _an integer array_ `count` _of length_ `points.length` _where_ `count[j]` _is the number of rectangles that **contain** the_ <code>j<sup>th</sup></code> _point._

The <code>i<sup>th</sup></code> rectangle **contains** the <code>j<sup>th</sup></code> point if <code>0 <= x<sub>j</sub> <= l<sub>i</sub></code> and <code>0 <= y<sub>j</sub> <= h<sub>i</sub></code>. Note that points that lie on the **edges** of a rectangle are also considered to be contained by that rectangle.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/03/02/example1.png)

**Input:** rectangles = [[1,2],[2,3],[2,5]], points = [[2,1],[1,4]]

**Output:** [2,1]

**Explanation:** 

The first rectangle contains no points. 

The second rectangle contains only the point (2, 1). 

The third rectangle contains the points (2, 1) and (1, 4). 

The number of rectangles that contain the point (2, 1) is 2. 

The number of rectangles that contain the point (1, 4) is 1. 

Therefore, we return [2, 1].

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/03/02/example2.png)

**Input:** rectangles = [[1,1],[2,2],[3,3]], points = [[1,3],[1,1]]

**Output:** [1,3]

**Explanation:** 

The first rectangle contains only the point (1, 1). 

The second rectangle contains only the point (1, 1). 

The third rectangle contains the points (1, 3) and (1, 1). 

The number of rectangles that contain the point (1, 3) is 1. 

The number of rectangles that contain the point (1, 1) is 3.

Therefore, we return [1, 3].

**Constraints:**

*   <code>1 <= rectangles.length, points.length <= 5 * 10<sup>4</sup></code>
*   `rectangles[i].length == points[j].length == 2`
*   <code>1 <= l<sub>i</sub>, x<sub>j</sub> <= 10<sup>9</sup></code>
*   <code>1 <= h<sub>i</sub>, y<sub>j</sub> <= 100</code>
*   All the `rectangles` are **unique**.
*   All the `points` are **unique**.