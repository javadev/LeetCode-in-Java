package g3701_3800.s3756_concatenate_non_zero_digits_and_multiply_by_sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumAndMultiply() {
        assertThat(
                new Solution().sumAndMultiply("10203004", new int[][] {{0, 7}, {1, 3}, {4, 6}}),
                equalTo(new int[] {12340, 4, 9}));
    }

    @Test
    void sumAndMultiply2() {
        assertThat(
                new Solution().sumAndMultiply("1000", new int[][] {{0, 3}, {1, 1}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void sumAndMultiply3() {
        assertThat(
                new Solution().sumAndMultiply("9876543210", new int[][] {{0, 9}}),
                equalTo(new int[] {444444137}));
    }
}
