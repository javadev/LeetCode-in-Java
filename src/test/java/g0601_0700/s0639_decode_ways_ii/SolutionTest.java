package g0601_0700.s0639_decode_ways_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numDecodings() {
        assertThat(new Solution().numDecodings("*"), equalTo(9));
    }

    @Test
    void numDecodings2() {
        assertThat(new Solution().numDecodings("1*"), equalTo(18));
    }

    @Test
    void numDecodings3() {
        assertThat(new Solution().numDecodings("2*"), equalTo(15));
    }

    @Test
    void numDecodings4() {
        assertThat(new Solution().numDecodings("134*92*0*9*"), equalTo(3600));
    }
}
