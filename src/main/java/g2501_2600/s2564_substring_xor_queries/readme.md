2564\. Substring XOR Queries

Medium

You are given a **binary string** `s`, and a **2D** integer array `queries` where <code>queries[i] = [first<sub>i</sub>, second<sub>i</sub>]</code>.

For the <code>i<sup>th</sup></code> query, find the **shortest substring** of `s` whose **decimal value**, `val`, yields <code>second<sub>i</sub></code> when **bitwise XORed** with <code>first<sub>i</sub></code>. In other words, <code>val ^ first<sub>i</sub> == second<sub>i</sub></code>.

The answer to the <code>i<sup>th</sup></code> query is the endpoints (**0-indexed**) of the substring <code>[left<sub>i</sub>, right<sub>i</sub>]</code> or `[-1, -1]` if no such substring exists. If there are multiple answers, choose the one with the **minimum** <code>left<sub>i</sub></code>.

_Return an array_ `ans` _where_ <code>ans[i] = [left<sub>i</sub>, right<sub>i</sub>]</code> _is the answer to the_ <code>i<sup>th</sup></code> _query._

A **substring** is a contiguous non-empty sequence of characters within a string.

**Example 1:**

**Input:** s = "101101", queries = [[0,5],[1,2]]

**Output:** [[0,2],[2,3]]

**Explanation:** For the first query the substring in range `[0,2]` is **"101"** which has a decimal value of **`5`**, and **`5 ^ 0 = 5`**, hence the answer to the first query is `[0,2]`. In the second query, the substring in range `[2,3]` is **"11",** and has a decimal value of **3**, and **3 `^ 1 = 2`**. So, `[2,3]` is returned for the second query.

**Example 2:**

**Input:** s = "0101", queries = [[12,8]]

**Output:** [[-1,-1]]

**Explanation:** In this example there is no substring that answers the query, hence `[-1,-1] is returned`.

**Example 3:**

**Input:** s = "1", queries = [[4,5]]

**Output:** [[0,0]]

**Explanation:** For this example, the substring in range `[0,0]` has a decimal value of **`1`**, and **`1 ^ 4 = 5`**. So, the answer is `[0,0]`.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>4</sup></code>
*   `s[i]` is either `'0'` or `'1'`.
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   <code>0 <= first<sub>i</sub>, second<sub>i</sub> <= 10<sup>9</sup></code>