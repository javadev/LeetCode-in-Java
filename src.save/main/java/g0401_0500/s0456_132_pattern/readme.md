456\. 132 Pattern

Medium

Given an array of `n` integers `nums`, a **132 pattern** is a subsequence of three integers `nums[i]`, `nums[j]` and `nums[k]` such that `i < j < k` and `nums[i] < nums[k] < nums[j]`.

Return _`true` if there is a **132 pattern** in `nums`, otherwise, return `false`._

**Example 1:**

**Input:** nums = [1,2,3,4]

**Output:** false

**Explanation:** There is no 132 pattern in the sequence.

**Example 2:**

**Input:** nums = [3,1,4,2]

**Output:** true

**Explanation:** There is a 132 pattern in the sequence: [1, 4, 2].

**Example 3:**

**Input:** nums = [-1,3,2,0]

**Output:** true

**Explanation:** There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].

**Constraints:**

*   `n == nums.length`
*   <code>1 <= n <= 2 * 10<sup>5</sup></code>
*   <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>