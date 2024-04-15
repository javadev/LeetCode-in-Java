package g1701_1800.s1796_second_largest_digit_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void secondHighest() {
        assertThat(new Solution().secondHighest("dfa12321afd"), equalTo(2));
    }

    @Test
    void secondHighest2() {
        assertThat(new Solution().secondHighest("abc1111"), equalTo(-1));
    }
}
