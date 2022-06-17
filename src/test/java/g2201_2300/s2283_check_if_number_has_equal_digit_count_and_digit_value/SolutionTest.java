package g2201_2300.s2283_check_if_number_has_equal_digit_count_and_digit_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void digitCount() {
        assertThat(new Solution().digitCount("1210"), equalTo(true));
    }

    @Test
    void digitCount2() {
        assertThat(new Solution().digitCount("030"), equalTo(false));
    }
}
