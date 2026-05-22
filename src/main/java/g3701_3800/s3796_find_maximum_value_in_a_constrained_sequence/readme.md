3796\. Find Maximum Value in a Constrained Sequence

Medium

You are given an integer `n`, a 2D integer array `restrictions`, and an integer array `diff` of length `n - 1`. Your task is to construct a sequence of length `n`, denoted by `a[0], a[1], ..., a[n - 1]`, such that it satisfies the following conditions:

*   `a[0]` is 0.
*   All elements in the sequence are **non-negative**.
*   For every index `i` (`0 <= i <= n - 2`), `abs(a[i] - a[i + 1]) <= diff[i]`.
*   For each `restrictions[i] = [idx, maxVal]`, the value at position `idx` in the sequence must not exceed `maxVal` (i.e., `a[idx] <= maxVal`).

Your goal is to construct a valid sequence that **maximizes** the **largest** value within the sequence while satisfying all the above conditions.

Return an integer denoting the **largest** value present in such an optimal sequence.

**Example 1:**

**Input:** n = 10, restrictions = [[3,1],[8,1]], diff = [2,2,3,1,4,5,1,1,2]

**Output:** 6

**Explanation:**

*   The sequence `a = [0, 2, 4, 1, 2, 6, 2, 1, 1, 3]` satisfies the given constraints (`a[3] <= 1` and `a[8] <= 1`).
*   The maximum value in the sequence is 6.

**Example 2:**

**Input:** n = 8, restrictions = [[3,2]], diff = [3,5,2,4,2,3,1]

**Output:** 12

**Explanation:**

*   The sequence `a = [0, 3, 3, 2, 6, 8, 11, 12]` satisfies the given constraints (`a[3] <= 2`).
*   The maximum value in the sequence is 12.

**Constraints:**

*   <code>2 <= n <= 10<sup>5</sup></code>
*   `1 <= restrictions.length <= n - 1`
*   `restrictions[i].length == 2`
*   `restrictions[i] = [idx, maxVal]`
*   `1 <= idx < n`
*   <code>1 <= maxVal <= 10<sup>6</sup></code>
*   `diff.length == n - 1`
*   `1 <= diff[i] <= 10`
*   The values of `restrictions[i][0]` are unique.