1785\. Minimum Elements to Add to Form a Given Sum

Medium

You are given an integer array `nums` and two integers `limit` and `goal`. The array `nums` has an interesting property that `abs(nums[i]) <= limit`.

Return _the minimum number of elements you need to add to make the sum of the array equal to_ `goal`. The array must maintain its property that `abs(nums[i]) <= limit`.

Note that `abs(x)` equals `x` if `x >= 0`, and `-x` otherwise.

**Example 1:**

**Input:** nums = [1,-1,1], limit = 3, goal = -4

**Output:** 2

**Explanation:** You can add -2 and -3, then the sum of the array will be 1 - 1 + 1 - 2 - 3 = -4. 

**Example 2:**

**Input:** nums = [1,-10,9,1], limit = 100, goal = 0

**Output:** 1 

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= limit <= 10<sup>6</sup></code>
*   `-limit <= nums[i] <= limit`
*   <code>-10<sup>9</sup> <= goal <= 10<sup>9</sup></code>