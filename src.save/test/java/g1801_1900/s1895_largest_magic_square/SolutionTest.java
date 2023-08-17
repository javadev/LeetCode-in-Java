package g1801_1900.s1895_largest_magic_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestMagicSquare() {
        assertThat(
                new Solution()
                        .largestMagicSquare(
                                new int[][] {
                                    {7, 1, 4, 5, 6},
                                    {2, 5, 1, 6, 4},
                                    {1, 5, 4, 3, 2},
                                    {1, 2, 7, 3, 4}
                                }),
                equalTo(3));
    }

    @Test
    void largestMagicSquare2() {
        assertThat(
                new Solution()
                        .largestMagicSquare(new int[][] {{5, 1, 3, 1}, {9, 3, 3, 1}, {1, 3, 3, 8}}),
                equalTo(2));
    }
}
