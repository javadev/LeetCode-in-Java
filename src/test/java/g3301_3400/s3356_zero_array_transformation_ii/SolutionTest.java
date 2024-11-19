package g3301_3400.s3356_zero_array_transformation_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minZeroArray() {
        assertThat(
                new Solution()
                        .minZeroArray(
                                new int[] {2, 0, 2}, new int[][] {{0, 2, 1}, {0, 2, 1}, {1, 1, 3}}),
                equalTo(2));
    }

    @Test
    void minZeroArray2() {
        assertThat(
                new Solution()
                        .minZeroArray(new int[] {4, 3, 2, 1}, new int[][] {{1, 3, 2}, {0, 2, 1}}),
                equalTo(-1));
    }
}
