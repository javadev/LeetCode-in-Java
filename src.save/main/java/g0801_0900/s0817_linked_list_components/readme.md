817\. Linked List Components

Medium

You are given the `head` of a linked list containing unique integer values and an integer array `nums` that is a subset of the linked list values.

Return _the number of connected components in_ `nums` _where two values are connected if they appear **consecutively** in the linked list_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/07/22/lc-linkedlistcom1.jpg)

**Input:** head = [0,1,2,3], nums = [0,1,3]

**Output:** 2

**Explanation:** 0 and 1 are connected, so [0, 1] and [3] are the two connected components.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/07/22/lc-linkedlistcom2.jpg)

**Input:** head = [0,1,2,3,4], nums = [0,3,1,4]

**Output:** 2

**Explanation:** 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.

**Constraints:**

*   The number of nodes in the linked list is `n`.
*   <code>1 <= n <= 10<sup>4</sup></code>
*   `0 <= Node.val < n`
*   All the values `Node.val` are **unique**.
*   `1 <= nums.length <= n`
*   `0 <= nums[i] < n`
*   All the values of `nums` are **unique**.