2750\. Ways to Split Array Into Good Subarrays

Medium

You are given a binary array `nums`.

A subarray of an array is **good** if it contains **exactly** **one** element with the value `1`.

Return _an integer denoting the number of ways to split the array_ `nums` _into **good** subarrays_. As the number may be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

A subarray is a contiguous **non-empty** sequence of elements within an array.

**Example 1:**

**Input:** nums = [0,1,0,0,1]

**Output:** 3

**Explanation:** There are 3 ways to split nums into good subarrays:
- [0,1] [0,0,1] 
- [0,1,0] [0,1]
- [0,1,0,0] [1]

**Example 2:**

**Input:** nums = [0,1,0]

**Output:** 1

**Explanation:** There is 1 way to split nums into good subarrays: - [0,1,0]

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   `0 <= nums[i] <= 1`