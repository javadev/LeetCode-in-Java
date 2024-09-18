3288\. Length of the Longest Increasing Path

Hard

You are given a 2D array of integers `coordinates` of length `n` and an integer `k`, where `0 <= k < n`.

<code>coordinates[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> indicates the point <code>(x<sub>i</sub>, y<sub>i</sub>)</code> in a 2D plane.

An **increasing path** of length `m` is defined as a list of points <code>(x<sub>1</sub>, y<sub>1</sub>)</code>, <code>(x<sub>2</sub>, y<sub>2</sub>)</code>, <code>(x<sub>3</sub>, y<sub>3</sub>)</code>, ..., <code>(x<sub>m</sub>, y<sub>m</sub>)</code> such that:

*   <code>x<sub>i</sub> < x<sub>i + 1</sub></code> and <code>y<sub>i</sub> < y<sub>i + 1</sub></code> for all `i` where `1 <= i < m`.
*   <code>(x<sub>i</sub>, y<sub>i</sub>)</code> is in the given coordinates for all `i` where `1 <= i <= m`.

Return the **maximum** length of an **increasing path** that contains `coordinates[k]`.

**Example 1:**

**Input:** coordinates = [[3,1],[2,2],[4,1],[0,0],[5,3]], k = 1

**Output:** 3

**Explanation:**

`(0, 0)`, `(2, 2)`, `(5, 3)` is the longest increasing path that contains `(2, 2)`.

**Example 2:**

**Input:** coordinates = [[2,1],[7,0],[5,6]], k = 2

**Output:** 2

**Explanation:**

`(2, 1)`, `(5, 6)` is the longest increasing path that contains `(5, 6)`.

**Constraints:**

*   <code>1 <= n == coordinates.length <= 10<sup>5</sup></code>
*   `coordinates[i].length == 2`
*   <code>0 <= coordinates[i][0], coordinates[i][1] <= 10<sup>9</sup></code>
*   All elements in `coordinates` are **distinct**.
*   `0 <= k <= n - 1`