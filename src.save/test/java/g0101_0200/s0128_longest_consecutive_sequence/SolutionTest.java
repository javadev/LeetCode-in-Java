package g0101_0200.s0128_longest_consecutive_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestConsecutive() {
        assertThat(new Solution().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}), equalTo(4));
    }
}
