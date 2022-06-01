package g1201_1300.s1284_minimum_number_of_flips_to_convert_binary_matrix_to_zero_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlips() {
        assertThat(new Solution().minFlips(new int[][] {{0, 0}, {0, 1}}), equalTo(3));
    }

    @Test
    void minFlips2() {
        assertThat(new Solution().minFlips(new int[][] {{0}}), equalTo(0));
    }

    @Test
    void minFlips3() {
        assertThat(new Solution().minFlips(new int[][] {{1, 0, 0}, {1, 0, 0}}), equalTo(-1));
    }
}
