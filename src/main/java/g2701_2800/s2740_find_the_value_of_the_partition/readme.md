2740\. Find the Value of the Partition

Medium

You are given a **positive** integer array `nums`.

Partition `nums` into two arrays, `nums1` and `nums2`, such that:

*   Each element of the array `nums` belongs to either the array `nums1` or the array `nums2`.
*   Both arrays are **non-empty**.
*   The value of the partition is **minimized**.

The value of the partition is `|max(nums1) - min(nums2)|`.

Here, `max(nums1)` denotes the maximum element of the array `nums1`, and `min(nums2)` denotes the minimum element of the array `nums2`.

Return _the integer denoting the value of such partition_.

**Example 1:**

**Input:** nums = [1,3,2,4]

**Output:** 1

**Explanation:** We can partition the array nums into nums1 = [1,2] and nums2 = [3,4].
- The maximum element of the array nums1 is equal to 2. 
- The minimum element of the array nums2 is equal to 3. 

The value of the partition is |2 - 3| = 1. 

It can be proven that 1 is the minimum value out of all partitions.

**Example 2:**

**Input:** nums = [100,1,10]

**Output:** 9

**Explanation:** We can partition the array nums into nums1 = [10] and nums2 = [100,1].
- The maximum element of the array nums1 is equal to 10. 
- The minimum element of the array nums2 is equal to 1. 

The value of the partition is |10 - 1| = 9. 

It can be proven that 9 is the minimum value out of all partitions.

**Constraints:**

*   <code>2 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>