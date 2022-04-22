package g1601_1700.s1670_design_front_middle_back_queue;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class FrontMiddleBackQueueTest {
    @Test
    void frontMiddleBackQueue() {
        FrontMiddleBackQueue q = new FrontMiddleBackQueue();
        // [1]
        q.pushFront(1);
        // [1, 2]
        q.pushBack(2);
        // [1, 3, 2]
        q.pushMiddle(3);
        // [1, 4, 3, 2]
        q.pushMiddle(4);
        // return 1 -> [4, 3, 2]
        assertThat(q.popFront(), equalTo(1));
        // return 3 -> [4, 2]
        assertThat(q.popMiddle(), equalTo(3));
        // return 4 -> [2]
        assertThat(q.popMiddle(), equalTo(4));
        // return 2 -> []
        assertThat(q.popBack(), equalTo(2));
        // return -1 -> [] (The queue is empty)
        assertThat(q.popFront(), equalTo(-1));
    }
}
