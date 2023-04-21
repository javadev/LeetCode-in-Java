package g2501_2600.s2535_difference_between_element_sum_and_digit_sum_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void differenceOfSum() {
        assertThat(new Solution().differenceOfSum(new int[] {1, 15, 6, 3}), equalTo(9));
    }

    @Test
    void differenceOfSum2() {
        assertThat(new Solution().differenceOfSum(new int[] {1, 2, 3, 4}), equalTo(0));
    }
}
