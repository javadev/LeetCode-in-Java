3410\. Maximize Subarray Sum After Removing All Occurrences of One Element

Hard

You are given an integer array `nums`.

You can do the following operation on the array **at most** once:

*   Choose **any** integer `x` such that `nums` remains **non-empty** on removing all occurrences of `x`.
*   Remove **all** occurrences of `x` from the array.

Return the **maximum** subarray sum across **all** possible resulting arrays.

A **subarray** is a contiguous **non-empty** sequence of elements within an array.

**Example 1:**

**Input:** nums = [-3,2,-2,-1,3,-2,3]

**Output:** 7

**Explanation:**

We can have the following arrays after at most one operation:

*   The original array is <code>nums = [-3, 2, -2, -1, <ins>**3, -2, 3**</ins>]</code>. The maximum subarray sum is `3 + (-2) + 3 = 4`.
*   Deleting all occurences of `x = -3` results in <code>nums = [2, -2, -1, **<ins>3, -2, 3</ins>**]</code>. The maximum subarray sum is `3 + (-2) + 3 = 4`.
*   Deleting all occurences of `x = -2` results in <code>nums = [-3, **<ins>2, -1, 3, 3</ins>**]</code>. The maximum subarray sum is `2 + (-1) + 3 + 3 = 7`.
*   Deleting all occurences of `x = -1` results in <code>nums = [-3, 2, -2, **<ins>3, -2, 3</ins>**]</code>. The maximum subarray sum is `3 + (-2) + 3 = 4`.
*   Deleting all occurences of `x = 3` results in <code>nums = [-3, <ins>**2**</ins>, -2, -1, -2]</code>. The maximum subarray sum is 2.

The output is `max(4, 4, 7, 4, 2) = 7`.

**Example 2:**

**Input:** nums = [1,2,3,4]

**Output:** 10

**Explanation:**

It is optimal to not perform any operations.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>6</sup> <= nums[i] <= 10<sup>6</sup></code>