package g0501_0600.s0503_next_greater_element_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextGreaterElements() {
        assertThat(
                new Solution().nextGreaterElements(new int[] {1, 2, 1}),
                equalTo(new int[] {2, -1, 2}));
    }

    @Test
    void nextGreaterElements2() {
        assertThat(
                new Solution().nextGreaterElements(new int[] {1, 2, 3, 4, 3}),
                equalTo(new int[] {2, 3, 4, -1, 4}));
    }
}
