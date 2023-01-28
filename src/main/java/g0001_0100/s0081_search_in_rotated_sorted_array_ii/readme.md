81\. Search in Rotated Sorted Array II

Medium

There is an integer array `nums` sorted in non-decreasing order (not necessarily with **distinct** values).

Before being passed to your function, `nums` is **rotated** at an unknown pivot index `k` (`0 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,4,4,5,6,6,7]` might be rotated at pivot index `5` and become `[4,5,6,6,7,0,1,2,4,4]`.

Given the array `nums` **after** the rotation and an integer `target`, return `true` _if_ `target` _is in_ `nums`_, or_ `false` _if it is not in_ `nums`_._

You must decrease the overall operation steps as much as possible.

**Example 1:**

**Input:** nums = [2,5,6,0,0,1,2], target = 0

**Output:** true 

**Example 2:**

**Input:** nums = [2,5,6,0,0,1,2], target = 3

**Output:** false 

**Constraints:**

*   `1 <= nums.length <= 5000`
*   <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
*   `nums` is guaranteed to be rotated at some pivot.
*   <code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code>

**Follow up:** This problem is similar to [Search in Rotated Sorted Array](https://github.com/javadev/LeetCode-in-Java/tree/main/src/main/java/g0001_0100/s0033_search_in_rotated_sorted_array/), but `nums` may contain **duplicates**. Would this affect the runtime complexity? How and why?