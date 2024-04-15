1751\. Maximum Number of Events That Can Be Attended II

Hard

You are given an array of `events` where <code>events[i] = [startDay<sub>i</sub>, endDay<sub>i</sub>, value<sub>i</sub>]</code>. The <code>i<sup>th</sup></code> event starts at <code>startDay<sub>i</sub></code> and ends at <code>endDay<sub>i</sub></code>, and if you attend this event, you will receive a value of <code>value<sub>i</sub></code>. You are also given an integer `k` which represents the maximum number of events you can attend.

You can only attend one event at a time. If you choose to attend an event, you must attend the **entire** event. Note that the end day is **inclusive**: that is, you cannot attend two events where one of them starts and the other ends on the same day.

Return _the **maximum sum** of values that you can receive by attending events._

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-60048-pm.png)

**Input:** events = [[1,2,4],[3,4,3],[2,3,1]], k = 2

**Output:** 7

**Explanation:** Choose the green events, 0 and 1 (0-indexed) for a total value of 4 + 3 = 7.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-60150-pm.png)

**Input:** events = [[1,2,4],[3,4,3],[2,3,10]], k = 2

**Output:** 10

**Explanation:** Choose event 2 for a total value of 10. Notice that you cannot attend any other event as they overlap, and that you do **not** have to attend k events.

**Example 3:**

**![](https://assets.leetcode.com/uploads/2021/01/10/screenshot-2021-01-11-at-60703-pm.png)**

**Input:** events = [[1,1,1],[2,2,2],[3,3,3],[4,4,4]], k = 3

**Output:** 9

**Explanation:** Although the events do not overlap, you can only attend 3 events. Pick the highest valued three.

**Constraints:**

*   `1 <= k <= events.length`
*   <code>1 <= k * events.length <= 10<sup>6</sup></code>
*   <code>1 <= startDay<sub>i</sub> <= endDay<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>1 <= value<sub>i</sub> <= 10<sup>6</sup></code>