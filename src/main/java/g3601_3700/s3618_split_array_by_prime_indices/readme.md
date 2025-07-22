3618\. Split Array by Prime Indices

Medium

You are given an integer array `nums`.

Split `nums` into two arrays `A` and `B` using the following rule:

*   Elements at **prime** indices in `nums` must go into array `A`.
*   All other elements must go into array `B`.

Return the **absolute** difference between the sums of the two arrays: `|sum(A) - sum(B)|`.

**Note:** An empty array has a sum of 0.

**Example 1:**

**Input:** nums = [2,3,4]

**Output:** 1

**Explanation:**

*   The only prime index in the array is 2, so `nums[2] = 4` is placed in array `A`.
*   The remaining elements, `nums[0] = 2` and `nums[1] = 3` are placed in array `B`.
*   `sum(A) = 4`, `sum(B) = 2 + 3 = 5`.
*   The absolute difference is `|4 - 5| = 1`.

**Example 2:**

**Input:** nums = [-1,5,7,0]

**Output:** 3

**Explanation:**

*   The prime indices in the array are 2 and 3, so `nums[2] = 7` and `nums[3] = 0` are placed in array `A`.
*   The remaining elements, `nums[0] = -1` and `nums[1] = 5` are placed in array `B`.
*   `sum(A) = 7 + 0 = 7`, `sum(B) = -1 + 5 = 4`.
*   The absolute difference is `|7 - 4| = 3`.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>