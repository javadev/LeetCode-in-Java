package g0401_0500.s0496_next_greater_element_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextGreaterElement() {
        assertThat(
                new Solution().nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2}),
                equalTo(new int[] {-1, 3, -1}));
    }

    @Test
    void nextGreaterElement2() {
        assertThat(
                new Solution().nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4}),
                equalTo(new int[] {3, -1}));
    }
}
