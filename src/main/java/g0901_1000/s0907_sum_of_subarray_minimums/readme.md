907\. Sum of Subarray Minimums

Medium

Given an array of integers arr, find the sum of `min(b)`, where `b` ranges over every (contiguous) subarray of `arr`. Since the answer may be large, return the answer **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** arr = [3,1,2,4]

**Output:** 17

**Explanation:** 

Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 

Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.

**Example 2:**

**Input:** arr = [11,81,94,43,3]

**Output:** 444

**Constraints:**

*   <code>1 <= arr.length <= 3 * 10<sup>4</sup></code>
*   <code>1 <= arr[i] <= 3 * 10<sup>4</sup></code>