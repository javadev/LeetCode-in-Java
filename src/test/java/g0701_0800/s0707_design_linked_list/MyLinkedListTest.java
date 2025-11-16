package g0701_0800.s0707_design_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {
    @Test
    void myLinkedList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assertThat(myLinkedList.get(1), equalTo(2));
        myLinkedList.deleteAtIndex(1);
        assertThat(myLinkedList.get(1), equalTo(3));
    }

    @Test
    void myLinkedList2() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        assertThat(myLinkedList.get(1), equalTo(2));
        myLinkedList.deleteAtIndex(0);
        assertThat(myLinkedList.get(0), equalTo(2));
    }

    @Test
    void myLinkedList3() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtIndex(5, 3);
        assertThat(list.get(2), equalTo(-1));
    }

    @Test
    void myLinkedList4() {
        MyLinkedList list = new MyLinkedList();
        list.addAtIndex(0, 10);
        assertThat(list.get(0), equalTo(10));
    }

    @Test
    void myLinkedList5() {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(5);
        assertThat(list.get(0), equalTo(5));
    }

    @Test
    void myLinkedList6() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.deleteAtIndex(5);
        assertThat(list.get(0), equalTo(1));
    }

    @Test
    void myLinkedList7() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.deleteAtIndex(0);
        assertThat(list.get(0), equalTo(2));
        list.deleteAtIndex(1);
        assertThat(list.get(1), equalTo(-1));
    }

    @Test
    void myLinkedList8() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.deleteAtIndex(1);
        assertThat(list.get(1), equalTo(3));
    }

    @Test
    void myLinkedList9() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(2);
        assertThat(list.get(5), equalTo(-1));
        assertThat(list.get(-1), equalTo(2));
    }

    @Test
    void myLinkedList10() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtIndex(1, 3);
        list.deleteAtIndex(0);
        list.addAtTail(4);
        assertThat(list.get(0), equalTo(3));
        assertThat(list.get(1), equalTo(2));
        assertThat(list.get(2), equalTo(4));
    }

    @Test
    void myLinkedList11() {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        assertThat(list.get(0), equalTo(2));
        assertThat(list.get(1), equalTo(1));
    }
}
