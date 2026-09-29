3942\. Minimum Operations to Sort a Permutation

Medium

You are given an integer array `nums` of length `n`, where `nums` is a permutation of the integers from 0 to `n - 1`.

You may perform **only** the following operations:

*   **Reverse** the entire array.
*   **Rotate Left by One**: Move the first element to the end of the array, and rest elements to left by one position.

Return an integer denoting the **minimum** number of operations required to sort the array in **increasing** order. If it is **not possible** to sort the array using only the given operations, return -1.

**Example 1:**

**Input:** nums = [0,2,1]

**Output:** 2

**Explanation:**

*   Rotate Left by one: `[2, 1, 0]`
*   Reverse the array: `[0, 1, 2]`

The array becomes sorted in 2 operations, which is minimal

**Example 2:**

**Input:** nums = [1,0,2]

**Output:** 2

**Explanation:**

*   Reverse the array: `[2, 0, 1]`
*   Rotate Left by one: `[0, 1, 2]`

The array becomes sorted in 2 operations, which is minimal.

**Example 3:**

**Input:** nums = [2,0,1,3]

**Output:** \-1

**Explanation:**

It is impossible to reach `[2, 0, 1, 3]`. Thus, the answer is -1.

**Constraints:**

*   <code>1 <= n == nums.length <= 10<sup>5</sup></code>
*   `0 <= nums[i] <= n - 1`
*   `nums` is a permutation of integers from 0 to `n - 1`.