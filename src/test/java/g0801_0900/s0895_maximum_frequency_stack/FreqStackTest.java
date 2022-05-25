package g0801_0900.s0895_maximum_frequency_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class FreqStackTest {
    @Test
    void freqStack() {
        FreqStack freqStack = new FreqStack();
        // The stack is [5]
        freqStack.push(5);
        // The stack is [5,7]
        freqStack.push(7);
        // The stack is [5,7,5]
        freqStack.push(5);
        // The stack is [5,7,5,7]
        freqStack.push(7);
        // The stack is [5,7,5,7,4]
        freqStack.push(4);
        // The stack is [5,7,5,7,4,5]
        freqStack.push(5);
        // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
        assertThat(freqStack.pop(), equalTo(5));
        // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes
        // [5,7,5,4].
        assertThat(freqStack.pop(), equalTo(7));
        // return 5, as 5 is the most frequent. The stack becomes [5,7,4]. freqStack.pop(); //
        // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top. The stack
        // becomes [5,7].
        assertThat(freqStack.pop(), equalTo(5));
    }
}
