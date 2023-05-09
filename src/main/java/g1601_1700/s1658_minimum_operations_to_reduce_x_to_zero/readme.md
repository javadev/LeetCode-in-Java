1658\. Minimum Operations to Reduce X to Zero

Medium

You are given an integer array `nums` and an integer `x`. In one operation, you can either remove the leftmost or the rightmost element from the array `nums` and subtract its value from `x`. Note that this **modifies** the array for future operations.

Return _the **minimum number** of operations to reduce_ `x` _to **exactly**_ `0` _if it is possible__, otherwise, return_ `-1`.

**Example 1:**

**Input:** nums = [1,1,4,2,3], x = 5

**Output:** 2

**Explanation:** The optimal solution is to remove the last two elements to reduce x to zero.

**Example 2:**

**Input:** nums = [5,6,7,8,9], x = 4

**Output:** -1

**Example 3:**

**Input:** nums = [3,2,20,1,1,3], x = 10

**Output:** 5

**Explanation:** The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>4</sup></code>
*   <code>1 <= x <= 10<sup>9</sup></code>