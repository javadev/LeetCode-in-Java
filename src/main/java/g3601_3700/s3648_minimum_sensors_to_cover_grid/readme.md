3648\. Minimum Sensors to Cover Grid

Medium

You are given `n × m` grid and an integer `k`.

A sensor placed on cell `(r, c)` covers all cells whose **Chebyshev distance** from `(r, c)` is **at most** `k`.

The **Chebyshev distance** between two cells <code>(r<sub>1</sub>, c<sub>1</sub>)</code> and <code>(r<sub>2</sub>, c<sub>2</sub>)</code> is <code>max(|r<sub>1</sub> − r<sub>2</sub>|,|c<sub>1</sub> − c<sub>2</sub>|)</code>.

Your task is to return the **minimum** number of sensors required to cover every cell of the grid.

**Example 1:**

**Input:** n = 5, m = 5, k = 1

**Output:** 4

**Explanation:**

Placing sensors at positions `(0, 3)`, `(1, 0)`, `(3, 3)`, and `(4, 1)` ensures every cell in the grid is covered. Thus, the answer is 4.

**Example 2:**

**Input:** n = 2, m = 2, k = 2

**Output:** 1

**Explanation:**

With `k = 2`, a single sensor can cover the entire `2 * 2` grid regardless of its position. Thus, the answer is 1.

**Constraints:**

*   <code>1 <= n <= 10<sup>3</sup></code>
*   <code>1 <= m <= 10<sup>3</sup></code>
*   <code>0 <= k <= 10<sup>3</sup></code>