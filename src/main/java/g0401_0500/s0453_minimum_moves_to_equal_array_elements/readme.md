453\. Minimum Moves to Equal Array Elements

Medium

Given an integer array `nums` of size `n`, return _the minimum number of moves required to make all array elements equal_.

In one move, you can increment `n - 1` elements of the array by `1`.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 3

**Explanation:** Only three moves are needed (remember each move increments two elements): [1,2,3] => [2,3,3] => [3,4,3] => [4,4,4]

**Example 2:**

**Input:** nums = [1,1,1]

**Output:** 0

**Constraints:**

*   `n == nums.length`
*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
*   The answer is guaranteed to fit in a **32-bit** integer.