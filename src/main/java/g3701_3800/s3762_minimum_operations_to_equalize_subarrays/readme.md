3762\. Minimum Operations to Equalize Subarrays

Hard

You are given an integer array `nums` and an integer `k`.

In one operation, you can **increase or decrease** any element of `nums` by **exactly** `k`.

You are also given a 2D integer array `queries`, where each <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>.

For each query, find the **minimum** number of operations required to make **all** elements in the **non-empty subarrays** <code>nums[l<sub>i</sub>..r<sub>i</sub>]</code> **equal**. If it is impossible, the answer for that query is `-1`.

Return an array `ans`, where `ans[i]` is the answer for the <code>i<sup>th</sup></code> query.

**Example 1:**

**Input:** nums = [1,4,7], k = 3, queries = [[0,1],[0,2]]

**Output:** [1,2]

**Explanation:**

One optimal set of operations:

| `i` | `[l_i, r_i]` | `nums[l_i..r_i]` | Possibility | Operations | Final `nums[l_i..r_i]` | `ans[i]` |
|---|---|---|---|---|---|---|
| 0 | [0, 1] | [1, 4] | Yes | `nums[0] + k = 1 + 3 = 4 = nums[1]` | [4, 4] | 1 |
| 1 | [0, 2] | [1, 4, 7] | Yes | `nums[0] + k = 1 + 3 = 4 = nums[1]`<br>`nums[2] - k = 7 - 3 = 4 = nums[1]` | [4, 4, 4] | 2 |

Thus, `ans = [1, 2]`.

**Example 2:**

**Input:** nums = [1,2,4], k = 2, queries = [[0,2],[0,0],[1,2]]

**Output:** [-1,0,1]

**Explanation:**

One optimal set of operations:

| `i` | `[l_i, r_i]` | `nums[l_i..r_i]` | Possibility | Operations | Final `nums[l_i..r_i]` | `ans[i]` |
|---|---|---|---|---|---|---|
| 0 | [0, 2] | [1, 2, 4] | No | - | [1, 2, 4] | -1 |
| 1 | [0, 0] | [1] | Yes | Already equal | [1] | 0 |
| 2 | [1, 2] | [2, 4] | Yes | `nums[1] + k = 2 + 2 = 4 = nums[2]` | [4, 4] | 1 |

Thus, `ans = [-1, 0, 1]`.

**Constraints:**

*   <code>1 <= n == nums.length <= 4 × 10<sup>4</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   <code>1 <= k <= 10<sup>9</sup></code>
*   <code>1 <= queries.length <= 4 × 10<sup>4</sup></code>
*   <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>
*   <code>0 <= l<sub>i</sub> <= r<sub>i</sub> <= n - 1</code>
