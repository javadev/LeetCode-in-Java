3531\. Count Covered Buildings

Medium

You are given a positive integer `n`, representing an `n x n` city. You are also given a 2D grid `buildings`, where `buildings[i] = [x, y]` denotes a **unique** building located at coordinates `[x, y]`.

A building is **covered** if there is at least one building in all **four** directions: left, right, above, and below.

Return the number of **covered** buildings.

**Example 1:**

![](https://assets.leetcode.com/uploads/2025/03/04/telegram-cloud-photo-size-5-6212982906394101085-m.jpg)

**Input:** n = 3, buildings = [[1,2],[2,2],[3,2],[2,1],[2,3]]

**Output:** 1

**Explanation:**

*   Only building `[2,2]` is covered as it has at least one building:
    *   above (`[1,2]`)
    *   below (`[3,2]`)
    *   left (`[2,1]`)
    *   right (`[2,3]`)
*   Thus, the count of covered buildings is 1.

**Example 2:**

![](https://assets.leetcode.com/uploads/2025/03/04/telegram-cloud-photo-size-5-6212982906394101086-m.jpg)

**Input:** n = 3, buildings = [[1,1],[1,2],[2,1],[2,2]]

**Output:** 0

**Explanation:**

*   No building has at least one building in all four directions.

**Example 3:**

![](https://assets.leetcode.com/uploads/2025/03/16/telegram-cloud-photo-size-5-6248862251436067566-x.jpg)

**Input:** n = 5, buildings = [[1,3],[3,2],[3,3],[3,5],[5,3]]

**Output:** 1

**Explanation:**

*   Only building `[3,3]` is covered as it has at least one building:
    *   above (`[1,3]`)
    *   below (`[5,3]`)
    *   left (`[3,2]`)
    *   right (`[3,5]`)
*   Thus, the count of covered buildings is 1.

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   <code>1 <= buildings.length <= 10<sup>5</sup></code>
*   `buildings[i] = [x, y]`
*   `1 <= x, y <= n`
*   All coordinates of `buildings` are **unique**.