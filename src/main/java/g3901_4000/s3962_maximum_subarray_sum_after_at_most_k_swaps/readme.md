3962\. Maximum Subarray Sum After at Most K Swaps

Hard

You are given an integer array `nums` and an integer `k`.

You are allowed to perform **at most** `k` swap operations on the array.

In one swap operation, you may choose any two indices `i` and `j` and swap `nums[i]` and `nums[j]`.

Return an integer denoting the **maximum possible non-empty subarrays sum** after performing the swaps.

**Example 1:**

**Input:** nums = [1,-1,0,2], k = 1

**Output:** 3

**Explanation:**

*   We can swap on indices 1 and 3, resulting in the array `[1, 2, 0, -1]`.
*   The subarray `[1, 2]` has a sum of 3, which is the maximum possible subarray sum after at most `k = 1` swap.

**Example 2:**

**Input:** nums = [4,3,2,4], k = 2

**Output:** 13

**Explanation:**

The maximum possible subarray sum after at most `k = 2` swaps is the sum of the entire array, which is 13.

**Example 3:**

**Input:** nums = [-1,-2], k = 0

**Output:** \-1

**Explanation:**

*   `k = 0` swaps are allowed.
*   The possible subarrays are `[-1]`, `[-2]`, and `[-1, -2]`, with sums -1, -2, and -3 respectively.
*   Among these sums, the maximum is -1.

**Constraints:**

*   `1 <= nums.length <= 1500`
*   <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code>
*   `0 <= k <= nums.length`