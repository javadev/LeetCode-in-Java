1353\. Maximum Number of Events That Can Be Attended

Medium

You are given an array of `events` where <code>events[i] = [startDay<sub>i</sub>, endDay<sub>i</sub>]</code>. Every event `i` starts at <code>startDay<sub>i</sub></code> and ends at <code>endDay<sub>i</sub></code>.

You can attend an event `i` at any day `d` where <code>startTime<sub>i</sub> <= d <= endTime<sub>i</sub></code>. You can only attend one event at any time `d`.

Return _the maximum number of events you can attend_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/02/05/e1.png)

**Input:** events = [[1,2],[2,3],[3,4]]

**Output:** 3

**Explanation:** You can attend all the three events. 

One way to attend them all is as shown. 

Attend the first event on day 1. 

Attend the second event on day 2. 

Attend the third event on day 3.

**Example 2:**

**Input:** events= [[1,2],[2,3],[3,4],[1,2]]

**Output:** 4

**Constraints:**

*   <code>1 <= events.length <= 10<sup>5</sup></code>
*   `events[i].length == 2`
*   <code>1 <= startDay<sub>i</sub> <= endDay<sub>i</sub> <= 10<sup>5</sup></code>