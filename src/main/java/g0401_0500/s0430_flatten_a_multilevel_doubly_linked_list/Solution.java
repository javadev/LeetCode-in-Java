package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list;

// #Medium #Depth_First_Search #Linked_List #Doubly_Linked_List
// #2022_07_16_Time_0_ms_(100.00%)_Space_42.4_MB_(29.79%)

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
public class Solution {
    // is true ONLY for the first element of the list
    private boolean first = true;
    // Holds the head node of the newly constructed doubly linked list
    private Node root;
    // Holds the current node of the newly constructed doubly linked list
    private Node current;

    public Node flatten(Node head) {
        if (head == null) {
            return root;
        } else {
            // Construct our doubly linked list
            if (first) {
                first = !first;
                root = new Node(head.val);
                current = root;
            } else {
                // Map all values to the newly constructed list.
                // temp value to hold our prev element
                Node temp = current;
                current.next = new Node(head.val);
                current = current.next;
                current.prev = temp;
            }
        }
        // iterate over child nodes.
        if (head.child != null) {
            flatten(head.child);
        }
        if (head.next != null) {
            // iterate next
            flatten(head.next);
        }
        return root;
    }
}
