870\. Advantage Shuffle

Medium

You are given two integer arrays `nums1` and `nums2` both of the same length. The **advantage** of `nums1` with respect to `nums2` is the number of indices `i` for which `nums1[i] > nums2[i]`.

Return _any permutation of_ `nums1` _that maximizes its **advantage** with respect to_ `nums2`.

**Example 1:**

**Input:** nums1 = [2,7,11,15], nums2 = [1,10,4,11]

**Output:** [2,11,7,15]

**Example 2:**

**Input:** nums1 = [12,24,8,32], nums2 = [13,25,32,11]

**Output:** [24,32,8,12]

**Constraints:**

*   <code>1 <= nums1.length <= 10<sup>5</sup></code>
*   `nums2.length == nums1.length`
*   <code>0 <= nums1[i], nums2[i] <= 10<sup>9</sup></code>