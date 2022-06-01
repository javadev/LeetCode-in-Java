package g1101_1200.s1124_longest_well_performing_interval;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestWPI() {
        assertThat(new Solution().longestWPI(new int[] {9, 9, 6, 0, 6, 6, 9}), equalTo(3));
    }

    @Test
    void longestWPI2() {
        assertThat(new Solution().longestWPI(new int[] {6, 6, 6}), equalTo(0));
    }
}
