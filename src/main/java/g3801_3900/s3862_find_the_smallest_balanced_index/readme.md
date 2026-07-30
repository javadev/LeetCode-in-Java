3862\. Find the Smallest Balanced Index

Medium

You are given an integer array `nums`.

An index `i` is **balanced** if the sum of elements **strictly** to the left of `i` equals the product of elements **strictly** to the right of `i`.

If there are no elements to the left, the sum is considered as 0. Similarly, if there are no elements to the right, the product is considered as 1.

Return an integer denoting the **smallest** balanced index. If no balanced index exists, return -1.

**Example 1:**

**Input:** nums = [2,1,2]

**Output:** 1

**Explanation:**

For index `i = 1`:

*   Left sum = `nums[0] = 2`
*   Right product = `nums[2] = 2`
*   Since the left sum equals the right product, index 1 is balanced.

No smaller index satisfies the condition, so the answer is 1.

**Example 2:**

**Input:** nums = [2,8,2,2,5]

**Output:** 2

**Explanation:**

For index `i = 2`:

*   Left sum = `2 + 8 = 10`
*   Right product = `2 * 5 = 10`
*   Since the left sum equals the right product, index 2 is balanced.

No smaller index satisfies the condition, so the answer is 2.

**Example 3:**

**Input:** nums = [1]

**Output:** \-1

For index `i = 0`:

*   The left side is empty, so the left sum is 0.
*   The right side is empty, so the right product is 1.
*   Since the left sum does not equal the right product, index 0 is not balanced.

Therefore, no balanced index exists and the answer is -1.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>