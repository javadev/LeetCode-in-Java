3757\. Number of Effective Subsequences

Hard

You are given an integer array `nums`.

The **strength** of the array is defined as the **bitwise OR** of all its elements.

A **subsequence** is considered **effective** if removing that subsequence **strictly decreases** the strength of the remaining elements.

Return the number of **effective subsequences** in `nums`. Since the answer may be large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

The bitwise OR of an empty array is 0.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 3

**Explanation:**

*   The Bitwise OR of the array is `1 OR 2 OR 3 = 3`.
*   Subsequences that are effective are:
    *   `[1, 3]`: The remaining element `[2]` has a Bitwise OR of 2.
    *   `[2, 3]`: The remaining element `[1]` has a Bitwise OR of 1.
    *   `[1, 2, 3]`: The remaining elements `[]` have a Bitwise OR of 0.
*   Thus, the total number of effective subsequences is 3.

**Example 2:**

**Input:** nums = [7,4,6]

**Output:** 4

**Explanation:**

*   The Bitwise OR of the array is `7 OR 4 OR 6 = 7`.
*   Subsequences that are effective are:
    *   `[7]`: The remaining elements `[4, 6]` have a Bitwise OR of 6.
    *   `[7, 4]`: The remaining element `[6]` has a Bitwise OR of 6.
    *   `[7, 6]`: The remaining element `[4]` has a Bitwise OR of 4.
    *   `[7, 4, 6]`: The remaining elements `[]` have a Bitwise OR of 0.
*   Thus, the total number of effective subsequences is 4.

**Example 3:**

**Input:** nums = [8,8]

**Output:** 1

**Explanation:**

*   The Bitwise OR of the array is `8 OR 8 = 8`.
*   Only the subsequence `[8, 8]` is effective since removing it leaves `[]` which has a Bitwise OR of 0.
*   Thus, the total number of effective subsequences is 1.

**Example 4:**

**Input:** nums = [2,2,1]

**Output:** 5

**Explanation:**

*   The Bitwise OR of the array is `2 OR 2 OR 1 = 3`.
*   Subsequences that are effective are:
    *   `[1]`: The remaining elements `[2, 2]` have a Bitwise OR of 2.
    *   `[2, 1]` (using `nums[0]`, `nums[2]`): The remaining element `[2]` has a Bitwise OR of 2.
    *   `[2, 1]` (using `nums[1]`, `nums[2]`): The remaining element `[2]` has a Bitwise OR of 2.
    *   `[2, 2]`: The remaining element `[1]` has a Bitwise OR of 1.
    *   `[2, 2, 1]`: The remaining elements `[]` have a Bitwise OR of 0.
*   Thus, the total number of effective subsequences is 5.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>6</sup></code>