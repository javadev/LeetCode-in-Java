436\. Find Right Interval

Medium

You are given an array of `intervals`, where <code>intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> and each <code>start<sub>i</sub></code> is **unique**.

The **right interval** for an interval `i` is an interval `j` such that <code>start<sub>j</sub></code><code> >= end<sub>i</sub></code> and <code>start<sub>j</sub></code> is **minimized**.

Return _an array of **right interval** indices for each interval `i`_. If no **right interval** exists for interval `i`, then put `-1` at index `i`.

**Example 1:**

**Input:** intervals = [[1,2]]

**Output:** [-1]

**Explanation:** There is only one interval in the collection, so it outputs -1. 

**Example 2:**

**Input:** intervals = [[3,4],[2,3],[1,2]]

**Output:** [-1,0,1]

**Explanation:**

There is no right interval for [3,4].

The right interval for [2,3] is [3,4] since start<sub>0</sub> = 3 is the smallest start that is >= end<sub>1</sub> = 3.

The right interval for [1,2] is [2,3] since start<sub>1</sub> = 2 is the smallest start that is >= end<sub>2</sub> = 2.

**Example 3:**

**Input:** intervals = [[1,4],[2,3],[3,4]]

**Output:** [-1,2,-1]

**Explanation:**

There is no right interval for [1,4] and [3,4].

The right interval for [2,3] is [3,4] since start<sub>2</sub> = 3 is the smallest start that is >= end<sub>1</sub> = 3.

**Constraints:**

*   <code>1 <= intervals.length <= 2 * 10<sup>4</sup></code>
*   `intervals[i].length == 2`
*   <code>-10<sup>6</sup> <= start<sub>i</sub> <= end<sub>i</sub> <= 10<sup>6</sup></code>
*   The start point of each interval is **unique**.