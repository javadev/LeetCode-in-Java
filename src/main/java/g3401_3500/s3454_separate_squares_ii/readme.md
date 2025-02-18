3454\. Separate Squares II

Hard

You are given a 2D integer array `squares`. Each <code>squares[i] = [x<sub>i</sub>, y<sub>i</sub>, l<sub>i</sub>]</code> represents the coordinates of the bottom-left point and the side length of a square parallel to the x-axis.

Find the **minimum** y-coordinate value of a horizontal line such that the total area covered by squares above the line _equals_ the total area covered by squares below the line.

Answers within <code>10<sup>-5</sup></code> of the actual answer will be accepted.

**Note**: Squares **may** overlap. Overlapping areas should be counted **only once** in this version.

**Example 1:**

**Input:** squares = [[0,0,1],[2,2,1]]

**Output:** 1.00000

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/01/15/4065example1drawio.png)

Any horizontal line between `y = 1` and `y = 2` results in an equal split, with 1 square unit above and 1 square unit below. The minimum y-value is 1.

**Example 2:**

**Input:** squares = [[0,0,2],[1,1,1]]

**Output:** 1.00000

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/01/15/4065example2drawio.png)

Since the blue square overlaps with the red square, it will not be counted again. Thus, the line `y = 1` splits the squares into two equal parts.

**Constraints:**

*   <code>1 <= squares.length <= 5 * 10<sup>4</sup></code>
*   <code>squares[i] = [x<sub>i</sub>, y<sub>i</sub>, l<sub>i</sub>]</code>
*   `squares[i].length == 3`
*   <code>0 <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>1 <= l<sub>i</sub> <= 10<sup>9</sup></code>