package g0101_0200.s0155_min_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MinStackTest {
    @Test
    void minStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        // return -3
        assertThat(minStack.getMin(), equalTo(-3));
        minStack.pop();
        // return 0
        assertThat(minStack.top(), equalTo(0));
        // return -2
        assertThat(minStack.getMin(), equalTo(-2));
    }
}
