package g0601_0700.s0696_count_binary_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBinarySubstrings() {
        assertThat(new Solution().countBinarySubstrings("00110011"), equalTo(6));
    }

    @Test
    void countBinarySubstrings2() {
        assertThat(new Solution().countBinarySubstrings("10101"), equalTo(4));
    }
}
