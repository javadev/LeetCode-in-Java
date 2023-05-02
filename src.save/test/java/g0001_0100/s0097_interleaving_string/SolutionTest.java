package g0001_0100.s0097_interleaving_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isInterleave() {
        assertThat(new Solution().isInterleave("aabcc", "dbbca", "aadbbcbcac"), equalTo(true));
    }

    @Test
    void isInterleave2() {
        assertThat(new Solution().isInterleave("aabcc", "dbbca", "aadbbbaccc"), equalTo(false));
    }

    @Test
    void isInterleave3() {
        assertThat(new Solution().isInterleave("", "", ""), equalTo(true));
    }
}
