package g2401_2500.s2454_next_greater_element_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void secondGreaterElement() {
        assertThat(
                new Solution().secondGreaterElement(new int[] {2, 4, 0, 9, 6}),
                equalTo(new int[] {9, 6, 6, -1, -1}));
    }

    @Test
    void secondGreaterElement2() {
        assertThat(
                new Solution().secondGreaterElement(new int[] {3, 3}), equalTo(new int[] {-1, -1}));
    }
}
