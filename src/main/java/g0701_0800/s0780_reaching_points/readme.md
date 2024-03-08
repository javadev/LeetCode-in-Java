780\. Reaching Points

Hard

Given four integers `sx`, `sy`, `tx`, and `ty`, return `true` _if it is possible to convert the point_ `(sx, sy)` _to the point_ `(tx, ty)` _through some operations__, or_ `false` _otherwise_.

The allowed operation on some point `(x, y)` is to convert it to either `(x, x + y)` or `(x + y, y)`.

**Example 1:**

**Input:** sx = 1, sy = 1, tx = 3, ty = 5

**Output:** true

**Explanation:**

    One series of moves that transforms the starting point to the target is:
    (1, 1) -> (1, 2)
    (1, 2) -> (3, 2)
    (3, 2) -> (3, 5) 

**Example 2:**

**Input:** sx = 1, sy = 1, tx = 2, ty = 2

**Output:** false 

**Example 3:**

**Input:** sx = 1, sy = 1, tx = 1, ty = 1

**Output:** true 

**Constraints:**

*   <code>1 <= sx, sy, tx, ty <= 10<sup>9</sup></code>