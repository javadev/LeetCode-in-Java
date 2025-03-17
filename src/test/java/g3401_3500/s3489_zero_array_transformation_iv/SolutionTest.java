package g3401_3500.s3489_zero_array_transformation_iv;

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

    @Test
    void minZeroArray3() {
        assertThat(
                new Solution()
                        .minZeroArray(
                                new int[] {1, 2, 3, 2, 1},
                                new int[][] {
                                    {0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 4, 1}
                                }),
                equalTo(4));
    }

    @Test
    void minZeroArray4() {
        assertThat(
                new Solution()
                        .minZeroArray(
                                new int[] {1, 2, 3, 2, 6},
                                new int[][] {
                                    {0, 1, 1}, {0, 2, 1}, {1, 4, 2}, {4, 4, 4}, {3, 4, 1}, {4, 4, 5}
                                }),
                equalTo(4));
    }
}
