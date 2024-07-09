3208\. Alternating Groups II

Medium

There is a circle of red and blue tiles. You are given an array of integers `colors` and an integer `k`. The color of tile `i` is represented by `colors[i]`:

*   `colors[i] == 0` means that tile `i` is **red**.
*   `colors[i] == 1` means that tile `i` is **blue**.

An **alternating** group is every `k` contiguous tiles in the circle with **alternating** colors (each tile in the group except the first and last one has a different color from its **left** and **right** tiles).

Return the number of **alternating** groups.

**Note** that since `colors` represents a **circle**, the **first** and the **last** tiles are considered to be next to each other.

**Example 1:**

**Input:** colors = [0,1,0,1,0], k = 3

**Output:** 3

**Explanation:**

**![](https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-183519.png)**

Alternating groups:

![](https://assets.leetcode.com/uploads/2024/05/28/screenshot-2024-05-28-182448.png)![](https://assets.leetcode.com/uploads/2024/05/28/screenshot-2024-05-28-182844.png)![](https://assets.leetcode.com/uploads/2024/05/28/screenshot-2024-05-28-183057.png)

**Example 2:**

**Input:** colors = [0,1,0,0,1,0,1], k = 6

**Output:** 2

**Explanation:**

**![](https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-183907.png)**

Alternating groups:

![](https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-184128.png)![](https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-184240.png)

**Example 3:**

**Input:** colors = [1,1,0,1], k = 4

**Output:** 0

**Explanation:**

![](https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-184516.png)

**Constraints:**

*   <code>3 <= colors.length <= 10<sup>5</sup></code>
*   `0 <= colors[i] <= 1`
*   `3 <= k <= colors.length`