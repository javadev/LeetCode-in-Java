858\. Mirror Reflection

Medium

There is a special square room with mirrors on each of the four walls. Except for the southwest corner, there are receptors on each of the remaining corners, numbered `0`, `1`, and `2`.

The square room has walls of length `p` and a laser ray from the southwest corner first meets the east wall at a distance `q` from the <code>0<sup>th</sup></code> receptor.

Given the two integers `p` and `q`, return _the number of the receptor that the ray meets first_.

The test cases are guaranteed so that the ray will meet a receptor eventually.

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/06/18/reflection.png)

**Input:** p = 2, q = 1

**Output:** 2

**Explanation:** The ray meets receptor 2 the first time it gets reflected back to the left wall.

**Example 2:**

**Input:** p = 3, q = 1

**Output:** 1

**Constraints:**

*   `1 <= q <= p <= 1000`