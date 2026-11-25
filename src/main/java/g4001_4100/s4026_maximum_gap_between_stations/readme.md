4026\. Maximum Gap Between Stations

Medium

You are given two strings `skill` and `station` of lengths `n` and `m`, respectively.

`skill[i]` represents the skill of worker `i`, and `station[j]` represents the skill supported by station `j`.

You must assign **every** worker to a **distinct** station. Let <code>j<sub>i</sub></code> be the index of the station assigned to worker `i`. A valid assignment must satisfy:

*   <code>station[j<sub>i</sub>] == skill[i]</code> for every `0 <= i < n`.
*   The assigned station indices must be **strictly** increasing in worker order, meaning <code>j<sub>0</sub> < j<sub>1</sub> < ... < j<sub>n - 1</sub></code>.

The **gap** of an assignment is the **maximum difference** between the station indices assigned to two **consecutive** workers. In other words, it is <code>max(j<sub>i</sub> - j<sub>i - 1</sub>)</code> over all `1 <= i < n`.

If there is only one worker, the gap is 0.

Return the **maximum** possible gap among all valid assignments. It is guaranteed that **at least** one valid assignment exists.

**Example 1:**

**Input:** skill = "aa", station = "aaaa"

**Output:** 3

**Explanation:**

*   The two workers must be assigned to two different `'a'` stations.
*   Assigning them to stations `[0, 3]` gives a gap of 3.

**Example 2:**

**Input:** skill = "xyz", station = "xyzz"

**Output:** 2

**Explanation:**

*   Assign worker 0 to station `j = 0`, and worker 1 to station `j = 1`.
*   To maximize the gap, assign worker 2 to station `j = 3`.
*   This gives the assignment `[0, 1, 3]` with gaps `[1, 2]`, so the gap is 2.

**Example 3:**

**Input:** skill = "cbc", station = "cbcdbc"

**Output:** 4

**Explanation:**

*   Assign worker 0 to station `j = 0`, and worker 1 to station `j = 1`.
*   To maximize the gap, assign worker 2 to station `j = 5`.
*   This gives the assignment `[0, 1, 5]` with gaps `[1, 4]`, so the gap is 4.

**Constraints:**

*   `skill.length == n`
*   `station.length == m`
*   <code>1 <= n <= m <= 10<sup>5</sup></code>
*   `skill` and `station` consist of lowercase English letters.
*   It is guaranteed that a valid assignment exists for every worker.