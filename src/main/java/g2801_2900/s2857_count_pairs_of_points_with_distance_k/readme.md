2857\. Count Pairs of Points With Distance k

Medium

You are given a **2D** integer array `coordinates` and an integer `k`, where <code>coordinates[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> are the coordinates of the <code>i<sup>th</sup></code> point in a 2D plane.

We define the **distance** between two points <code>(x<sub>1</sub>, y<sub>1</sub>)</code> and <code>(x<sub>2</sub>, y<sub>2</sub>)</code> as `(x1 XOR x2) + (y1 XOR y2)` where `XOR` is the bitwise `XOR` operation.

Return _the number of pairs_ `(i, j)` _such that_ `i < j` _and the distance between points_ `i` _and_ `j` _is equal to_ `k`.

**Example 1:**

**Input:** coordinates = [[1,2],[4,2],[1,3],[5,2]], k = 5

**Output:** 2

**Explanation:** We can choose the following pairs: 
- (0,1): Because we have (1 XOR 4) + (2 XOR 2) = 5. 
- (2,3): Because we have (1 XOR 5) + (3 XOR 2) = 5.

**Example 2:**

**Input:** coordinates = [[1,3],[1,3],[1,3],[1,3],[1,3]], k = 0

**Output:** 10

**Explanation:** Any two chosen pairs will have a distance of 0. There are 10 ways to choose two pairs.

**Constraints:**

*   `2 <= coordinates.length <= 50000`
*   <code>0 <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>6</sup></code>
*   `0 <= k <= 100`