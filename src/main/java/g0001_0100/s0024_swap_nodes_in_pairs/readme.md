24\. Swap Nodes in Pairs

Medium

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg)

**Input:** head = [1,2,3,4]

**Output:** [2,1,4,3] 

**Example 2:**

**Input:** head = []

**Output:** [] 

**Example 3:**

**Input:** head = [1]

**Output:** [1] 

**Constraints:**

*   The number of nodes in the list is in the range `[0, 100]`.
*   `0 <= Node.val <= 100`

To solve the "Swap Nodes in Pairs" problem in Java with a `Solution` class, we can traverse the linked list while swapping pairs of nodes. Here are the steps:

1. Define a `Solution` class.
2. Define a method named `swapPairs` that takes the head of a linked list as input and returns the head of the modified list.
3. Create a dummy ListNode object and set its `next` pointer to the head of the input list. This dummy node will serve as the new head of the modified list.
4. Initialize three pointers: `prev`, `first`, and `second`.
5. Iterate through the list while `first` and `second` are not null:
   - Assign `first` to the `next` pointer of `prev`.
   - Assign `second` to the `next` pointer of `first`.
   - Assign the `next` pointer of `prev` to the `next` pointer of `second`.
   - Assign the `next` pointer of `second` to `first`.
   - Move `prev` to `first`.
   - Move `first` to `first.next` (which is the next pair of nodes).
6. Return the `next` pointer of the dummy node, which points to the head of the modified list.

Here's the implementation:

```java
public class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node and point its next to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize pointers
        ListNode prev = dummy;
        ListNode first, second;
        
        // Swap pairs of nodes
        while (prev.next != null && prev.next.next != null) {
            first = prev.next;
            second = first.next;
            
            // Swap nodes
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            // Move prev to the next pair of nodes
            prev = first;
        }
        
        return dummy.next;
    }
}
```

This implementation provides a solution to the "Swap Nodes in Pairs" problem in Java without modifying the values in the list's nodes.