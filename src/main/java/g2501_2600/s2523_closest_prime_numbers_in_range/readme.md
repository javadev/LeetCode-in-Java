2523\. Closest Prime Numbers in Range

Medium

Given two positive integers `left` and `right`, find the two integers `num1` and `num2` such that:

*   `left <= nums1 < nums2 <= right` .
*   `nums1` and `nums2` are both **prime** numbers.
*   `nums2 - nums1` is the **minimum** amongst all other pairs satisfying the above conditions.

Return _the positive integer array_ `ans = [nums1, nums2]`. _If there are multiple pairs satisfying these conditions, return the one with the minimum_ `nums1` _value or_ `[-1, -1]` _if such numbers do not exist._

A number greater than `1` is called **prime** if it is only divisible by `1` and itself.

**Example 1:**

**Input:** left = 10, right = 19

**Output:** [11,13]

**Explanation:** The prime numbers between 10 and 19 are 11, 13, 17, and 19. 

The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19]. 

Since 11 is smaller than 17, we return the first pair.

**Example 2:**

**Input:** left = 4, right = 6

**Output:** [-1,-1]

**Explanation:** There exists only one prime number in the given range, so the conditions cannot be satisfied.

**Constraints:**

*   <code>1 <= left <= right <= 10<sup>6</sup></code>