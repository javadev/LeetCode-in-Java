3960\. Frequency Balance Subarray

Medium

You are given an integer array `nums`.

Define a **frequency balance non-empty subarrays** as follows:

*   If the subarray contains only one distinct value, it is frequency balanced.
*   Otherwise, there must exist a positive integer `f` such that every distinct value in the subarray occurs either `f` or `2 * f` times, and both frequencies occur among the distinct values.

Return an integer denoting the length of the **longest** frequency balance subarray.

**Example 1:**

**Input:** nums = [1,2,2,1,2,3,3,3]

**Output:** 5

**Explanation:**

*   The longest frequency balance subarray is `[2, 1, 2, 3, 3]`.
*   The elements that appear most frequently are 2 and 3, both appearing twice.
*   The remaining element 1 appears once, meeting the requirements.

**Example 2:**

**Input:** nums = [5,5,5,5]

**Output:** 4

**Explanation:**

*   The longest frequency balance subarray is `[5, 5, 5, 5]`.
*   The element that appears most frequently is 5.
*   There are no other elements meeting the requirements.

**Example 3:**

**Input:** nums = [1,2,3,4]

**Output:** 1

**Explanation:**

Since all elements appear only once, the length of the longest frequency balance subarray is 1.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>3</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>