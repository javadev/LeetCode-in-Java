package g0701_0800.s0707_design_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {
    @Test
    void myLinkedListTest() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assertThat(myLinkedList.get(1), equalTo(2));
        myLinkedList.deleteAtIndex(1);
        assertThat(myLinkedList.get(1), equalTo(3));
    }
}
