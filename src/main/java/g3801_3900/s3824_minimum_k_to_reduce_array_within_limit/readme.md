3824\. Minimum K to Reduce Array Within Limit

Medium

You are given a **positive** integer array `nums`.

For a positive integer `k`, define `nonPositive(nums, k)` as the **minimum** number of **operations** needed to make every element of `nums` **non-positive**. In one operation, you can choose an index `i` and reduce `nums[i]` by `k`.

Return an integer denoting the **minimum** value of `k` such that <code>nonPositive(nums, k) <= k<sup>2</sup></code>.

**Example 1:**

**Input:** nums = [3,7,5]

**Output:** 3

**Explanation:**

When `k = 3`, <code>nonPositive(nums, k) = 6 <= k<sup>2</sup></code>.

*   Reduce `nums[0] = 3` one time. `nums[0]` becomes `3 - 3 = 0`.
*   Reduce `nums[1] = 7` three times. `nums[1]` becomes `7 - 3 - 3 - 3 = -2`.
*   Reduce `nums[2] = 5` two times. `nums[2]` becomes `5 - 3 - 3 = -1`.

**Example 2:**

**Input:** nums = [1]

**Output:** 1

**Explanation:**

When `k = 1`, <code>nonPositive(nums, k) = 1 <= k<sup>2</sup></code>.

*   Reduce `nums[0] = 1` one time. `nums[0]` becomes `1 - 1 = 0`.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>