package g3901_4000.s3982_sum_of_integers_with_maximum_digit_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDigitRange() {
        assertThat(new Solution().maxDigitRange(new int[] {5724, 111, 350}), equalTo(6074));
    }

    @Test
    void maxDigitRange2() {
        assertThat(new Solution().maxDigitRange(new int[] {90, 900}), equalTo(990));
    }

    @Test
    void maxDigitRange3() {
        assertThat(new Solution().maxDigitRange(new int[] {11, 22, 33}), equalTo(66));
    }
}
