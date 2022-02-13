21\. Merge Two Sorted Lists

Easy

Merge two sorted linked lists and return it as a **sorted** list. The list should be made by splicing together the nodes of the first two lists.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg)

**Input:** l1 = [1,2,4], l2 = [1,3,4]

**Output:** [1,1,2,3,4,4] 

**Example 2:**

**Input:** l1 = [], l2 = []

**Output:** [] 

**Example 3:**

**Input:** l1 = [], l2 = [0]

**Output:** [0] 

**Constraints:**

*   The number of nodes in both lists is in the range `[0, 50]`.
*   `-100 <= Node.val <= 100`
*   Both `l1` and `l2` are sorted in **non-decreasing** order.