4009\. Minimum Possible Maximum Waiting Time

Hard

You are given an integer array `demand`, where `demand[i]` is the amount of fuel required by the <code>i<sup>th</sup></code> car.

You are also given an integer array `fuel` of length 2. There are **exactly** two fuel dispensers, numbered 0 and 1, where `fuel[j]` is the initial amount of fuel available in dispenser `j`.

Cars are allowed to start refueling in **increasing** index order. Car 0 becomes allowed at time 0, and for each `i > 0`, car `i` becomes allowed **exactly** when car `i - 1` starts refueling.

The refueling process follows these rules:

*   Each dispenser can serve **at most** one car at a time.
*   When a car becomes allowed, you must choose a dispenser with **at least** `demand[i]` fuel remaining. If both dispensers have enough fuel remaining, you may choose **either** of them, regardless of when they become free.
*   The car waits until the chosen dispenser becomes free and starts refueling **immediately**. It cannot switch dispensers or intentionally wait after the chosen dispenser becomes free.
*   When a car starts refueling, the remaining fuel in the chosen dispenser decreases by `demand[i]`, and the dispenser remains occupied for `demand[i]` seconds.
*   Once started, refueling cannot be interrupted.
*   If neither dispenser has at least `demand[i]` fuel remaining when car `i` becomes allowed, the process terminates and no further cars can be served.

The **waiting time** of a car is the time between when it becomes allowed to start refueling and when it actually starts.

Return the **minimum** possible value of the **maximum** waiting time among all served cars over all assignments that **maximize** the number of served cars. If no car can be served, return -1.

**Example 1:**

**Input:** demand = [6,8,4,6,5], fuel = [16,13]

**Output:** 6

**Explanation:**

The following assignment serves all five cars:

| Car | Becomes allowed at | Starts refueling at | Dispenser used | Remaining fuel before start <br> (dispenser 0, dispenser 1) | Waiting time |
| --- | --- | --- | --- | --- | --- |
| 0 | 0 | 0 | 0 | (16, 13) | 0 |
| 1 | 0 | 0 | 1 | (10, 13) | 0 |
| 2 | 0 | 6 | 0 | (10, 5) | 6 |
| 3 | 6 | 10 | 0 | (6, 5) | 4 |
| 4 | 10 | 10 | 1 | (0, 5) | 0 |

Thus, all five cars are served, and the maximum waiting time is 6.

To serve all five cars, dispenser 0 must serve the cars with demands 6, 4, and 6, while dispenser 1 must serve the cars with demands 8 and 5. Therefore, car 2 must wait until time 6 for dispenser 0 to become free, so no assignment serving all five cars can have a maximum waiting time less than 6.

**Example 2:**

**Input:** demand = [10,15], fuel = [12,17]

**Output:** 0

**Explanation:**

*   At time 0, Car 0 becomes allowed and starts refuelling using dispenser 0.
*   Car 1 becomes allowed at time 0 (when Car 0 starts) and immediately starts refuelling using dispenser 1.
*   Both cars start without waiting, so the maximum waiting time is 0.

**Example 3:**

**Input:** demand = [10,5], fuel = [8,8]

**Output:** \-1

**Explanation:**

*   At time 0, Car 0 becomes allowed. However, neither dispenser has enough fuel to serve it, so the process terminates immediately.
*   No car is served, so the answer is -1.

**Constraints:**

*   `1 <= demand.length <= 50`
*   `1 <= demand[i] <= 20`
*   `fuel.length == 2`
*   `1 <= fuel[i] <= 50`