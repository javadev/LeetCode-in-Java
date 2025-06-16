3585\. Find Weighted Median Node in Tree

Hard

You are given an integer `n` and an **undirected, weighted** tree rooted at node 0 with `n` nodes numbered from 0 to `n - 1`. This is represented by a 2D array `edges` of length `n - 1`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>]</code> indicates an edge from node <code>u<sub>i</sub></code> to <code>v<sub>i</sub></code> with weight <code>w<sub>i</sub></code>.

The **weighted median node** is defined as the **first** node `x` on the path from <code>u<sub>i</sub></code> to <code>v<sub>i</sub></code> such that the sum of edge weights from <code>u<sub>i</sub></code> to `x` is **greater than or equal to half** of the total path weight.

You are given a 2D integer array `queries`. For each <code>queries[j] = [u<sub>j</sub>, v<sub>j</sub>]</code>, determine the weighted median node along the path from <code>u<sub>j</sub></code> to <code>v<sub>j</sub></code>.

Return an array `ans`, where `ans[j]` is the node index of the weighted median for `queries[j]`.

**Example 1:**

**Input:** n = 2, edges = [[0,1,7]], queries = [[1,0],[0,1]]

**Output:** [0,1]

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/05/26/screenshot-2025-05-26-at-193447.png)

| Query      | Path     | Edge Weights  | Total Path Weight  | Half | Explanation                                           | Answer |
|------------|----------|---------------|--------------------|------|-------------------------------------------------------|--------|
| `[1, 0]`   | `1 → 0`  | `[7]`         | 7                  | 3.5  | Sum from `1 → 0 = 7 >= 3.5`, median is node 0.        | 0      |
| `[0, 1]`   | `0 → 1`  | `[7]`         | 7                  | 3.5  | Sum from `0 → 1 = 7 >= 3.5`, median is node 1.        | 1      |


**Example 2:**

**Input:** n = 3, edges = [[0,1,2],[2,0,4]], queries = [[0,1],[2,0],[1,2]]

**Output:** [1,0,2]

**E****xplanation:**

![](https://assets.leetcode.com/uploads/2025/05/26/screenshot-2025-05-26-at-193610.png)

| Query      | Path         | Edge Weights | Total Path Weight  | Half | Explanation                                                                 | Answer |
|------------|--------------|--------------|--------------------|------|-----------------------------------------------------------------------------|--------|
| `[0, 1]`   | `0 → 1`      | `[2]`        | 2                  | 1    | Sum from `0 → 1 = 2 >= 1`, median is node 1.                                | 1      |
| `[2, 0]`   | `2 → 0`      | `[4]`        | 4                  | 2    | Sum from `2 → 0 = 4 >= 2`, median is node 0.                                | 0      |
| `[1, 2]`   | `1 → 0 → 2`  | `[2, 4]`     | 6                  | 3    | Sum from `1 → 0 = 2 < 3`. <br> Sum from `1 → 2 = 2 + 4 = 6 >= 3`, median is node 2. | 2      |

**Example 3:**

**Input:** n = 5, edges = [[0,1,2],[0,2,5],[1,3,1],[2,4,3]], queries = [[3,4],[1,2]]

**Output:** [2,2]

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/05/26/screenshot-2025-05-26-at-193857.png)

| Query      | Path                 | Edge Weights     | Total Path Weight | Half  | Explanation                                                                                                                                         | Answer |
|------------|----------------------|------------------|--------------------|------|-----------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| `[3, 4]`   | `3 → 1 → 0 → 2 → 4`  | `[1, 2, 5, 3]`   | 11                 | 5.5  | Sum from `3 → 1 = 1 < 5.5`.<br> Sum from `3 → 0 = 1 + 2 = 3 < 5.5`.<br> Sum from `3 → 2 = 1 + 2 + 5 = 8 >= 5.5`, median is node 2.                  | 2      |
| `[1, 2]`   | `1 → 0 → 2`          | `[2, 5]`         | 7                  | 3.5  | Sum from `1 → 0 = 2 < 3.5`.<br> Sum from `1 → 2 = 2 + 5 = 7 >= 3.5`, median is node 2.                                                              | 2      |

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   `edges.length == n - 1`
*   <code>edges[i] == [u<sub>i</sub>, v<sub>i</sub>, w<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> < n</code>
*   <code>1 <= w<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   <code>queries[j] == [u<sub>j</sub>, v<sub>j</sub>]</code>
*   <code>0 <= u<sub>j</sub>, v<sub>j</sub> < n</code>
*   The input is generated such that `edges` represents a valid tree.