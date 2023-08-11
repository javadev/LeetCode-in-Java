package g0701_0800.s0796_rotate_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rotateString() {
        assertThat(new Solution().rotateString("abcde", "cdeab"), equalTo(true));
    }

    @Test
    void rotateString2() {
        assertThat(new Solution().rotateString("abcde", "abced"), equalTo(false));
    }
}
