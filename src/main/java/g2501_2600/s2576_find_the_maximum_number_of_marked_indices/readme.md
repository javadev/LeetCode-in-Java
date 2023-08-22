2576\. Find the Maximum Number of Marked Indices

Medium

You are given a **0-indexed** integer array `nums`.

Initially, all of the indices are unmarked. You are allowed to make this operation any number of times:

*   Pick two **different unmarked** indices `i` and `j` such that `2 * nums[i] <= nums[j]`, then mark `i` and `j`.

Return _the maximum possible number of marked indices in `nums` using the above operation any number of times_.

**Example 1:**

**Input:** nums = [3,5,2,4]

**Output:** 2

**Explanation:** In the first operation: pick i = 2 and j = 1, the operation is allowed because 2 \* nums[2] <= nums[1]. Then mark index 2 and 1. It can be shown that there's no other valid operation so the answer is 2.

**Example 2:**

**Input:** nums = [9,2,5,4]

**Output:** 4

**Explanation:** In the first operation: pick i = 3 and j = 0, the operation is allowed because 2 \* nums[3] <= nums[0]. 

Then mark index 3 and 0. 

In the second operation: pick i = 1 and j = 2, the operation is allowed because 2 \* nums[1] <= nums[2]. Then mark index 1 and 2. 

Since there is no other operation, the answer is 4.

**Example 3:**

**Input:** nums = [7,6,8]

**Output:** 0

**Explanation:** There is no valid operation to do, so the answer is 0.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>