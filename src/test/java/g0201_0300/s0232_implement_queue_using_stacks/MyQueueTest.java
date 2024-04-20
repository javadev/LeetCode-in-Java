package g0201_0300.s0232_implement_queue_using_stacks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyQueueTest {
    @Test
    void queueUsingStacks() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        assertThat(myQueue.peek(), equalTo(1));
        assertThat(myQueue.pop(), equalTo(1));
        assertThat(myQueue.empty(), equalTo(false));
    }
}
