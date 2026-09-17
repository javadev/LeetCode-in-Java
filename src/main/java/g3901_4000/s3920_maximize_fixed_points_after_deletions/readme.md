3920\. Maximize Fixed Points After Deletions

Hard

You are given an integer array `nums`.

A position `i` is called a **fixed point** if `nums[i] == i`.

You are allowed to delete **any** number of elements (including zero) from the array. After each deletion, the remaining elements **shift left**, and indices are reassigned starting from 0.

Return an integer denoting the **maximum** number of fixed points that can be achieved after performing any number of deletions.

**Example 1:**

**Input:** nums = [0,2,1]

**Output:** 2

**Explanation:**

*   Delete `nums[1] = 2`. The array becomes `[0, 1]`.
*   Now, `nums[0] = 0` and `nums[1] = 1`, so both indices are fixed points.
*   Thus, the answer is 2.

**Example 2:**

**Input:** nums = [3,1,2]

**Output:** 2

**Explanation:**

*   Do not delete any elements. The array remains `[3, 1, 2]`.
*   Here, `nums[1] = 1` and `nums[2] = 2`, so these indices are fixed points.
*   Thus, the answer is 2.

**Example 3:**

**Input:** nums = [1,0,1,2]

**Output:** 3

**Explanation:**

*   Delete `nums[0] = 1`. The array becomes `[0, 1, 2]`.
*   Now, `nums[0] = 0`, `nums[1] = 1`, and `nums[2] = 2`, so all indices are fixed points.
*   Thus, the answer is 3.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>5</sup></code>