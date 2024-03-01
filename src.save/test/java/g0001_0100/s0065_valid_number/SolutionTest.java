package g0001_0100.s0065_valid_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isNumber() {
        assertThat(new Solution().isNumber("0"), equalTo(true));
    }

    @Test
    void isNumber2() {
        assertThat(new Solution().isNumber("e"), equalTo(false));
    }

    @Test
    void isNumber3() {
        assertThat(new Solution().isNumber("."), equalTo(false));
    }

    @Test
    void isNumber4() {
        assertThat(new Solution().isNumber(".1"), equalTo(true));
    }

    @Test
    void isNumber5() {
        assertThat(new Solution().isNumber("+.1"), equalTo(true));
    }

    @Test
    void isNumber6() {
        assertThat(new Solution().isNumber("-.1"), equalTo(true));
    }

    @Test
    void isNumber7() {
        assertThat(new Solution().isNumber("++.1"), equalTo(false));
    }

    @Test
    void isNumber8() {
        assertThat(new Solution().isNumber("1e1"), equalTo(true));
    }

    @Test
    void isNumber9() {
        assertThat(new Solution().isNumber("1E1"), equalTo(true));
    }

    @Test
    void isNumber10() {
        assertThat(new Solution().isNumber("1.1E1"), equalTo(true));
    }
}
