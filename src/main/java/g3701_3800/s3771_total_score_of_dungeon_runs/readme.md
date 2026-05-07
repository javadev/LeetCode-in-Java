3771\. Total Score of Dungeon Runs

Medium

You are given a **positive** integer `hp` and two **positive** **1-indexed** integer arrays `damage` and `requirement`.

There is a dungeon with `n` trap rooms numbered from 1 to `n`. Entering room `i` reduces your health points by `damage[i]`. After that reduction, if your remaining health points are **at least** `requirement[i]`, you earn **1 point** for that room.

Let `score(j)` be the number of **points** you get if you start with `hp` health points and enter the rooms `j`, `j + 1`, ..., `n` in this order.

Return the integer `score(1) + score(2) + ... + score(n)`, the sum of scores over all starting rooms.

**Note**: You cannot skip rooms. You can finish your journey even if your health points become non-positive.

**Example 1:**

**Input:** hp = 11, damage = [3,6,7], requirement = [4,2,5]

**Output:** 3

**Explanation:**

`score(1) = 2`, `score(2) = 1`, `score(3) = 0`. The total score is `2 + 1 + 0 = 3`.

As an example, `score(1) = 2` because you get 2 points if you start from room 1.

*   You start with 11 health points.
*   Enter room 1. Your health points are now `11 - 3 = 8`. You get 1 point because `8 >= 4`.
*   Enter room 2. Your health points are now `8 - 6 = 2`. You get 1 point because `2 >= 2`.
*   Enter room 3. Your health points are now `2 - 7 = -5`. You do not get any points because `-5 < 5`.

**Example 2:**

**Input:** hp = 2, damage = [10000,1], requirement = [1,1]

**Output:** 1

**Explanation:**

`score(1) = 0`, `score(2) = 1`. The total score is `0 + 1 = 1`.

`score(1) = 0` because you do not get any points if you start from room 1.

*   You start with 2 health points.
*   Enter room 1. Your health points are now `2 - 10000 = -9998`. You do not get any points because `-9998 < 1`.
*   Enter room 2. Your health points are now `-9998 - 1 = -9999`. You do not get any points because `-9999 < 1`.

`score(2) = 1` because you get 1 point if you start from room 2.

*   You start with 2 health points.
*   Enter room 2. Your health points are now `2 - 1 = 1`. You get 1 point because `1 >= 1`.

**Constraints:**

*   <code>1 <= hp <= 10<sup>9</sup></code>
*   <code>1 <= n == damage.length == requirement.length <= 10<sup>5</sup></code>
*   <code>1 <= damage[i], requirement[i] <= 10<sup>4</sup></code>