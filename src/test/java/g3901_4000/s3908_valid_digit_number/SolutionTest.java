package g3901_4000.s3908_valid_digit_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validDigit() {
        assertThat(new Solution().validDigit(101, 0), equalTo(true));
    }

    @Test
    void validDigit2() {
        assertThat(new Solution().validDigit(232, 2), equalTo(false));
    }

    @Test
    void validDigit3() {
        assertThat(new Solution().validDigit(5, 1), equalTo(false));
    }

    @Test
    void validDigit4() {
        assertThat(new Solution().validDigit(0, 0), equalTo(false));
    }

    @Test
    void validDigit5() {
        assertThat(new Solution().validDigit(0, 1), equalTo(false));
    }

    @Test
    void validDigit6() {
        assertThat(new Solution().validDigit(5, 5), equalTo(false));
    }

    @Test
    void validDigit7() {
        assertThat(new Solution().validDigit(123, 3), equalTo(true));
    }

    @Test
    void validDigit8() {
        assertThat(new Solution().validDigit(100000, 0), equalTo(true));
    }
}
