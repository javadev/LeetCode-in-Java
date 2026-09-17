3914\. Minimum Operations to Make Array Non Decreasing

Medium

You are given an integer array `nums` of length `n`.

In one operation, you may choose any **non-empty subarrays** `nums[l..r]` and **increase** each element in that **subarray** by `x`, where `x` is any **positive** integer.

Return the **minimum** possible **sum** of the values of `x` across all operations required to make the array **non-decreasing**.

An array is **non-decreasing** if `nums[i] <= nums[i + 1]` for all `0 <= i < n - 1`.

**Example 1:**

**Input:** nums = [3,3,2,1]

**Output:** 2

**Explanation:**

One optimal set of operations:

*   Choose subarray `[2..3]` and add `x = 1` resulting in `[3, 3, 3, 2]`
*   Choose subarray `[3..3]` and add `x = 1` resulting in `[3, 3, 3, 3]`

The array becomes non-decreasing, and the total sum of chosen `x` values is `1 + 1 = 2`.

**Example 2:**

**Input:** nums = [5,1,2,3]

**Output:** 4

**Explanation:**

One optimal set of operations:

*   Choose subarray `[1..3]` and add `x = 4` resulting in `[5, 5, 6, 7]`

The array becomes non-decreasing, and the total sum of chosen `x` values is `4`.

**Constraints:**

*   <code>1 <= n == nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>