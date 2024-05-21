package g3101_3200.s3153_sum_of_digit_differences_of_all_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumDigitDifferences() {
        assertThat(new Solution().sumDigitDifferences(new int[] {13, 23, 12}), equalTo(4L));
    }

    @Test
    void sumDigitDifferences2() {
        assertThat(new Solution().sumDigitDifferences(new int[] {10, 10, 10, 10}), equalTo(0L));
    }
}
