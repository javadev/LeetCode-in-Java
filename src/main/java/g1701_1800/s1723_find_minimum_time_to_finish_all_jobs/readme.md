1723\. Find Minimum Time to Finish All Jobs

Hard

You are given an integer array `jobs`, where `jobs[i]` is the amount of time it takes to complete the <code>i<sup>th</sup></code> job.

There are `k` workers that you can assign jobs to. Each job should be assigned to **exactly** one worker. The **working time** of a worker is the sum of the time it takes to complete all jobs assigned to them. Your goal is to devise an optimal assignment such that the **maximum working time** of any worker is **minimized**.

_Return the **minimum** possible **maximum working time** of any assignment._

**Example 1:**

**Input:** jobs = [3,2,3], k = 3

**Output:** 3

**Explanation:** By assigning each person one job, the maximum time is 3.

**Example 2:**

**Input:** jobs = [1,2,4,7,8], k = 2

**Output:** 11

**Explanation:** Assign the jobs the following way: 

Worker 1: 1, 2, 8 (working time = 1 + 2 + 8 = 11) 

Worker 2: 4, 7 (working time = 4 + 7 = 11) 

The maximum working time is 11.

**Constraints:**

*   `1 <= k <= jobs.length <= 12`
*   <code>1 <= jobs[i] <= 10<sup>7</sup></code>