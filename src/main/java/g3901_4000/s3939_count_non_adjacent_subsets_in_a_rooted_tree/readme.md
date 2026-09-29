3939\. Count Non Adjacent Subsets in a Rooted Tree

Hard

You are given a rooted tree with `n` nodes labeled from 0 to `n - 1`, represented by an integer array `parent` of length `n`, where:

*   `parent[0] = -1` (node 0 is the root).
*   For each `1 <= i < n`, `parent[i]` is the parent of node `i` (`0 <= parent[i] < i`).

You are also given an integer array nums of length `n`, where `nums[i]` is the value of node `i`, and an integer `k`.

A non-empty subset of nodes is called **valid** if:

*   The **sum** of the values of the selected nodes is **divisible** by `k`.
*   No **two** selected nodes are **adjacent** in the tree (no node and its direct parent are both included in the subset).

Return the number of valid subsets modulo <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** parent = [-1,0,1], nums = [1,2,3], k = 3

**Output:** 1

**Explanation:**

**![](https://assets.leetcode.com/uploads/2025/07/17/image1.png)**

The only valid subset is `{2}`. It contains node 2 with value 3, which is divisible by 3.

**Example 2:**

**Input:** parent = [-1,0,0,0], nums = [2,1,2,1], k = 3

**Output:** 2

**Explanation:**

**![](https://assets.leetcode.com/uploads/2025/07/17/image2.png)**

The valid subsets are:

*   `{1, 2}`: Nodes 1 and 2 are both children of node 0 and not directly connected to each other. Their values sum to `1 + 2 = 3`, which is divisible by 3.
*   `{2, 3}`: Nodes 2 and 3 are also non-adjacent. Their values sum to `2 + 1 = 3`, which is divisible by 3.

No other subset satisfies both conditions. Therefore, the answer is 2.

**Constraints:**

*   `n == parent.length == nums.length`
*   `1 <= n <= 1000`
*   `parent[0] == -1`
*   For all `1 <= i < n`:
    *   `0 <= parent[i] < i`
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   `1 <= k <= 100`
*   `parent` describes a valid rooted tree.