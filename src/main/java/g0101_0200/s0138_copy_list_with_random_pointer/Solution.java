package g0101_0200.s0138_copy_list_with_random_pointer;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Linked_List
// #Programming_Skills_II_Day_14 #Udemy_Linked_List #Top_Interview_150_Linked_List
// #Big_O_Time_O(N)_Space_O(N) #2025_07_04_Time_0_ms_(100.00%)_Space_43.96_MB_(99.29%)

import com_github_leetcode.random.Node;
import java.util.HashMap;
import java.util.Map;

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
public class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            Node copy = hashMap.get(cur);
            copy.next = hashMap.get(cur.next);
            copy.random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }
}
