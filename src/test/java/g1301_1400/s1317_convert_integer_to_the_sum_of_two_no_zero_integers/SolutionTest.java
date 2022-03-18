package g1301_1400.s1317_convert_integer_to_the_sum_of_two_no_zero_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getNoZeroIntegers() {
        assertThat(new Solution().getNoZeroIntegers(2), equalTo(new int[] {1, 1}));
    }

    @Test
    void getNoZeroIntegers2() {
        assertThat(new Solution().getNoZeroIntegers(11), equalTo(new int[] {2, 9}));
    }
}
