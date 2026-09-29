3937\. Minimum Operations to Make Array Modulo Alternating I

Medium

You are given an integer array `nums` and an integer `k`.

In one operation, you can **increase** or **decrease** any element of `nums` by 1.

An array is called **modulo alternating** if there exist two **distinct** integers `x` and `y` (`0 <= x, y < k`) such that:

*   For every **even** index `i`, `nums[i] % k == x`
*   For every **odd** index `i`, `nums[i] % k == y`

Return the **minimum** number of operations required to make `nums` **modulo alternating**.

**Example 1:**

**Input:** nums = [1,4,2,8], k = 3

**Output:** 2

**Explanation:**

*   Let's choose `x = 1` for even indices and `y = 2` for odd indices.
*   Perform the following operations:
    *   Increment `nums[1] = 4` by 1, giving `nums = [1, 5, 2, 8]`.
    *   Decrement `nums[2] = 2` by 1, giving `nums = [1, 5, 1, 8]`.
*   Now, for even indices, `nums[i] % k = 1`, and for odd indices, `nums[i] % k = 2`.
*   Thus, the total number of operations required is 2.

**Example 2:**

**Input:** nums = [1,1,1], k = 3

**Output:** 1

**Explanation:**

*   Incrementing `nums[1]` by 1 gives `nums = [1, 2, 1]`, which satisfies the condition with `x = 1` and `y = 2`.
*   Thus, the total number of operations required is 1.

**Constraints:**

*   `1 <= nums.length <= 100`
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   `2 <= k <= 100`