3478\. Choose K Elements With Maximum Sum

Medium

You are given two integer arrays, `nums1` and `nums2`, both of length `n`, along with a positive integer `k`.

For each index `i` from `0` to `n - 1`, perform the following:

*   Find **all** indices `j` where `nums1[j]` is less than `nums1[i]`.
*   Choose **at most** `k` values of `nums2[j]` at these indices to **maximize** the total sum.

Return an array `answer` of size `n`, where `answer[i]` represents the result for the corresponding index `i`.

**Example 1:**

**Input:** nums1 = [4,2,1,5,3], nums2 = [10,20,30,40,50], k = 2

**Output:** [80,30,0,80,50]

**Explanation:**

*   For `i = 0`: Select the 2 largest values from `nums2` at indices `[1, 2, 4]` where `nums1[j] < nums1[0]`, resulting in `50 + 30 = 80`.
*   For `i = 1`: Select the 2 largest values from `nums2` at index `[2]` where `nums1[j] < nums1[1]`, resulting in 30.
*   For `i = 2`: No indices satisfy `nums1[j] < nums1[2]`, resulting in 0.
*   For `i = 3`: Select the 2 largest values from `nums2` at indices `[0, 1, 2, 4]` where `nums1[j] < nums1[3]`, resulting in `50 + 30 = 80`.
*   For `i = 4`: Select the 2 largest values from `nums2` at indices `[1, 2]` where `nums1[j] < nums1[4]`, resulting in `30 + 20 = 50`.

**Example 2:**

**Input:** nums1 = [2,2,2,2], nums2 = [3,1,2,3], k = 1

**Output:** [0,0,0,0]

**Explanation:**

Since all elements in `nums1` are equal, no indices satisfy the condition `nums1[j] < nums1[i]` for any `i`, resulting in 0 for all positions.

**Constraints:**

*   `n == nums1.length == nums2.length`
*   <code>1 <= n <= 10<sup>5</sup></code>
*   <code>1 <= nums1[i], nums2[i] <= 10<sup>6</sup></code>
*   `1 <= k <= n`