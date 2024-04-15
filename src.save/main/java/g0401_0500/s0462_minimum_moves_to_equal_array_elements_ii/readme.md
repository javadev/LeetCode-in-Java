462\. Minimum Moves to Equal Array Elements II

Medium

Given an integer array `nums` of size `n`, return _the minimum number of moves required to make all array elements equal_.

In one move, you can increment or decrement an element of the array by `1`.

Test cases are designed so that the answer will fit in a **32-bit** integer.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 2

**Explanation:** Only two moves are needed (remember each move increments or decrements one element): [1,2,3] => [2,2,3] => [2,2,2]

**Example 2:**

**Input:** nums = [1,10,2,9]

**Output:** 16

**Constraints:**

*   `n == nums.length`
*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>