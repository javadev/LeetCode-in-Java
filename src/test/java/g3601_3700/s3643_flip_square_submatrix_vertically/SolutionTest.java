package g3601_3700.s3643_flip_square_submatrix_vertically;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseSubmatrix() {
        assertThat(
                new Solution()
                        .reverseSubmatrix(
                                new int[][] {
                                    {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
                                },
                                1,
                                0,
                                3),
                equalTo(
                        new int[][] {
                            {1, 2, 3, 4}, {13, 14, 15, 8}, {9, 10, 11, 12}, {5, 6, 7, 16}
                        }));
    }

    @Test
    void reverseSubmatrix2() {
        assertThat(
                new Solution().reverseSubmatrix(new int[][] {{3, 4, 2, 3}, {2, 3, 4, 2}}, 0, 2, 2),
                equalTo(new int[][] {{3, 4, 4, 2}, {2, 3, 2, 3}}));
    }
}
