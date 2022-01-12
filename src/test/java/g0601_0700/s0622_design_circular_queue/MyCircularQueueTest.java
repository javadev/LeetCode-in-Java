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
}
