package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lenOfVDiagonal() {
        assertThat(
                new Solution()
                        .lenOfVDiagonal(
                                new int[][] {
                                    {2, 2, 1, 2, 2},
                                    {2, 0, 2, 2, 0},
                                    {2, 0, 1, 1, 0},
                                    {1, 0, 2, 2, 2},
                                    {2, 0, 0, 2, 2}
                                }),
                equalTo(5));
    }

    @Test
    void lenOfVDiagonal2() {
        assertThat(
                new Solution()
                        .lenOfVDiagonal(
                                new int[][] {
                                    {2, 2, 2, 2, 2},
                                    {2, 0, 2, 2, 0},
                                    {2, 0, 1, 1, 0},
                                    {1, 0, 2, 2, 2},
                                    {2, 0, 0, 2, 2}
                                }),
                equalTo(4));
    }

    @Test
    void lenOfVDiagonal3() {
        assertThat(
                new Solution()
                        .lenOfVDiagonal(
                                new int[][] {
                                    {1, 2, 2, 2, 2},
                                    {2, 2, 2, 2, 0},
                                    {2, 0, 0, 0, 0},
                                    {0, 0, 2, 2, 2},
                                    {2, 0, 0, 2, 0}
                                }),
                equalTo(5));
    }
}
