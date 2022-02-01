package g0501_0600.s0565_array_nesting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrayNesting() {
        assertThat(new Solution().arrayNesting(new int[] {5, 4, 0, 3, 1, 6, 2}), equalTo(4));
    }

    @Test
    void arrayNesting2() {
        assertThat(new Solution().arrayNesting(new int[] {0, 1, 2}), equalTo(1));
    }
}
