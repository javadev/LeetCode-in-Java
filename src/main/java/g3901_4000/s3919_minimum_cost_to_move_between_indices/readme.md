3919\. Minimum Cost to Move Between Indices

Medium

You are given an integer array `nums` where `nums` is **strictly increasing**.

For each index `x`, let `closest(x)` be the **adjacent** index `y` such that `abs(nums[x] - nums[y])` is **minimized**. If both **adjacent** indices exist and give the same difference, choose the **smaller** index.

From any index `x`, you can move in two ways:

*   To any index `y` with cost `abs(nums[x] - nums[y])`, or
*   To `closest(x)` with cost 1.

You are also given a 2D integer array `queries`, where each <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>.

For each query, calculate the **minimum total cost** to move from index <code>l<sub>i</sub></code> to index <code>r<sub>i</sub></code>.

Return an integer array `ans`, where `ans[i]` is the answer for the <code>i<sup>th</sup></code> query.

The **absolute difference** between two values `x` and `y` is defined as `abs(x - y)`.

**Example 1:**

**Input:** nums = [-5,-2,3], queries = [[0,2],[2,0],[1,2]]

**Output:** [6,2,5]

**Explanation:**

*   The closest indices are `[1, 0, 1]` respectively.
*   For `[0, 2]`, the path `0 → 1 → 2` uses a closest move from index 0 to 1 with cost 1 and a move from index 1 to 2 with cost `|-2 - 3| = 5`, giving total `1 + 5 = 6`.
*   For `[2, 0]`, the path `2 → 1 → 0` uses two closest moves from index 2 to 1 and from index 1 to 0, each with cost 1, giving total 2.
*   For `[1, 2]`, the direct move from index 1 to index 2 has cost `|-2 - 3| = 5`, which is optimal.

Thus, `ans = [6, 2, 5]`.

**Example 2:**

**Input:** nums = [0,2,3,9], queries = [[3,0],[1,2],[2,0]]

**Output:** [4,1,3]

**Explanation:**

*   The closest indices are `[1, 2, 1, 2]` respectively.
*   For `[3, 0]`, the path `3 → 2 → 1 → 0` uses closest moves from index 3 to 2 and from 2 to 1, each with cost 1, and a move from 1 to 0 with cost `|2 - 0| = 2`, giving total `1 + 1 + 2 = 4`.
*   For `[1, 2]`, the closest move from index 1 to 2 has cost 1.
*   For `[2, 0]`, the path `2 → 1 → 0` uses a closest move from index 2 to 1 with cost 1 and a move from 1 to 0 with cost `|2 - 0| = 2`, giving total `1 + 2 = 3`.

Thus, `ans = [4, 1, 3]`.

**Constraints:**

*   <code>2 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
*   `nums` is strictly increasing
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>
*   <code>0 <= l<sub>i</sub>, r<sub>i</sub> < nums.length</code>