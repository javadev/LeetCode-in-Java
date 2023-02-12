2446\. Determine if Two Events Have Conflict

Easy

You are given two arrays of strings that represent two inclusive events that happened **on the same day**, `event1` and `event2`, where:

*   <code>event1 = [startTime<sub>1</sub>, endTime<sub>1</sub>]</code> and
*   <code>event2 = [startTime<sub>2</sub>, endTime<sub>2</sub>]</code>.

Event times are valid 24 hours format in the form of `HH:MM`.

A **conflict** happens when two events have some non-empty intersection (i.e., some moment is common to both events).

Return `true` _if there is a conflict between two events. Otherwise, return_ `false`.

**Example 1:**

**Input:** event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]

**Output:** true

**Explanation:** The two events intersect at time 2:00.

**Example 2:**

**Input:** event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]

**Output:** true

**Explanation:** The two events intersect starting from 01:20 to 02:00.

**Example 3:**

**Input:** event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]

**Output:** false

**Explanation:** The two events do not intersect.

**Constraints:**

*   `evnet1.length == event2.length == 2.`
*   `event1[i].length == event2[i].length == 5`
*   <code>startTime<sub>1</sub> <= endTime<sub>1</sub></code>
*   <code>startTime<sub>2</sub> <= endTime<sub>2</sub></code>
*   All the event times follow the `HH:MM` format.