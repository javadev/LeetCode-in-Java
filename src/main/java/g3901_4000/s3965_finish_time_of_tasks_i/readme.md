3965\. Finish Time of Tasks I

Medium

You are given an integer `n` representing the number of tasks in a project, numbered from 0 to `n - 1`. These tasks are connected as a **tree** rooted at task 0. This is represented by a 2D integer array `edges` of length `n - 1`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates that task <code>u<sub>i</sub></code> is the parent of task <code>v<sub>i</sub></code>.

You are also given an array `baseTime` of length `n`, where `baseTime[i]` represents the time to complete task `i`.

The **finish time** of each task is calculated as follows:

*   Leaf task: The finish time is `baseTime[i]`.
*   Non-leaf task:
    *   Let `earliest` be the **minimum** finish time among its children, and `latest` be the **maximum** finish time among its children.
    *   Let `ownDuration` be `(latest - earliest) + baseTime[i]`.
    *   The finish time of task `i` is `latest + ownDuration`.

Return the finish time of the root task 0.

**Example 1:**

**Input:** n = 3, edges = [[0,1],[1,2]], baseTime = [9,5,3]

**Output:** 17

**Explanation:**

![](https://leetcode-images.github.io/g3901_4000/s3965_finish_time_of_tasks_i/picture1.png) 

*   Task 2 is a leaf, so its finish time is `baseTime[2] = 3`.
*   Task 1 has one child task 2:
    *   `earliest = latest = 3`
    *   `ownDuration = (latest - earliest) + baseTime[1] = 5`
    *   Finish time of task 1 is `3 + 5 = 8`
*   Task 0 has one child with finish time 8:
    *   `earliest = latest = 8`
    *   `ownDuration = (latest - earliest) + baseTime[0] = 9`
    *   Finish time of task 0 is `8 + 9 = 17`

**Example 2:**

**Input:** n = 3, edges = [[0,1],[0,2]], baseTime = [4,7,6]

**Output:** 12

**Explanation:**

![](https://leetcode-images.github.io/g3901_4000/s3965_finish_time_of_tasks_i/picture2.png) 

*   Task 1 is a leaf, so its finish time is `baseTime[1] = 7`.
*   Task 2 is a leaf, so its finish time is `baseTime[2] = 6`.
*   Task 0 has two children with finish times 7 and 6:
    *   `earliest = 6`, `latest = 7`
    *   `ownDuration = (latest - earliest) + baseTime[0] = (7 - 6) + 4 = 5`
    *   Finish time of task 0 is `latest + ownDuration = 7 + 5 = 12`

**Example 3:**

**Input:** n = 4, edges = [[0,1],[0,2],[2,3]], baseTime = [5,8,2,1]

**Output:** 18

**Explanation:**

*   Task 1 is a leaf, so its finish time is `baseTime[1] = 8`.
*   Task 3 is a leaf, so its finish time is `baseTime[3] = 1`.
*   Task 2 has one child task 3:
    *   `earliest = latest = 1`
    *   `ownDuration = (latest - earliest) + baseTime[2] = 0 + 2 = 2`
    *   Finish time of task 2 is `latest + ownDuration = 1 + 2 = 3`
*   Task 0 has two children with finish times 8 and 3:
    *   `earliest = 3`, `latest = 8`
    *   `ownDuration = (latest - earliest) + baseTime[0] = (8 - 3) + 5 = 10`
    *   Finish time of task 0 is `latest + ownDuration = 8 + 10 = 18`

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>
*   `edges.length = n - 1`
*   <code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
*   <code>u<sub>i</sub> != v<sub>i</sub></code>
*   The input is generated such that `edges` represents a valid tree.
*   `baseTime.length == n`
*   <code>1 <= baseTime[i] <= 10<sup>5</sup></code>
*   The finish time of every task is guaranteed to be less than <code>2<sup>53</sup></code>.