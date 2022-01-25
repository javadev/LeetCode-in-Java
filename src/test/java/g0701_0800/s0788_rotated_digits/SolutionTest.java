package g0701_0800.s0788_rotated_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rotatedDigits() {
        assertThat(new Solution().rotatedDigits(10), equalTo(4));
    }

    @Test
    void rotatedDigits2() {
        assertThat(new Solution().rotatedDigits(1), equalTo(0));
    }

    @Test
    void rotatedDigits3() {
        assertThat(new Solution().rotatedDigits(2), equalTo(1));
    }

    @Test
    void rotatedDigits4() {
        assertThat(new Solution().rotatedDigits(857), equalTo(247));
    }

    @Test
    void rotatedDigits5() {
        assertThat(new Solution().rotatedDigits(15), equalTo(6));
    }
}
