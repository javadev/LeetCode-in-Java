3693\. Climbing Stairs II

Medium

You are climbing a staircase with `n + 1` steps, numbered from 0 to `n`.

You are also given a **1-indexed** integer array `costs` of length `n`, where `costs[i]` is the cost of step `i`.

From step `i`, you can jump **only** to step `i + 1`, `i + 2`, or `i + 3`. The cost of jumping from step `i` to step `j` is defined as: <code>costs[j] + (j - i)<sup>2</sup></code>

You start from step 0 with `cost = 0`.

Return the **minimum** total cost to reach step `n`.

**Example 1:**

**Input:** n = 4, costs = [1,2,3,4]

**Output:** 13

**Explanation:**

One optimal path is `0 → 1 → 2 → 4`

Jump

Cost Calculation

Cost

0 → 1

<code>costs[1] + (1 - 0)<sup>2</sup> = 1 + 1</code>

2

1 → 2

<code>costs[2] + (2 - 1)<sup>2</sup> = 2 + 1</code>

3

2 → 4

<code>costs[4] + (4 - 2)<sup>2</sup> = 4 + 4</code>

8

Thus, the minimum total cost is `2 + 3 + 8 = 13`

**Example 2:**

**Input:** n = 4, costs = [5,1,6,2]

**Output:** 11

**Explanation:**

One optimal path is `0 → 2 → 4`

Jump

Cost Calculation

Cost

0 → 2

<code>costs[2] + (2 - 0)<sup>2</sup> = 1 + 4</code>

5

2 → 4

<code>costs[4] + (4 - 2)<sup>2</sup> = 2 + 4</code>

6

Thus, the minimum total cost is `5 + 6 = 11`

**Example 3:**

**Input:** n = 3, costs = [9,8,3]

**Output:** 12

**Explanation:**

The optimal path is `0 → 3` with total cost = <code>costs[3] + (3 - 0)<sup>2</sup> = 3 + 9 = 12</code>

**Constraints:**

*   <code>1 <= n == costs.length <= 10<sup>5</sup></code>
*   <code>1 <= costs[i] <= 10<sup>4</sup></code>