1124\. Longest Well-Performing Interval

Medium

We are given `hours`, a list of the number of hours worked per day for a given employee.

A day is considered to be a _tiring day_ if and only if the number of hours worked is (strictly) greater than `8`.

A _well-performing interval_ is an interval of days for which the number of tiring days is strictly larger than the number of non-tiring days.

Return the length of the longest well-performing interval.

**Example 1:**

**Input:** hours = [9,9,6,0,6,6,9]

**Output:** 3

**Explanation:** The longest well-performing interval is [9,9,6].

**Example 2:**

**Input:** hours = [6,6,6]

**Output:** 0

**Constraints:**

*   <code>1 <= hours.length <= 10<sup>4</sup></code>
*   `0 <= hours[i] <= 16`