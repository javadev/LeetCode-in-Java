3836\. Maximum Score Using Exactly K Pairs

Hard

You are given two integer arrays `nums1` and `nums2` of lengths `n` and `m` respectively, and an integer `k`.

You must choose **exactly** `k` pairs of indices <code>(i<sub>1</sub>, j<sub>1</sub>), (i<sub>2</sub>, j<sub>2</sub>), ..., (i<sub>k</sub>, j<sub>k</sub>)</code> such that:

*   <code>0 <= i<sub>1</sub> < i<sub>2</sub> < ... < i<sub>k</sub> < n</code>
*   <code>0 <= j<sub>1</sub> < j<sub>2</sub> < ... < j<sub>k</sub> < m</code>

For each chosen pair `(i, j)`, you gain a score of `nums1[i] * nums2[j]`.

The total **score** is the **sum** of the products of all selected pairs.

Return an integer representing the **maximum** achievable total score.

**Example 1:**

**Input:** nums1 = [1,3,2], nums2 = [4,5,1], k = 2

**Output:** 22

**Explanation:**

One optimal choice of index pairs is:

*   <code>(i<sub>1</sub>, j<sub>1</sub>) = (1, 0)</code> which scores `3 * 4 = 12`
*   <code>(i<sub>2</sub>, j<sub>2</sub>) = (2, 1)</code> which scores `2 * 5 = 10`

This gives a total score of `12 + 10 = 22`.

**Example 2:**

**Input:** nums1 = [-2,0,5], nums2 = [-3,4,-1,2], k = 2

**Output:** 26

**Explanation:**

One optimal choice of index pairs is:

*   <code>(i<sub>1</sub>, j<sub>1</sub>) = (0, 0)</code> which scores `-2 * -3 = 6`
*   <code>(i<sub>2</sub>, j<sub>2</sub>) = (2, 1)</code> which scores `5 * 4 = 20`

The total score is `6 + 20 = 26`.

**Example 3:**

**Input:** nums1 = [-3,-2], nums2 = [1,2], k = 2

**Output:** \-7

**Explanation:**

The optimal choice of index pairs is:

*   <code>(i<sub>1</sub>, j<sub>1</sub>) = (0, 0)</code> which scores `-3 * 1 = -3`
*   <code>(i<sub>2</sub>, j<sub>2</sub>) = (1, 1)</code> which scores `-2 * 2 = -4`

The total score is `-3 + (-4) = -7`.

**Constraints:**

*   `1 <= n == nums1.length <= 100`
*   `1 <= m == nums2.length <= 100`
*   <code>-10<sup>6</sup> <= nums1[i], nums2[i] <= 10<sup>6</sup></code>
*   `1 <= k <= min(n, m)`