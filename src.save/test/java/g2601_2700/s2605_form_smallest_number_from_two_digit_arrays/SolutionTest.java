package g2601_2700.s2605_form_smallest_number_from_two_digit_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNumber() {
        assertThat(new Solution().minNumber(new int[] {4, 1, 3}, new int[] {5, 7}), equalTo(15));
    }

    @Test
    void minNumber2() {
        assertThat(
                new Solution().minNumber(new int[] {3, 5, 2, 6}, new int[] {3, 1, 7}), equalTo(3));
    }
}
