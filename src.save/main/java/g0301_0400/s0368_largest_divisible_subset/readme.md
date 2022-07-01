368\. Largest Divisible Subset

Medium

Given a set of **distinct** positive integers `nums`, return the largest subset `answer` such that every pair `(answer[i], answer[j])` of elements in this subset satisfies:

*   `answer[i] % answer[j] == 0`, or
*   `answer[j] % answer[i] == 0`

If there are multiple solutions, return any of them.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** [1,2]

**Explanation:** [1,3] is also accepted.

**Example 2:**

**Input:** nums = [1,2,4,8]

**Output:** [1,2,4,8]

**Constraints:**

*   `1 <= nums.length <= 1000`
*   <code>1 <= nums[i] <= 2 * 10<sup>9</sup></code>
*   All the integers in `nums` are **unique**.