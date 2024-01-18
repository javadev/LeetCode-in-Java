1749\. Maximum Absolute Sum of Any Subarray

Medium

You are given an integer array `nums`. The **absolute sum** of a subarray <code>[nums<sub>l</sub>, nums<sub>l+1</sub>, ..., nums<sub>r-1</sub>, nums<sub>r</sub>]</code> is <code>abs(nums<sub>l</sub> + nums<sub>l+1</sub> + ... + nums<sub>r-1</sub> + nums<sub>r</sub>)</code>.

Return _the **maximum** absolute sum of any **(possibly empty)** subarray of_ `nums`.

Note that `abs(x)` is defined as follows:

*   If `x` is a negative integer, then `abs(x) = -x`.
*   If `x` is a non-negative integer, then `abs(x) = x`.

**Example 1:**

**Input:** nums = [1,-3,2,3,-4]

**Output:** 5

**Explanation:** The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.

**Example 2:**

**Input:** nums = [2,-5,1,-4,3,-2]

**Output:** 8

**Explanation:** The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>