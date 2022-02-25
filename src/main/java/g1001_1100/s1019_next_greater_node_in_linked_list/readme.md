1019\. Next Greater Node In Linked List

Medium

You are given the `head` of a linked list with `n` nodes.

For each node in the list, find the value of the **next greater node**. That is, for each node, find the value of the first node that is next to it and has a **strictly larger** value than it.

Return an integer array `answer` where `answer[i]` is the value of the next greater node of the <code>i<sup>th</sup></code> node (**1-indexed**). If the <code>i<sup>th</sup></code> node does not have a next greater node, set `answer[i] = 0`.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/08/05/linkedlistnext1.jpg)

**Input:** head = [2,1,5]

**Output:** [5,5,0]

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/08/05/linkedlistnext2.jpg)

**Input:** head = [2,7,4,3,5]

**Output:** [7,0,5,5,0]

**Constraints:**

*   The number of nodes in the list is `n`.
*   <code>1 <= n <= 10<sup>4</sup></code>
*   <code>1 <= Node.val <= 10<sup>9</sup></code>