1499\. Max Value of Equation

Hard

You are given an array `points` containing the coordinates of points on a 2D plane, sorted by the x-values, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> such that <code>x<sub>i</sub> < x<sub>j</sub></code> for all `1 <= i < j <= points.length`. You are also given an integer `k`.

Return _the maximum value of the equation_ <code>y<sub>i</sub> + y<sub>j</sub> + |x<sub>i</sub> - x<sub>j</sub>|</code> where <code>|x<sub>i</sub> - x<sub>j</sub>| <= k</code> and `1 <= i < j <= points.length`.

It is guaranteed that there exists at least one pair of points that satisfy the constraint <code>|x<sub>i</sub> - x<sub>j</sub>| <= k</code>.

**Example 1:**

**Input:** points = [[1,3],[2,0],[5,10],[6,-10]], k = 1

**Output:** 4

**Explanation:** The first two points satisfy the condition |x<sub>i</sub> - x<sub>j</sub>| <= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.

No other pairs satisfy the condition, so we return the max of 4 and 1.

**Example 2:**

**Input:** points = [[0,0],[3,0],[9,2]], k = 3

**Output:** 3

**Explanation:** Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.

**Constraints:**

*   <code>2 <= points.length <= 10<sup>5</sup></code>
*   `points[i].length == 2`
*   <code>-10<sup>8</sup> <= x<sub>i</sub>, y<sub>i</sub> <= 10<sup>8</sup></code>
*   <code>0 <= k <= 2 * 10<sup>8</sup></code>
*   <code>x<sub>i</sub> < x<sub>j</sub></code> for all `1 <= i < j <= points.length`
*   <code>x<sub>i</sub></code> form a strictly increasing sequence.