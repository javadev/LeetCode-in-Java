package g0001_0100.s0087_scramble_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isScramble() {
        assertThat(new Solution().isScramble("great", "rgeat"), equalTo(true));
    }

    @Test
    void isScramble2() {
        assertThat(new Solution().isScramble("abcde", "caebd"), equalTo(false));
    }

    @Test
    void isScramble3() {
        assertThat(new Solution().isScramble("a", "a"), equalTo(true));
    }
}
