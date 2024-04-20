package g0301_0400.s0393_utf_8_validation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validUtf8() {
        assertThat(new Solution().validUtf8(new int[] {197, 130, 1}), equalTo(true));
    }

    @Test
    void validUtf82() {
        assertThat(new Solution().validUtf8(new int[] {235, 140, 4}), equalTo(false));
    }
}
