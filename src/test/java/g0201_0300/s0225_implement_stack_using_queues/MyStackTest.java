package g0201_0300.s0225_implement_stack_using_queues;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyStackTest {
    @Test
    void stackUsingQueue() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        assertThat(stack.top(), equalTo(2));
        assertThat(stack.pop(), equalTo(2));
        assertThat(stack.empty(), equalTo(false));
    }
}
