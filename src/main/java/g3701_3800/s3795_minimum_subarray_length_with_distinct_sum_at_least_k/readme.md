3795\. Minimum Subarray Length With Distinct Sum At Least K

Medium

You are given an integer array `nums` and an integer `k`.

Return the **minimum** length of a **non-empty subarrays** whose sum of the **distinct** values present in that subarray (each value counted once) is **at least** `k`. If no such subarray exists, return -1.

**Example 1:**

**Input:** nums = [2,2,3,1], k = 4

**Output:** 2

**Explanation:**

The subarray `[2, 3]` has distinct elements `{2, 3}` whose sum is `2 + 3 = 5`, which is at least `k = 4`. Thus, the answer is 2.

**Example 2:**

**Input:** nums = [3,2,3,4], k = 5

**Output:** 2

**Explanation:**

The subarray `[3, 2]` has distinct elements `{3, 2}` whose sum is `3 + 2 = 5`, which is at least `k = 5`. Thus, the answer is 2.

**Example 3:**

**Input:** nums = [5,5,4], k = 5

**Output:** 1

**Explanation:**

The subarray `[5]` has distinct elements `{5}` whose sum is `5`, which is at least `k = 5`. Thus, the answer is 1.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>
*   <code>1 <= k <= 10<sup>9</sup></code>