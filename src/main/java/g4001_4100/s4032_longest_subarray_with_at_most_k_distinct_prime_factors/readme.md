4032\. Longest Subarray With at Most K Distinct Prime Factors

Medium

You are given an integer array `nums` consisting of positive integers and an integer `k`.

The **prime factor set** of a non-empty subarrays is the **union** of the distinct **prime** factors of all its elements.

Return the length of the **longest** subarray whose prime factor set contains **at most** `k` distinct prime factors. If no such subarray exists, return 0.

**Example 1:**

**Input:** nums = [7,6,10,12,11], k = 3

**Output:** 3

**Explanation:**

Consider the subarray `[6, 10, 12]`:

*   The distinct prime factors of 6 are `{2, 3}`.
*   The distinct prime factors of 10 are `{2, 5}`.
*   The distinct prime factors of 12 are `{2, 3}`.
*   The union of these sets is `{2, 3, 5}`, which contains 3 distinct prime factors.

No longer subarray satisfies the condition. Therefore, the answer is 3.

**Example 2:**

**Input:** nums = [4,6,9,18], k = 4

**Output:** 4

**Explanation:**

Consider the entire array `[4, 6, 9, 18]`:

*   The distinct prime factors of 4 are `{2}`.
*   The distinct prime factors of 6 are `{2, 3}`.
*   The distinct prime factors of 9 are `{3}`.
*   The distinct prime factors of 18 are `{2, 3}`.
*   The union of these sets is `{2, 3}`, which contains 2 distinct prime factors.

Since `2 <= 4`, the entire array is valid. Therefore, the answer is 4.

**Example 3:**

**Input:** nums = [6,10,15], k = 2

**Output:** 1

**Explanation:**

Every subarray of length at least 2 has prime factor set `{2, 3, 5}`, which contains 3 distinct prime factors.

Since `3 > 2`, only subarrays of length 1 are valid. Therefore, the answer is 1.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>2 <= nums[i] <= 10<sup>5</sup></code>
*   <code>1 <= k <= 10<sup>4</sup></code>