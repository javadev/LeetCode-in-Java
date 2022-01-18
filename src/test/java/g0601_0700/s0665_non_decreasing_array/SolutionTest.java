package g0601_0700.s0665_non_decreasing_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkPossibility() {
        assertThat(new Solution().checkPossibility(new int[] {4, 2, 3}), equalTo(true));
    }

    @Test
    void checkPossibility2() {
        assertThat(new Solution().checkPossibility(new int[] {4, 2, 1}), equalTo(false));
    }
}
