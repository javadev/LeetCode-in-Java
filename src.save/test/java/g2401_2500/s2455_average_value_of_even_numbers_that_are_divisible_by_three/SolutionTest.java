package g2401_2500.s2455_average_value_of_even_numbers_that_are_divisible_by_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void averageValue() {
        assertThat(new Solution().averageValue(new int[] {1, 3, 6, 10, 12, 15}), equalTo(9));
    }

    @Test
    void averageValue2() {
        assertThat(new Solution().averageValue(new int[] {1, 2, 4, 7, 10}), equalTo(0));
    }
}
