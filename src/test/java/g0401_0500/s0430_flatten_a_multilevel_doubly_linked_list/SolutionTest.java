package g0401_0500.s0430_flatten_a_multilevel_doubly_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flatten() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        node2.prev = node1;
        Node node3 = new Node(3);
        node2.next = node3;
        node3.prev = node2;
        Node node4 = new Node(4);
        node3.next = node4;
        node4.prev = node3;
        Node node5 = new Node(5);
        node4.next = node5;
        node5.prev = node4;
        Node node6 = new Node(6);
        node5.next = node6;
        node6.prev = node5;
        Node node7 = new Node(7);
        node3.child = node7;
        Node node8 = new Node(8);
        node7.next = node8;
        node8.prev = node7;
        Node node9 = new Node(9);
        node8.next = node9;
        node9.prev = node8;
        Node node10 = new Node(10);
        node9.next = node10;
        node10.prev = node9;
        Node node11 = new Node(11);
        node8.child = node11;
        Node node12 = new Node(12);
        node11.next = node12;
        node12.prev = node11;
        assertThat(
                new Solution().flatten(node1).toString(),
                equalTo(
                        "Node{val=1,next=Node{"
                                + "val=2,next=Node{val=3,next=Node{val=7,next=Node{val=8,next=Node{val=11,next="
                                + "Node{val=12,next=Node{val=9,next=Node{val=10,next=Node{val=4,next=Node{val=5"
                                + ",next=Node{val=6,next=null}}}}}}}}}}}}"));
    }
}
