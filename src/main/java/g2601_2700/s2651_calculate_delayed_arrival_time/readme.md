2651\. Calculate Delayed Arrival Time

Easy

You are given a positive integer `arrivalTime` denoting the arrival time of a train in hours, and another positive integer `delayedTime` denoting the amount of delay in hours.

Return _the time when the train will arrive at the station._

Note that the time in this problem is in 24-hours format.

**Example 1:**

**Input:** arrivalTime = 15, delayedTime = 5

**Output:** 20

**Explanation:** Arrival time of the train was 15:00 hours. It is delayed by 5 hours. Now it will reach at 15+5 = 20 (20:00 hours).

**Example 2:**

**Input:** arrivalTime = 13, delayedTime = 11

**Output:** 0

**Explanation:** Arrival time of the train was 13:00 hours. It is delayed by 11 hours. Now it will reach at 13+11=24 (Which is denoted by 00:00 in 24 hours format so return 0).

**Constraints:**

*   `1 <= arrivaltime < 24`
*   `1 <= delayedTime <= 24`