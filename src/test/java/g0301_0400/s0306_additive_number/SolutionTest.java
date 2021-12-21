package g0301_0400.s0306_additive_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isAdditiveNumber() {
        assertThat(new Solution().isAdditiveNumber("0235813"), equalTo(false));
    }

    @Test
    void isAdditiveNumber2() {
        assertThat(new Solution().isAdditiveNumber("000"), equalTo(true));
    }

    @Test
    void isAdditiveNumber3() {
        assertThat(new Solution().isAdditiveNumber("011235"), equalTo(true));
    }
}
