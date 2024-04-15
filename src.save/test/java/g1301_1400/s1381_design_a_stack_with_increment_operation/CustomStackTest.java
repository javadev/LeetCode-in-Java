package g1301_1400.s1381_design_a_stack_with_increment_operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class CustomStackTest {
    @Test
    void customStack() {
        // Stack is Empty []
        CustomStack customStack = new CustomStack(3);
        // stack becomes [1]
        customStack.push(1);
        // stack becomes [1, 2]
        customStack.push(2);
        // return 2 --> Return top of the stack 2, stack becomes [1]
        assertThat(customStack.pop(), equalTo(2));
        // stack becomes [1, 2]
        customStack.push(2);
        // stack becomes [1, 2, 3]
        customStack.push(3);
        // stack still [1, 2, 3], Don't add another elements as size is 4
        customStack.push(4);
        // stack becomes [101, 102, 103]
        customStack.increment(5, 100);
        // stack becomes [201, 202, 103]
        customStack.increment(2, 100);
        // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        assertThat(customStack.pop(), equalTo(103));
        // return 202 --> Return top of the stack 102, stack becomes [201]
        assertThat(customStack.pop(), equalTo(202));
        // return 201 --> Return top of the stack 101, stack becomes []
        assertThat(customStack.pop(), equalTo(201));
        // return -1 --> Stack is empty return -1.
        assertThat(customStack.pop(), equalTo(-1));
    }
}
