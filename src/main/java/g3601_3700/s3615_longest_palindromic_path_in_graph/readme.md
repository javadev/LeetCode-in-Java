3615\. Longest Palindromic Path in Graph

Hard

You are given an integer `n` and an **undirected** graph with `n` nodes labeled from 0 to `n - 1` and a 2D array `edges`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates an edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>.

You are also given a string `label` of length `n`, where `label[i]` is the character associated with node `i`.

You may start at any node and move to any adjacent node, visiting each node **at most** once.

Return the **maximum** possible length of a **palindrome** that can be formed by visiting a set of **unique** nodes along a valid path.

**Example 1:**

**Input:** n = 3, edges = [[0,1],[1,2]], label = "aba"

**Output:** 3

**Exp****lanation:**

![](https://assets.leetcode.com/uploads/2025/06/13/screenshot-2025-06-13-at-230714.png)

*   The longest palindromic path is from node 0 to node 2 via node 1, following the path `0 → 1 → 2` forming string `"aba"`.
*   This is a valid palindrome of length 3.

**Example 2:**

**Input:** n = 3, edges = [[0,1],[0,2]], label = "abc"

**Output:** 1

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/13/screenshot-2025-06-13-at-230017.png)

*   No path with more than one node forms a palindrome.
*   The best option is any single node, giving a palindrome of length 1.

**Example 3:**

**Input:** n = 4, edges = [[0,2],[0,3],[3,1]], label = "bbac"

**Output:** 3

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/13/screenshot-2025-06-13-at-230508.png)

*   The longest palindromic path is from node 0 to node 1, following the path `0 → 3 → 1`, forming string `"bcb"`.
*   This is a valid palindrome of length 3.

**Constraints:**

*   `1 <= n <= 14`
*   `n - 1 <= edges.length <= n * (n - 1) / 2`
*   <code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
*   <code>u<sub>i</sub> != v<sub>i</sub></code>
*   `label.length == n`
*   `label` consists of lowercase English letters.
*   There are no duplicate edges.