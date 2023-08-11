package g0901_1000.s0977_squares_of_a_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortedSquares() {
        assertThat(
                new Solution().sortedSquares(new int[] {-4, -1, 0, 3, 10}),
                equalTo(new int[] {0, 1, 9, 16, 100}));
    }

    @Test
    void sortedSquares2() {
        assertThat(
                new Solution().sortedSquares(new int[] {-7, -3, 2, 3, 11}),
                equalTo(new int[] {4, 9, 9, 49, 121}));
    }
}
