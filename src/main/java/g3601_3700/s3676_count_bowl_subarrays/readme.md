3676\. Count Bowl Subarrays

Medium

You are given an integer array `nums` with **distinct** elements.

A subarray `nums[l...r]` of `nums` is called a **bowl** if:

*   The subarray has length at least 3. That is, `r - l + 1 >= 3`.
*   The **minimum** of its two ends is **strictly greater** than the **maximum** of all elements in between. That is, `min(nums[l], nums[r]) > max(nums[l + 1], ..., nums[r - 1])`.

Return the number of **bowl** subarrays in `nums`.

**Example 1:**

**Input:** nums = [2,5,3,1,4]

**Output:** 2

**Explanation:**

The bowl subarrays are `[3, 1, 4]` and `[5, 3, 1, 4]`.

*   `[3, 1, 4]` is a bowl because `min(3, 4) = 3 > max(1) = 1`.
*   `[5, 3, 1, 4]` is a bowl because `min(5, 4) = 4 > max(3, 1) = 3`.

**Example 2:**

**Input:** nums = [5,1,2,3,4]

**Output:** 3

**Explanation:**

The bowl subarrays are `[5, 1, 2]`, `[5, 1, 2, 3]` and `[5, 1, 2, 3, 4]`.

**Example 3:**

**Input:** nums = [1000000000,999999999,999999998]

**Output:** 0

**Explanation:**

No subarray is a bowl.

**Constraints:**

*   <code>3 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   `nums` consists of distinct elements.