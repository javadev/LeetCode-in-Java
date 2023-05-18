1288\. Remove Covered Intervals

Medium

Given an array `intervals` where <code>intervals[i] = [l<sub>i</sub>, r<sub>i</sub>]</code> represent the interval <code>[l<sub>i</sub>, r<sub>i</sub>)</code>, remove all intervals that are covered by another interval in the list.

The interval `[a, b)` is covered by the interval `[c, d)` if and only if `c <= a` and `b <= d`.

Return _the number of remaining intervals_.

**Example 1:**

**Input:** intervals = [[1,4],[3,6],[2,8]]

**Output:** 2

**Explanation:** Interval [3,6] is covered by [2,8], therefore it is removed.

**Example 2:**

**Input:** intervals = [[1,4],[2,3]]

**Output:** 1

**Constraints:**

*   `1 <= intervals.length <= 1000`
*   `intervals[i].length == 2`
*   <code>0 <= l<sub>i</sub> < r<sub>i</sub> <= 10<sup>5</sup></code>
*   All the given intervals are **unique**.