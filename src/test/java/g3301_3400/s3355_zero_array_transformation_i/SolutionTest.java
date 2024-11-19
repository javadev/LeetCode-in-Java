package g3301_3400.s3355_zero_array_transformation_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isZeroArray() {
        assertThat(
                new Solution().isZeroArray(new int[] {1, 0, 1}, new int[][] {{0, 2}}),
                equalTo(true));
    }

    @Test
    void isZeroArray2() {
        assertThat(
                new Solution().isZeroArray(new int[] {4, 3, 2, 1}, new int[][] {{1, 3}, {0, 2}}),
                equalTo(false));
    }

    @Test
    void isZeroArray3() {
        assertThat(
                new Solution().isZeroArray(new int[] {-1, 0, 1}, new int[][] {{1, 3}, {0, 2}}),
                equalTo(true));
    }
}
