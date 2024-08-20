3261\. Count Substrings That Satisfy K-Constraint II

Hard

You are given a **binary** string `s` and an integer `k`.

You are also given a 2D integer array `queries`, where <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>.

A **binary string** satisfies the **k-constraint** if **either** of the following conditions holds:

*   The number of `0`'s in the string is at most `k`.
*   The number of `1`'s in the string is at most `k`.

Return an integer array `answer`, where `answer[i]` is the number of substrings of <code>s[l<sub>i</sub>..r<sub>i</sub>]</code> that satisfy the **k-constraint**.

**Example 1:**

**Input:** s = "0001111", k = 2, queries = [[0,6]]

**Output:** [26]

**Explanation:**

For the query `[0, 6]`, all substrings of `s[0..6] = "0001111"` satisfy the k-constraint except for the substrings `s[0..5] = "000111"` and `s[0..6] = "0001111"`.

**Example 2:**

**Input:** s = "010101", k = 1, queries = [[0,5],[1,4],[2,3]]

**Output:** [15,9,3]

**Explanation:**

The substrings of `s` with a length greater than 3 do not satisfy the k-constraint.

**Constraints:**

*   <code>1 <= s.length <= 10<sup>5</sup></code>
*   `s[i]` is either `'0'` or `'1'`.
*   `1 <= k <= s.length`
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   <code>queries[i] == [l<sub>i</sub>, r<sub>i</sub>]</code>
*   <code>0 <= l<sub>i</sub> <= r<sub>i</sub> < s.length</code>
*   All queries are distinct.