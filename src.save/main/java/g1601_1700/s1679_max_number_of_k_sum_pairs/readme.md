1679\. Max Number of K-Sum Pairs

Medium

You are given an integer array `nums` and an integer `k`.

In one operation, you can pick two numbers from the array whose sum equals `k` and remove them from the array.

Return _the maximum number of operations you can perform on the array_.

**Example 1:**

**Input:** nums = [1,2,3,4], k = 5

**Output:** 2

**Explanation:** Starting with nums = [1,2,3,4]:

- Remove numbers 1 and 4, then nums = [2,3]

- Remove numbers 2 and 3, then nums = []

There are no more pairs that sum up to 5, hence a total of 2 operations.

**Example 2:**

**Input:** nums = [3,1,3,4,3], k = 6

**Output:** 1

**Explanation:** Starting with nums = [3,1,3,4,3]:

- Remove the first two 3's, then nums = [1,4,3]

There are no more pairs that sum up to 6, hence a total of 1 operation.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>
*   <code>1 <= k <= 10<sup>9</sup></code>