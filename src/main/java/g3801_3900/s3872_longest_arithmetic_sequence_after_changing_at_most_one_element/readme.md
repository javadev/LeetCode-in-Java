3872\. Longest Arithmetic Sequence After Changing At Most One Element

Medium

You are given an integer array `nums`.

A subarray is **arithmetic** if the difference between consecutive elements in the subarray is constant.

You can replace **at most one** element in `nums` with any **integer**. Then, you select an arithmetic subarray from `nums`.

Return an integer denoting the **maximum** length of the arithmetic subarray you can select.

**Example 1:**

**Input:** nums = [9,7,5,10,1]

**Output:** 5

**Explanation:**

*   Replace `nums[3] = 10` with 3. The array becomes `[9, 7, 5, 3, 1]`.
*   Select the subarray <code>[<ins>**9, 7, 5, 3, 1**</ins>]</code>, which is arithmetic because consecutive elements have a common difference of -2.

**Example 2:**

**Input:** nums = [1,2,6,7]

**Output:** 3

**Explanation:**

*   Replace `nums[0] = 1` with -2. The array becomes `[-2, 2, 6, 7]`.
*   Select the subarray <code>[<ins>**-2, 2, 6**</ins>, 7]</code>, which is arithmetic because consecutive elements have a common difference of 4.

**Constraints:**

*   <code>4 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>5</sup></code>