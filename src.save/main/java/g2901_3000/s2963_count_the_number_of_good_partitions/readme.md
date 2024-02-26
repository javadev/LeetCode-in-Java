2963\. Count the Number of Good Partitions

Hard

You are given a **0-indexed** array `nums` consisting of **positive** integers.

A partition of an array into one or more **contiguous** subarrays is called **good** if no two subarrays contain the same number.

Return _the **total number** of good partitions of_ `nums`.

Since the answer may be large, return it **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** nums = [1,2,3,4]

**Output:** 8

**Explanation:** The 8 possible good partitions are: ([1], [2], [3], [4]), ([1], [2], [3,4]), ([1], [2,3], [4]), ([1], [2,3,4]), ([1,2], [3], [4]), ([1,2], [3,4]), ([1,2,3], [4]), and ([1,2,3,4]).

**Example 2:**

**Input:** nums = [1,1,1,1]

**Output:** 1

**Explanation:** The only possible good partition is: ([1,1,1,1]).

**Example 3:**

**Input:** nums = [1,2,1,3]

**Output:** 2

**Explanation:** The 2 possible good partitions are: ([1,2,1], [3]) and ([1,2,1,3]).

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>