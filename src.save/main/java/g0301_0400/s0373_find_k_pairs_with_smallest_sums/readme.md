373\. Find K Pairs with Smallest Sums

Medium

You are given two integer arrays `nums1` and `nums2` sorted in **ascending order** and an integer `k`.

Define a pair `(u, v)` which consists of one element from the first array and one element from the second array.

Return _the_ `k` _pairs_ <code>(u<sub>1</sub>, v<sub>1</sub>), (u<sub>2</sub>, v<sub>2</sub>), ..., (u<sub>k</sub>, v<sub>k</sub>)</code> _with the smallest sums_.

**Example 1:**

**Input:** nums1 = [1,7,11], nums2 = [2,4,6], k = 3

**Output:** [[1,2],[1,4],[1,6]]

**Explanation:** The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

**Example 2:**

**Input:** nums1 = [1,1,2], nums2 = [1,2,3], k = 2

**Output:** [[1,1],[1,1]]

**Explanation:** The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

**Example 3:**

**Input:** nums1 = [1,2], nums2 = [3], k = 3

**Output:** [[1,3],[2,3]]

**Explanation:** All possible pairs are returned from the sequence: [1,3],[2,3]

**Constraints:**

*   <code>1 <= nums1.length, nums2.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums1[i], nums2[i] <= 10<sup>9</sup></code>
*   `nums1` and `nums2` both are sorted in **ascending order**.
*   `1 <= k <= 1000`