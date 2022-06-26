143\. Reorder List

Medium

You are given the head of a singly linked-list. The list can be represented as:

L<sub>0</sub> → L<sub>1</sub> → … → L<sub>n - 1</sub> → L<sub>n</sub> 

_Reorder the list to be on the following form:_

L<sub>0</sub> → L<sub>n</sub> → L<sub>1</sub> → L<sub>n - 1</sub> → L<sub>2</sub> → L<sub>n - 2</sub> → … 

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/04/reorder1linked-list.jpg)

**Input:** head = [1,2,3,4]

**Output:** [1,4,2,3] 

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/03/09/reorder2-linked-list.jpg)

**Input:** head = [1,2,3,4,5]

**Output:** [1,5,2,4,3] 

**Constraints:**

*   The number of nodes in the list is in the range <code>[1, 5 * 10<sup>4</sup>]</code>.
*   `1 <= Node.val <= 1000`