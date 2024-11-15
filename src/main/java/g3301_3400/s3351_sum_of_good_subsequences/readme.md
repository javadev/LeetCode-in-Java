3351\. Sum of Good Subsequences

Hard

You are given an integer array `nums`. A **good** subsequence is defined as a subsequence of `nums` where the absolute difference between any **two** consecutive elements in the subsequence is **exactly** 1.

Return the **sum** of all _possible_ **good subsequences** of `nums`.

Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Note** that a subsequence of size 1 is considered good by definition.

**Example 1:**

**Input:** nums = [1,2,1]

**Output:** 14

**Explanation:**

*   Good subsequences are: `[1]`, `[2]`, `[1]`, `[1,2]`, `[2,1]`, `[1,2,1]`.
*   The sum of elements in these subsequences is 14.

**Example 2:**

**Input:** nums = [3,4,5]

**Output:** 40

**Explanation:**

*   Good subsequences are: `[3]`, `[4]`, `[5]`, `[3,4]`, `[4,5]`, `[3,4,5]`.
*   The sum of elements in these subsequences is 40.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>5</sup></code>