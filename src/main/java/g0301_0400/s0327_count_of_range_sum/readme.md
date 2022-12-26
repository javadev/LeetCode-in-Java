327\. Count of Range Sum

Hard

Given an integer array `nums` and two integers `lower` and `upper`, return _the number of range sums that lie in_ `[lower, upper]` _inclusive_.

Range sum `S(i, j)` is defined as the sum of the elements in `nums` between indices `i` and `j` inclusive, where `i <= j`.

**Example 1:**

**Input:** nums = [-2,5,-1], lower = -2, upper = 2

**Output:** 3

**Explanation:** The three ranges are: [0,0], [2,2], and [0,2] and their respective sums are: -2, -1, 2. 

**Example 2:**

**Input:** nums = [0], lower = 0, upper = 0

**Output:** 1 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>
*   <code>-10<sup>5</sup> <= lower <= upper <= 10<sup>5</sup></code>
*   The answer is **guaranteed** to fit in a **32-bit** integer.