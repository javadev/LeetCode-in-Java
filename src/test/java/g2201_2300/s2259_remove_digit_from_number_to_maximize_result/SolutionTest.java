package g2201_2300.s2259_remove_digit_from_number_to_maximize_result;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeDigit() {
        assertThat(new Solution().removeDigit("123", '3'), equalTo("12"));
    }

    @Test
    void removeDigit2() {
        assertThat(new Solution().removeDigit("1231", '1'), equalTo("231"));
    }

    @Test
    void removeDigit3() {
        assertThat(new Solution().removeDigit("551", '5'), equalTo("51"));
    }
}
