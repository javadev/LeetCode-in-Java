4040\. Minimum Operations to Form Subset Sum I

Medium

You are given an integer array `nums` and an integer `sum`.

In one **operation**, choose an element with current value `x` and replace it with either `2 * x` or `floor(x / 2)`.

For each element, all **multiplication** operations performed on it must occur **before** any **division** operations performed on it.

Return the **minimum** number of operations needed so that some subset of the resulting array has a sum **exactly** equal to `sum`. If it is impossible, return -1.

The `floor()` function returns the integer part of the division.

**Example 1:**

**Input:** nums = [5,6,10], sum = 4

**Output:** 3

**Explanation:**

*   Divide `nums[0] = 5` twice: `5 → 2 → 1`, costing 2 operations.
*   Divide `nums[1] = 6` once: `6 → 3`, costing 1 operation.
*   After these operations, `nums = [1, 3, 10]`. The subset `{1, 3}` sums to 4 using 3 operations in total.

**Example 2:**

**Input:** nums = [10,2], sum = 13

**Output:** 3

**Explanation:**

*   Divide `nums[0] = 10` once: `10 → 5`, costing 1 operation.
*   Multiply `nums[1] = 2` twice: `2 → 4 → 8`, costing 2 operations.
*   After these operations, `nums = [5, 8]`. The subset `{5, 8}` sums to 13 using 3 operations in total.

**Example 3:**

**Input:** nums = [6,3], sum = 8

**Output:** \-1

**Explanation:**

*   No sequence of operations lets a subset of `nums` sum to 8, so the answer is -1.

**Constraints:**

*   `1 <= nums.length <= 100`
*   `1 <= nums[i] <= 500`
*   `1 <= sum <= 5000`