package g0601_0700.s0622_design_circular_queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyCircularQueueTest {
    @Test
    void myCircularQueue() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        assertThat(myCircularQueue.enQueue(1), equalTo(true));
        assertThat(myCircularQueue.enQueue(2), equalTo(true));
        assertThat(myCircularQueue.enQueue(3), equalTo(true));
        assertThat(myCircularQueue.enQueue(4), equalTo(false));
        assertThat(myCircularQueue.rear(), equalTo(3));
        assertThat(myCircularQueue.isFull(), equalTo(true));
        assertThat(myCircularQueue.deQueue(), equalTo(true));
        assertThat(myCircularQueue.enQueue(4), equalTo(true));
        assertThat(myCircularQueue.rear(), equalTo(4));
    }

    @Test
    void myCircularQueue2() {
        MyCircularQueue q = new MyCircularQueue(3);
        assertThat(q.enQueue(1), equalTo(true));
        assertThat(q.enQueue(2), equalTo(true));
        assertThat(q.enQueue(3), equalTo(true));
        assertThat(q.enQueue(4), equalTo(false));
        assertThat(q.rear(), equalTo(3));
        assertThat(q.isFull(), equalTo(true));
        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.enQueue(4), equalTo(true));
        assertThat(q.rear(), equalTo(4));
    }

    @Test
    void myCircularQueue3() {
        MyCircularQueue q = new MyCircularQueue(2);
        assertThat(q.front(), equalTo(-1));
        assertThat(q.rear(), equalTo(-1));
        assertThat(q.deQueue(), equalTo(false));
        assertThat(q.isEmpty(), equalTo(true));
    }

    @Test
    void myCircularQueue4() {
        MyCircularQueue q = new MyCircularQueue(1);
        assertThat(q.enQueue(10), equalTo(true));
        assertThat(q.isFull(), equalTo(true));
        assertThat(q.front(), equalTo(10));
        assertThat(q.rear(), equalTo(10));
        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.isEmpty(), equalTo(true));
        assertThat(q.front(), equalTo(-1));
        assertThat(q.rear(), equalTo(-1));
    }

    @Test
    void myCircularQueue5() {
        MyCircularQueue q = new MyCircularQueue(3);

        assertThat(q.enQueue(1), equalTo(true));
        assertThat(q.enQueue(2), equalTo(true));
        assertThat(q.enQueue(3), equalTo(true));
        assertThat(q.isFull(), equalTo(true));

        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.enQueue(4), equalTo(true));

        assertThat(q.front(), equalTo(2));
        assertThat(q.rear(), equalTo(4));

        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.deQueue(), equalTo(false));
    }

    @Test
    void myCircularQueue6() {
        MyCircularQueue q = new MyCircularQueue(2);

        assertThat(q.enQueue(5), equalTo(true));
        assertThat(q.enQueue(6), equalTo(true));
        assertThat(q.isFull(), equalTo(true));

        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.deQueue(), equalTo(true));
        assertThat(q.isEmpty(), equalTo(true));

        assertThat(q.enQueue(7), equalTo(true));
        assertThat(q.front(), equalTo(7));
        assertThat(q.rear(), equalTo(7));
    }
}
