3818\. Minimum Prefix Removal to Make Array Strictly Increasing

Medium

You are given an integer array `nums`.

You need to remove **exactly** one prefix (possibly empty) from nums.

Return an integer denoting the **minimum** length of the removed prefix such that the remaining array is **strictly increasing**.

**Example 1:**

**Input:** nums = [1,-1,2,3,3,4,5]

**Output:** 4

**Explanation:**

Removing the `prefix = [1, -1, 2, 3]` leaves the remaining array `[3, 4, 5]` which is strictly increasing.

**Example 2:**

**Input:** nums = [4,3,-2,-5]

**Output:** 3

**Explanation:**

Removing the `prefix = [4, 3, -2]` leaves the remaining array `[-5]` which is strictly increasing.

**Example 3:**

**Input:** nums = [1,2,3,4]

**Output:** 0

**Explanation:**

The array `nums = [1, 2, 3, 4]` is already strictly increasing so removing an empty prefix is sufficient.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>