2662\. Minimum Cost of a Path With Special Roads

Medium

You are given an array `start` where `start = [startX, startY]` represents your initial position `(startX, startY)` in a 2D space. You are also given the array `target` where `target = [targetX, targetY]` represents your target position `(targetX, targetY)`.

The cost of going from a position `(x1, y1)` to any other position in the space `(x2, y2)` is `|x2 - x1| + |y2 - y1|`.

There are also some special roads. You are given a 2D array `specialRoads` where <code>specialRoads[i] = [x1<sub>i</sub>, y1<sub>i</sub>, x2<sub>i</sub>, y2<sub>i</sub>, cost<sub>i</sub>]</code> indicates that the <code>i<sup>th</sup></code> special road can take you from <code>(x1<sub>i</sub>, y1<sub>i</sub>)</code> to <code>(x2<sub>i</sub>, y2<sub>i</sub>)</code> with a cost equal to <code>cost<sub>i</sub></code>. You can use each special road any number of times.

Return _the minimum cost required to go from_ `(startX, startY)` to `(targetX, targetY)`.

**Example 1:**

**Input:** start = [1,1], target = [4,5], specialRoads = [[1,2,3,3,2],[3,4,4,5,1]]

**Output:** 5

**Explanation:** The optimal path from (1,1) to (4,5) is the following: 
- (1,1) -> (1,2). This move has a cost of |1 - 1| + |2 - 1| = 1. 
- (1,2) -> (3,3). This move uses the first special edge, the cost is 2. 
- (3,3) -> (3,4). This move has a cost of |3 - 3| + |4 - 3| = 1. 
- (3,4) -> (4,5). This move uses the second special edge, the cost is 1. 

So the total cost is 1 + 2 + 1 + 1 = 5. 

It can be shown that we cannot achieve a smaller total cost than 5.

**Example 2:**

**Input:** start = [3,2], target = [5,7], specialRoads = [[3,2,3,4,4],[3,3,5,5,5],[3,4,5,6,6]]

**Output:** 7

**Explanation:** It is optimal to not use any special edges and go directly from the starting to the ending position with a cost |5 - 3| + |7 - 2| = 7.

**Constraints:**

*   `start.length == target.length == 2`
*   <code>1 <= startX <= targetX <= 10<sup>5</sup></code>
*   <code>1 <= startY <= targetY <= 10<sup>5</sup></code>
*   `1 <= specialRoads.length <= 200`
*   `specialRoads[i].length == 5`
*   <code>startX <= x1<sub>i</sub>, x2<sub>i</sub> <= targetX</code>
*   <code>startY <= y1<sub>i</sub>, y2<sub>i</sub> <= targetY</code>
*   <code>1 <= cost<sub>i</sub> <= 10<sup>5</sup></code>