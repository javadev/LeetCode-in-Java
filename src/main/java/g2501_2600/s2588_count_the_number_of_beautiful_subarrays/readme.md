2588\. Count the Number of Beautiful Subarrays

Medium

You are given a **0-indexed** integer array `nums`. In one operation, you can:

*   Choose two different indices `i` and `j` such that `0 <= i, j < nums.length`.
*   Choose a non-negative integer `k` such that the <code>k<sup>th</sup></code> bit (**0-indexed**) in the binary representation of `nums[i]` and `nums[j]` is `1`.
*   Subtract <code>2<sup>k</sup></code> from `nums[i]` and `nums[j]`.

A subarray is **beautiful** if it is possible to make all of its elements equal to `0` after applying the above operation any number of times.

Return _the number of **beautiful subarrays** in the array_ `nums`.

A subarray is a contiguous **non-empty** sequence of elements within an array.

**Example 1:**

**Input:** nums = [4,3,1,2,4]

**Output:** 2

**Explanation:** There are 2 beautiful subarrays in nums: [4,<ins>3,1,2</ins>,4] and [<ins>4,3,1,2,4</ins>]. 
- We can make all elements in the subarray [3,1,2] equal to 0 in the following way: 
  - Choose [<ins>3</ins>, 1, <ins>2</ins>] and k = 1. Subtract 2<sup>1</sup> from both numbers. The subarray becomes [1, 1, 0]. 
  - Choose [<ins>1</ins>, <ins>1</ins>, 0] and k = 0. Subtract 2<sup>0</sup> from both numbers. The subarray becomes [0, 0, 0]. 
- We can make all elements in the subarray [4,3,1,2,4] equal to 0 in the following way: 
  - Choose [<ins>4</ins>, 3, 1, 2, <ins>4</ins>] and k = 2. Subtract 2<sup>2</sup> from both numbers. The subarray becomes [0, 3, 1, 2, 0]. 
  - Choose [0, <ins>3</ins>, <ins>1</ins>, 2, 0] and k = 0. Subtract 2<sup>0</sup> from both numbers. The subarray becomes [0, 2, 0, 2, 0]. 
  - Choose [0, <ins>2</ins>, 0, <ins>2</ins>, 0] and k = 1. Subtract 2<sup>1</sup> from both numbers. The subarray becomes [0, 0, 0, 0, 0].

**Example 2:**

**Input:** nums = [1,10,4]

**Output:** 0

**Explanation:** There are no beautiful subarrays in nums.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>6</sup></code>