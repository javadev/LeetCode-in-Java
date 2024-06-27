3193\. Count the Number of Inversions

Hard

You are given an integer `n` and a 2D array `requirements`, where <code>requirements[i] = [end<sub>i</sub>, cnt<sub>i</sub>]</code> represents the end index and the **inversion** count of each requirement.

A pair of indices `(i, j)` from an integer array `nums` is called an **inversion** if:

*   `i < j` and `nums[i] > nums[j]`

Return the number of permutations `perm` of `[0, 1, 2, ..., n - 1]` such that for **all** `requirements[i]`, <code>perm[0..end<sub>i</sub>]</code> has exactly <code>cnt<sub>i</sub></code> inversions.

Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** n = 3, requirements = [[2,2],[0,0]]

**Output:** 2

**Explanation:**

The two permutations are:

*   `[2, 0, 1]`
    *   Prefix `[2, 0, 1]` has inversions `(0, 1)` and `(0, 2)`.
    *   Prefix `[2]` has 0 inversions.
*   `[1, 2, 0]`
    *   Prefix `[1, 2, 0]` has inversions `(0, 2)` and `(1, 2)`.
    *   Prefix `[1]` has 0 inversions.

**Example 2:**

**Input:** n = 3, requirements = [[2,2],[1,1],[0,0]]

**Output:** 1

**Explanation:**

The only satisfying permutation is `[2, 0, 1]`:

*   Prefix `[2, 0, 1]` has inversions `(0, 1)` and `(0, 2)`.
*   Prefix `[2, 0]` has an inversion `(0, 1)`.
*   Prefix `[2]` has 0 inversions.

**Example 3:**

**Input:** n = 2, requirements = [[0,0],[1,0]]

**Output:** 1

**Explanation:**

The only satisfying permutation is `[0, 1]`:

*   Prefix `[0]` has 0 inversions.
*   Prefix `[0, 1]` has an inversion `(0, 1)`.

**Constraints:**

*   `2 <= n <= 300`
*   `1 <= requirements.length <= n`
*   <code>requirements[i] = [end<sub>i</sub>, cnt<sub>i</sub>]</code>
*   <code>0 <= end<sub>i</sub> <= n - 1</code>
*   <code>0 <= cnt<sub>i</sub> <= 400</code>
*   The input is generated such that there is at least one `i` such that <code>end<sub>i</sub> == n - 1</code>.
*   The input is generated such that all <code>end<sub>i</sub></code> are unique.