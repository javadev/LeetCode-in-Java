598\. Range Addition II

Easy

You are given an `m x n` matrix `M` initialized with all `0`'s and an array of operations `ops`, where <code>ops[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> means `M[x][y]` should be incremented by one for all <code>0 <= x < a<sub>i</sub></code> and <code>0 <= y < b<sub>i</sub></code>.

Count and return _the number of maximum integers in the matrix after performing all the operations_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/02/ex1.jpg)

**Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

**Output:** 4

**Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4. 

**Example 2:**

**Input:** m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]

**Output:** 4 

**Example 3:**

**Input:** m = 3, n = 3, ops = []

**Output:** 9 

**Constraints:**

*   <code>1 <= m, n <= 4 * 10<sup>4</sup></code>
*   <code>0 <= ops.length <= 10<sup>4</sup></code>
*   `ops[i].length == 2`
*   <code>1 <= a<sub>i</sub> <= m</code>
*   <code>1 <= b<sub>i</sub> <= n</code>