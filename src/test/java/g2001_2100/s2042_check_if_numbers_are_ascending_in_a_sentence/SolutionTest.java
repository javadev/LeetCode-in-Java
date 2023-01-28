package g2001_2100.s2042_check_if_numbers_are_ascending_in_a_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areNumbersAscending() {
        assertThat(
                new Solution()
                        .areNumbersAscending(
                                "1 box has 3 blue 4 red 6 green and 12 yellow marbles"),
                equalTo(true));
    }

    @Test
    void areNumbersAscending2() {
        assertThat(new Solution().areNumbersAscending("hello world 5 x 5"), equalTo(false));
    }

    @Test
    void areNumbersAscending3() {
        assertThat(
                new Solution()
                        .areNumbersAscending(
                                "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"),
                equalTo(false));
    }
}
