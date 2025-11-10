package g0601_0700.s0641_design_circular_deque;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyCircularDequeTest {
    @Test
    void myCircularDequeTest() {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        assertThat(myCircularDeque.insertLast(1), equalTo(true));
        assertThat(myCircularDeque.insertLast(2), equalTo(true));
        assertThat(myCircularDeque.insertFront(3), equalTo(true));
        assertThat(myCircularDeque.insertFront(4), equalTo(false));
        assertThat(myCircularDeque.getRear(), equalTo(2));
        assertThat(myCircularDeque.isFull(), equalTo(true));
        assertThat(myCircularDeque.deleteLast(), equalTo(true));
        assertThat(myCircularDeque.insertFront(4), equalTo(true));
        assertThat(myCircularDeque.getFront(), equalTo(4));
    }

    @Test
    void myCircularDequeTest2() {
        MyCircularDeque deque = new MyCircularDeque(2);
        assertThat(deque.insertFront(10), equalTo(true));
        assertThat(deque.insertFront(20), equalTo(true));
        assertThat(deque.insertFront(30), equalTo(false)); // full
        assertThat(deque.getFront(), equalTo(20));
        assertThat(deque.deleteFront(), equalTo(true));
        assertThat(deque.getFront(), equalTo(10));
    }

    @Test
    void myCircularDequeTest3() {
        MyCircularDeque deque = new MyCircularDeque(1);
        assertThat(deque.deleteFront(), equalTo(false));
        assertThat(deque.deleteLast(), equalTo(false));
        assertThat(deque.getFront(), equalTo(-1));
        assertThat(deque.getRear(), equalTo(-1));
        assertThat(deque.isEmpty(), equalTo(true));
        assertThat(deque.isFull(), equalTo(false));
    }

    @Test
    void myCircularDequeTest4() {
        MyCircularDeque deque = new MyCircularDeque(2);
        assertThat(deque.insertLast(5), equalTo(true));
        assertThat(deque.insertFront(6), equalTo(true));
        assertThat(deque.isFull(), equalTo(true));
        assertThat(deque.insertFront(7), equalTo(false));
        assertThat(deque.getFront(), equalTo(6));
        assertThat(deque.getRear(), equalTo(5));
    }

    @Test
    void myCircularDequeTest5() {
        MyCircularDeque deque = new MyCircularDeque(3);
        assertThat(deque.insertFront(10), equalTo(true));
        assertThat(deque.deleteFront(), equalTo(true));
        assertThat(deque.insertLast(20), equalTo(true));
        assertThat(deque.deleteLast(), equalTo(true));
        assertThat(deque.isEmpty(), equalTo(true));
    }

    @Test
    void myCircularDequeTest6() {
        MyCircularDeque deque = new MyCircularDeque(1);
        assertThat(deque.insertFront(100), equalTo(true));
        assertThat(deque.isFull(), equalTo(true));
        assertThat(deque.getFront(), equalTo(100));
        assertThat(deque.getRear(), equalTo(100));
        assertThat(deque.deleteFront(), equalTo(true));
        assertThat(deque.isEmpty(), equalTo(true));
    }

    @Test
    void myCircularDequeTest7() {
        MyCircularDeque deque = new MyCircularDeque(5);
        deque.insertFront(1);
        deque.insertLast(2);
        deque.insertFront(3);
        deque.insertLast(4);
        deque.insertFront(5);
        assertThat(deque.isFull(), equalTo(true));
        deque.deleteFront();
        deque.deleteLast();
        assertThat(deque.insertFront(6), equalTo(true));
        assertThat(deque.insertLast(7), equalTo(true));
        assertThat(deque.getFront(), equalTo(6));
        assertThat(deque.getRear(), equalTo(7));
    }
}
