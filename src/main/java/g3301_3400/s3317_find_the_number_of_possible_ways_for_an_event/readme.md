3317\. Find the Number of Possible Ways for an Event

Hard

You are given three integers `n`, `x`, and `y`.

An event is being held for `n` performers. When a performer arrives, they are **assigned** to one of the `x` stages. All performers assigned to the **same** stage will perform together as a band, though some stages _might_ remain **empty**.

After all performances are completed, the jury will **award** each band a score in the range `[1, y]`.

Return the **total** number of possible ways the event can take place.

Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Note** that two events are considered to have been held **differently** if **either** of the following conditions is satisfied:

*   **Any** performer is _assigned_ a different stage.
*   **Any** band is _awarded_ a different score.

**Example 1:**

**Input:** n = 1, x = 2, y = 3

**Output:** 6

**Explanation:**

*   There are 2 ways to assign a stage to the performer.
*   The jury can award a score of either 1, 2, or 3 to the only band.

**Example 2:**

**Input:** n = 5, x = 2, y = 1

**Output:** 32

**Explanation:**

*   Each performer will be assigned either stage 1 or stage 2.
*   All bands will be awarded a score of 1.

**Example 3:**

**Input:** n = 3, x = 3, y = 4

**Output:** 684

**Constraints:**

*   `1 <= n, x, y <= 1000`