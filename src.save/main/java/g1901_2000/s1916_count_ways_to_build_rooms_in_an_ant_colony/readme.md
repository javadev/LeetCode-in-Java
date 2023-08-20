1916\. Count Ways to Build Rooms in an Ant Colony

Hard

You are an ant tasked with adding `n` new rooms numbered `0` to `n-1` to your colony. You are given the expansion plan as a **0-indexed** integer array of length `n`, `prevRoom`, where `prevRoom[i]` indicates that you must build room `prevRoom[i]` before building room `i`, and these two rooms must be connected **directly**. Room `0` is already built, so `prevRoom[0] = -1`. The expansion plan is given such that once all the rooms are built, every room will be reachable from room `0`.

You can only build **one room** at a time, and you can travel freely between rooms you have **already built** only if they are **connected**. You can choose to build **any room** as long as its **previous room** is already built.

Return _the **number of different orders** you can build all the rooms in_. Since the answer may be large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/06/19/d1.JPG)

**Input:** prevRoom = [-1,0,1]

**Output:** 1

**Explanation:** There is only one way to build the additional rooms: 0 → 1 → 2

**Example 2:**

**![](https://assets.leetcode.com/uploads/2021/06/19/d2.JPG)**

**Input:** prevRoom = [-1,0,0,1,2]

**Output:** 6

**Explanation:** The 6 ways are: 

0 → 1 → 3 → 2 → 4 

0 → 2 → 4 → 1 → 3 

0 → 1 → 2 → 3 → 4 

0 → 1 → 2 → 4 → 3 

0 → 2 → 1 → 3 → 4 

0 → 2 → 1 → 4 → 3

**Constraints:**

*   `n == prevRoom.length`
*   <code>2 <= n <= 10<sup>5</sup></code>
*   `prevRoom[0] == -1`
*   `0 <= prevRoom[i] < n` for all `1 <= i < n`
*   Every room is reachable from room `0` once all the rooms are built.