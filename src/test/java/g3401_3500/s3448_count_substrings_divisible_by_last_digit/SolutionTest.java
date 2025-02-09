package g3401_3500.s3448_count_substrings_divisible_by_last_digit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubstrings() {
        assertThat(new Solution().countSubstrings("12936"), equalTo(11L));
    }

    @Test
    void countSubstrings2() {
        assertThat(new Solution().countSubstrings("5701283"), equalTo(18L));
    }

    @Test
    void countSubstrings3() {
        assertThat(new Solution().countSubstrings("1010101010"), equalTo(25L));
    }

    @Test
    void countSubstrings4() {
        assertThat(new Solution().countSubstrings("4"), equalTo(1L));
    }

    @Test
    void countSubstrings5() {
        assertThat(new Solution().countSubstrings("28"), equalTo(2L));
    }
}
