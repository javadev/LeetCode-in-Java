945\. Minimum Increment to Make Array Unique

Medium

You are given an integer array `nums`. In one move, you can pick an index `i` where `0 <= i < nums.length` and increment `nums[i]` by `1`.

Return _the minimum number of moves to make every value in_ `nums` _**unique**_.

**Example 1:**

**Input:** nums = [1,2,2]

**Output:** 1

**Explanation:** After 1 move, the array could be [1, 2, 3].

**Example 2:**

**Input:** nums = [3,2,1,2,1,7]

**Output:** 6

**Explanation:** After 6 moves, the array could be [3, 4, 1, 2, 5, 7]. It can be shown with 5 or less moves that it is impossible for the array to have all unique values.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>5</sup></code>