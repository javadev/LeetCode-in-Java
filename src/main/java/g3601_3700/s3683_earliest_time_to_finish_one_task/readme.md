3683\. Earliest Time to Finish One Task

Easy

You are given a 2D integer array `tasks` where <code>tasks[i] = [s<sub>i</sub>, t<sub>i</sub>]</code>.

Each <code>[s<sub>i</sub>, t<sub>i</sub>]</code> in `tasks` represents a task with start time <code>s<sub>i</sub></code> that takes <code>t<sub>i</sub></code> units of time to finish.

Return the earliest time at which at least one task is finished.

**Example 1:**

**Input:** tasks = [[1,6],[2,3]]

**Output:** 5

**Explanation:**

The first task starts at time `t = 1` and finishes at time `1 + 6 = 7`. The second task finishes at time `2 + 3 = 5`. You can finish one task at time 5.

**Example 2:**

**Input:** tasks = [[100,100],[100,100],[100,100]]

**Output:** 200

**Explanation:**

All three tasks finish at time `100 + 100 = 200`.

**Constraints:**

*   `1 <= tasks.length <= 100`
*   <code>tasks[i] = [s<sub>i</sub>, t<sub>i</sub>]</code>
*   <code>1 <= s<sub>i</sub>, t<sub>i</sub> <= 100</code>