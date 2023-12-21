package g0501_0600.s0502_ipo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaximizedCapital() {
        assertThat(
                new Solution().findMaximizedCapital(2, 0, new int[] {1, 2, 3}, new int[] {0, 1, 1}),
                equalTo(4));
    }

    @Test
    void findMaximizedCapital2() {
        assertThat(
                new Solution().findMaximizedCapital(3, 0, new int[] {1, 2, 3}, new int[] {0, 1, 2}),
                equalTo(6));
    }
}
