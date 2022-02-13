850\. Rectangle Area II

Hard

You are given a 2D array of axis-aligned `rectangles`. Each <code>rectangle[i] = [x<sub>i1</sub>, y<sub>i1</sub>, x<sub>i2</sub>, y<sub>i2</sub>]</code> denotes the <code>i<sup>th</sup></code> rectangle where <code>(x<sub>i1</sub>, y<sub>i1</sub>)</code> are the coordinates of the **bottom-left corner**, and <code>(x<sub>i2</sub>, y<sub>i2</sub>)</code> are the coordinates of the **top-right corner**.

Calculate the **total area** covered by all `rectangles` in the plane. Any area covered by two or more rectangles should only be counted **once**.

Return _the **total area**_. Since the answer may be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/06/rectangle_area_ii_pic.png)

**Input:** rectangles = [[0,0,2,2],[1,0,2,3],[1,0,3,1]]

**Output:** 6

**Explanation:** A total area of 6 is covered by all three rectangales, as illustrated in the picture. 

From (1,1) to (2,2), the green and red rectangles overlap. 

From (1,0) to (2,3), all three rectangles overlap.

**Example 2:**

**Input:** rectangles = [[0,0,1000000000,1000000000]]

**Output:** 49

**Explanation:** The answer is 10<sup>18</sup> modulo (10<sup>9</sup> + 7), which is 49.

**Constraints:**

*   `1 <= rectangles.length <= 200`
*   `rectanges[i].length == 4`
*   <code>0 <= x<sub>i1</sub>, y<sub>i1</sub>, x<sub>i2</sub>, y<sub>i2</sub> <= 10<sup>9</sup></code>