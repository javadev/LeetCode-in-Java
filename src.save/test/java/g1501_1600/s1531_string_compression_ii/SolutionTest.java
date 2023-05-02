package g1501_1600.s1531_string_compression_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getLengthOfOptimalCompression() {
        assertThat(new Solution().getLengthOfOptimalCompression("aaabcccd", 2), equalTo(4));
    }

    @Test
    void getLengthOfOptimalCompression2() {
        assertThat(new Solution().getLengthOfOptimalCompression("aabbaa", 2), equalTo(2));
    }

    @Test
    void getLengthOfOptimalCompression3() {
        assertThat(new Solution().getLengthOfOptimalCompression("aaaaaaaaaaa", 0), equalTo(3));
    }
}
