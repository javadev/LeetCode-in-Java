554\. Brick Wall

Medium

There is a rectangular brick wall in front of you with `n` rows of bricks. The <code>i<sup>th</sup></code> row has some number of bricks each of the same height (i.e., one unit) but they can be of different widths. The total width of each row is the same.

Draw a vertical line from the top to the bottom and cross the least bricks. If your line goes through the edge of a brick, then the brick is not considered as crossed. You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.

Given the 2D array `wall` that contains the information about the wall, return _the minimum number of crossed bricks after drawing such a vertical line_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/04/24/cutwall-grid.jpg)

**Input:** wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]

**Output:** 2 

**Example 2:**

**Input:** wall = [[1],[1],[1]]

**Output:** 3 

**Constraints:**

*   `n == wall.length`
*   <code>1 <= n <= 10<sup>4</sup></code>
*   <code>1 <= wall[i].length <= 10<sup>4</sup></code>
*   <code>1 <= sum(wall[i].length) <= 2 * 10<sup>4</sup></code>
*   `sum(wall[i])` is the same for each row `i`.
*   <code>1 <= wall[i][j] <= 2<sup>31</sup> - 1</code>