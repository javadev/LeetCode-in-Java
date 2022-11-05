package g0401_0500.s0420_strong_password_checker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void strongPasswordChecker() {
        assertThat(new Solution().strongPasswordChecker("a"), equalTo(5));
    }

    @Test
    void strongPasswordChecker2() {
        assertThat(new Solution().strongPasswordChecker("aA1"), equalTo(3));
    }

    @Test
    void strongPasswordChecker3() {
        assertThat(new Solution().strongPasswordChecker("1337C0d3"), equalTo(0));
    }

    @Test
    void strongPasswordChecker4() {
        assertThat(new Solution().strongPasswordChecker("aaa"), equalTo(3));
    }

    @Test
    void strongPasswordChecker5() {
        assertThat(new Solution().strongPasswordChecker("aaa1"), equalTo(2));
    }
}
