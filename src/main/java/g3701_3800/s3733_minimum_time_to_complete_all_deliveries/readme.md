3733\. Minimum Time to Complete All Deliveries

Medium

You are given two integer arrays of size 2: <code>d = [d<sub>1</sub>, d<sub>2</sub>]</code> and <code>r = [r<sub>1</sub>, r<sub>2</sub>]</code>.

Two delivery drones are tasked with completing a specific number of deliveries. Drone `i` must complete <code>d<sub>i</sub></code> deliveries.

Each delivery takes **exactly** one hour and **only one** drone can make a delivery at any given hour.

Additionally, both drones require recharging at specific intervals during which they cannot make deliveries. Drone `i` must recharge every <code>r<sub>i</sub></code> hours (i.e. at hours that are multiples of <code>r<sub>i</sub></code>).

Return an integer denoting the **minimum** total time (in hours) required to complete all deliveries.

**Example 1:**

**Input:** d = [3,1], r = [2,3]

**Output:** 5

**Explanation:**

*   The first drone delivers at hours 1, 3, 5 (recharges at hours 2, 4).
*   The second drone delivers at hour 2 (recharges at hour 3).

**Example 2:**

**Input:** d = [1,3], r = [2,2]

**Output:** 7

**Explanation:**

*   The first drone delivers at hour 3 (recharges at hours 2, 4, 6).
*   The second drone delivers at hours 1, 5, 7 (recharges at hours 2, 4, 6).

**Example 3:**

**Input:** d = [2,1], r = [3,4]

**Output:** 3

**Explanation:**

*   The first drone delivers at hours 1, 2 (recharges at hour 3).
*   The second drone delivers at hour 3.

**Constraints:**

*   <code>d = [d<sub>1</sub>, d<sub>2</sub>]</code>
*   <code>1 <= d<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>r = [r<sub>1</sub>, r<sub>2</sub>]</code>
*   <code>2 <= r<sub>i</sub> <= 3 * 10<sup>4</sup></code>