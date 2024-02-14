23\. Merge k Sorted Lists

Hard

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

_Merge all the linked-lists into one sorted linked-list and return it._

**Example 1:**

**Input:** lists = [[1,4,5],[1,3,4],[2,6]]

**Output:** [1,1,2,3,4,4,5,6]

**Explanation:** The linked-lists are: [ 1->4->5, 1->3->4, 2->6 ] merging them into one sorted list: 1->1->2->3->4->4->5->6 

**Example 2:**

**Input:** lists = []

**Output:** [] 

**Example 3:**

**Input:** lists = [[]]

**Output:** [] 

**Constraints:**

*   `k == lists.length`
*   `0 <= k <= 10^4`
*   `0 <= lists[i].length <= 500`
*   `-10^4 <= lists[i][j] <= 10^4`
*   `lists[i]` is sorted in **ascending order**.
*   The sum of `lists[i].length` won't exceed `10^4`.

To solve the "Merge k Sorted Lists" problem in Java with a `Solution` class, we can use a priority queue (min-heap) to efficiently merge the lists. Here are the steps:

1. Define a `Solution` class.
2. Define a method named `mergeKLists` that takes an array of linked lists `lists` as input and returns a single sorted linked list.
3. Create a priority queue of ListNode objects. We will use this priority queue to store the heads of each linked list.
4. Iterate through each linked list in the input array `lists` and add the head node of each list to the priority queue.
5. Create a dummy ListNode object to serve as the head of the merged sorted linked list.
6. Initialize a ListNode object named `current` to point to the dummy node.
7. While the priority queue is not empty:
   - Remove the ListNode with the smallest value from the priority queue.
   - Add this node to the merged linked list by setting the `next` pointer of the `current` node to this node.
   - Move the `current` pointer to the next node in the merged linked list.
   - If the removed node has a `next` pointer, add the next node from the same list to the priority queue.
8. Return the `next` pointer of the dummy node, which points to the head of the merged sorted linked list.

Here's the implementation:

```java
import java.util.PriorityQueue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add the heads of all lists to the priority queue
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }
        
        // Create a dummy node to serve as the head of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Merge the lists
        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;
            
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }
        
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        ListNode[] lists = new ListNode[] {
            ListNode.createList(new int[] {1, 4, 5}),
            ListNode.createList(new int[] {1, 3, 4}),
            ListNode.createList(new int[] {2, 6})
        };
        System.out.println("Merged list:");
        ListNode.printList(solution.mergeKLists(lists));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
```

This implementation provides a solution to the "Merge k Sorted Lists" problem in Java using a priority queue.