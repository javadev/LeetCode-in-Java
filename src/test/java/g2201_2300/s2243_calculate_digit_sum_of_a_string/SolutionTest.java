package g2201_2300.s2243_calculate_digit_sum_of_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void digitSum() {
        assertThat(new Solution().digitSum("11111222223", 3), equalTo("135"));
    }

    @Test
    void digitSum2() {
        assertThat(new Solution().digitSum("00000000", 3), equalTo("000"));
    }
}
