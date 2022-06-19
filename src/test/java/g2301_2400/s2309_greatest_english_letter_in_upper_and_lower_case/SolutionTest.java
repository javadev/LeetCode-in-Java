package g2301_2400.s2309_greatest_english_letter_in_upper_and_lower_case;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void greatestLetter() {
        assertThat(new Solution().greatestLetter("lEeTcOdE"), equalTo("E"));
    }

    @Test
    void greatestLetter2() {
        assertThat(new Solution().greatestLetter("arRAzFif"), equalTo("R"));
    }

    @Test
    void greatestLetter3() {
        assertThat(new Solution().greatestLetter("AbCdEfGhIjK"), equalTo(""));
    }
}
