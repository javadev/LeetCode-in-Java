package g0001_0100.s0091_decode_ways;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numDecodings() {
        assertThat(new Solution().numDecodings("12"), equalTo(2));
    }

    @Test
    void numDecodings2() {
        assertThat(new Solution().numDecodings("226"), equalTo(3));
    }

    @Test
    void numDecodings3() {
        assertThat(new Solution().numDecodings("06"), equalTo(0));
    }
}
