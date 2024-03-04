3048\. Earliest Second to Mark Indices I

Medium

You are given two **1-indexed** integer arrays, `nums` and, `changeIndices`, having lengths `n` and `m`, respectively.

Initially, all indices in `nums` are unmarked. Your task is to mark **all** indices in `nums`.

In each second, `s`, in order from `1` to `m` (**inclusive**), you can perform **one** of the following operations:

*   Choose an index `i` in the range `[1, n]` and **decrement** `nums[i]` by `1`.
*   If `nums[changeIndices[s]]` is **equal** to `0`, **mark** the index `changeIndices[s]`.
*   Do nothing.

Return _an integer denoting the **earliest second** in the range_ `[1, m]` _when **all** indices in_ `nums` _can be marked by choosing operations optimally, or_ `-1` _if it is impossible._

**Example 1:**

**Input:** nums = [2,2,0], changeIndices = [2,2,2,2,3,2,2,1]

**Output:** 8

**Explanation:** In this example, we have 8 seconds. The following operations can be performed to mark all indices:

Second 1: Choose index 1 and decrement nums[1] by one. nums becomes [1,2,0]. 

Second 2: Choose index 1 and decrement nums[1] by one. nums becomes [0,2,0]. 

Second 3: Choose index 2 and decrement nums[2] by one. nums becomes [0,1,0]. 

Second 4: Choose index 2 and decrement nums[2] by one. nums becomes [0,0,0]. 

Second 5: Mark the index changeIndices[5], which is marking index 3, since nums[3] is equal to 0. 

Second 6: Mark the index changeIndices[6], which is marking index 2, since nums[2] is equal to 0. 

Second 7: Do nothing. 

Second 8: Mark the index changeIndices[8], which is marking index 1, since nums[1] is equal to 0. 

Now all indices have been marked. 

It can be shown that it is not possible to mark all indices earlier than the 8th second. 

Hence, the answer is 8.

**Example 2:**

**Input:** nums = [1,3], changeIndices = [1,1,1,2,1,1,1]

**Output:** 6

**Explanation:** In this example, we have 7 seconds. The following operations can be performed to mark all indices: 

Second 1: Choose index 2 and decrement nums[2] by one. nums becomes [1,2]. 

Second 2: Choose index 2 and decrement nums[2] by one. nums becomes [1,1].

Second 3: Choose index 2 and decrement nums[2] by one. nums becomes [1,0].

Second 4: Mark the index changeIndices[4], which is marking index 2, since nums[2] is equal to 0.

Second 5: Choose index 1 and decrement nums[1] by one. nums becomes [0,0]. 

Second 6: Mark the index changeIndices[6], which is marking index 1, since nums[1] is equal to 0.

Now all indices have been marked.

It can be shown that it is not possible to mark all indices earlier than the 6th second. 

Hence, the answer is 6.

**Example 3:**

**Input:** nums = [0,1], changeIndices = [2,2,2]

**Output:** -1

**Explanation:** In this example, it is impossible to mark all indices because index 1 isn't in changeIndices. Hence, the answer is -1.

**Constraints:**

*   `1 <= n == nums.length <= 2000`
*   <code>0 <= nums[i] <= 10<sup>9</sup></code>
*   `1 <= m == changeIndices.length <= 2000`
*   `1 <= changeIndices[i] <= n`