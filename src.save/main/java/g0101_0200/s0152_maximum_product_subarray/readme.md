152\. Maximum Product Subarray

Medium

Given an integer array `nums`, find a contiguous non-empty subarray within the array that has the largest product, and return _the product_.

It is **guaranteed** that the answer will fit in a **32-bit** integer.

A **subarray** is a contiguous subsequence of the array.

**Example 1:**

**Input:** nums = [2,3,-2,4]

**Output:** 6

**Explanation:** [2,3] has the largest product 6. 

**Example 2:**

**Input:** nums = [-2,0,-1]

**Output:** 0

**Explanation:** The result cannot be 2, because [-2,-1] is not a subarray. 

**Constraints:**

*   <code>1 <= nums.length <= 2 * 10<sup>4</sup></code>
*   `-10 <= nums[i] <= 10`
*   The product of any prefix or suffix of `nums` is **guaranteed** to fit in a **32-bit** integer.