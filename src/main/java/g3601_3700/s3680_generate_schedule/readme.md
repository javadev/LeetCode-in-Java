3680\. Generate Schedule

Medium

You are given an integer `n` representing `n` teams. You are asked to generate a schedule such that:

*   Each team plays every other team **exactly twice**: once at home and once away.
*   There is **exactly one** match per day; the schedule is a list of **consecutive** days and `schedule[i]` is the match on day `i`.
*   No team plays on **consecutive** days.

Return a 2D integer array `schedule`, where `schedule[i][0]` represents the home team and `schedule[i][1]` represents the away team. If multiple schedules meet the conditions, return **any** one of them.

If no schedule exists that meets the conditions, return an empty array.

**Example 1:**

**Input:** n = 3

**Output:** []

**Explanation:**

Since each team plays every other team exactly twice, a total of 6 matches need to be played: `[0,1],[0,2],[1,2],[1,0],[2,0],[2,1]`.

It's not possible to create a schedule without at least one team playing consecutive days.

**Example 2:**

**Input:** n = 5

**Output:** [[0,1],[2,3],[0,4],[1,2],[3,4],[0,2],[1,3],[2,4],[0,3],[1,4],[2,0],[3,1],[4,0],[2,1],[4,3],[1,0],[3,2],[4,1],[3,0],[4,2]]

**Explanation:**

Since each team plays every other team exactly twice, a total of 20 matches need to be played.

The output shows one of the schedules that meet the conditions. No team plays on consecutive days.

**Constraints:**

*   `2 <= n <= 50`