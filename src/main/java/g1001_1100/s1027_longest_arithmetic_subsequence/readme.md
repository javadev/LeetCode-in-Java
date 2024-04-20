1027\. Longest Arithmetic Subsequence

Medium

Given an array `nums` of integers, return the **length** of the longest arithmetic subsequence in `nums`.

Recall that a _subsequence_ of an array `nums` is a list <code>nums[i<sub>1</sub>], nums[i<sub>2</sub>], ..., nums[i<sub>k</sub>]</code> with <code>0 <= i<sub>1</sub> < i<sub>2</sub> < ... < i<sub>k</sub> <= nums.length - 1</code>, and that a sequence `seq` is _arithmetic_ if `seq[i+1] - seq[i]` are all the same value (for `0 <= i < seq.length - 1`).

**Example 1:**

**Input:** nums = [3,6,9,12]

**Output:** 4

**Explanation:** The whole array is an arithmetic sequence with steps of length = 3.

**Example 2:**

**Input:** nums = [9,4,7,2,10]

**Output:** 3

**Explanation:** The longest arithmetic subsequence is [4,7,10].

**Example 3:**

**Input:** nums = [20,1,15,3,10,5,8]

**Output:** 4

**Explanation:** The longest arithmetic subsequence is [20,15,10,5].

**Constraints:**

*   `2 <= nums.length <= 1000`
*   `0 <= nums[i] <= 500`