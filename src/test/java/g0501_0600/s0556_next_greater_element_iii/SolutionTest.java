package g0501_0600.s0556_next_greater_element_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextGreaterElement() {
        assertThat(new Solution().nextGreaterElement(12), equalTo(21));
    }

    @Test
    void nextGreaterElement2() {
        assertThat(new Solution().nextGreaterElement(21), equalTo(-1));
    }
}
