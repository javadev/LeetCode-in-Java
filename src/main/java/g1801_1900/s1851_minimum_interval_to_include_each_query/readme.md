1851\. Minimum Interval to Include Each Query

Hard

You are given a 2D integer array `intervals`, where <code>intervals[i] = [left<sub>i</sub>, right<sub>i</sub>]</code> describes the <code>i<sup>th</sup></code> interval starting at <code>left<sub>i</sub></code> and ending at <code>right<sub>i</sub></code> **(inclusive)**. The **size** of an interval is defined as the number of integers it contains, or more formally <code>right<sub>i</sub> - left<sub>i</sub> + 1</code>.

You are also given an integer array `queries`. The answer to the <code>j<sup>th</sup></code> query is the **size of the smallest interval** `i` such that <code>left<sub>i</sub> <= queries[j] <= right<sub>i</sub></code>. If no such interval exists, the answer is `-1`.

Return _an array containing the answers to the queries_.

**Example 1:**

**Input:** intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5]

**Output:** [3,3,1,4]

**Explanation:** The queries are processed as follows: 

- Query = 2: The interval [2,4] is the smallest interval containing 2. The answer is 4 - 2 + 1 = 3.

- Query = 3: The interval [2,4] is the smallest interval containing 3. The answer is 4 - 2 + 1 = 3. 

- Query = 4: The interval [4,4] is the smallest interval containing 4. The answer is 4 - 4 + 1 = 1.

- Query = 5: The interval [3,6] is the smallest interval containing 5. The answer is 6 - 3 + 1 = 4.

**Example 2:**

**Input:** intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22]

**Output:** [2,-1,4,6]

**Explanation:** The queries are processed as follows: 

- Query = 2: The interval [2,3] is the smallest interval containing 2. The answer is 3 - 2 + 1 = 2.

- Query = 19: None of the intervals contain 19. The answer is -1. 

- Query = 5: The interval [2,5] is the smallest interval containing 5. The answer is 5 - 2 + 1 = 4. 

- Query = 22: The interval [20,25] is the smallest interval containing 22. The answer is 25 - 20 + 1 = 6.

**Constraints:**

*   <code>1 <= intervals.length <= 10<sup>5</sup></code>
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   `intervals[i].length == 2`
*   <code>1 <= left<sub>i</sub> <= right<sub>i</sub> <= 10<sup>7</sup></code>
*   <code>1 <= queries[j] <= 10<sup>7</sup></code>