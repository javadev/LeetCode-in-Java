package g0101_0200.s0138_copy_list_with_random_pointer;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Linked_List
// #Programming_Skills_II_Day_14 #Udemy_Linked_List #Big_O_Time_O(N)_Space_O(N)
// #2022_06_24_Time_0_ms_(100.00%)_Space_45.5_MB_(56.49%)

import com_github_leetcode.random.Node;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // first pass to have a clone node point to the next node. ie A->B becomes A->clonedNode->B
        Node curr = head;
        while (curr != null) {
            Node clonedNode = new Node(curr.val);
            clonedNode.next = curr.next;
            curr.next = clonedNode;
            curr = clonedNode.next;
        }
        curr = head;
        // second pass to make the cloned node's random pointer point to the orginal node's randome
        // pointer.
        // ie. A's random pointer becomes ClonedNode's random pointer
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            } else {
                curr.next.random = null;
            }
            curr = curr.next.next;
        }
        curr = head;
        // third pass to restore the links and return the head of the cloned nodes' list.
        Node newHead = null;
        while (curr != null) {
            Node clonedNode;
            if (newHead == null) {
                clonedNode = curr.next;
                newHead = clonedNode;
            } else {
                clonedNode = curr.next;
            }
            curr.next = clonedNode.next;
            if (curr.next != null) {
                clonedNode.next = curr.next.next;
            } else {
                clonedNode.next = null;
            }
            curr = curr.next;
        }
        return newHead;
    }
}
