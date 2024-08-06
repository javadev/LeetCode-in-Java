package g3201_3300.s3239_minimum_number_of_flips_to_make_binary_grid_palindromic_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlips() {
        assertThat(
                new Solution().minFlips(new int[][] {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}}), equalTo(2));
    }

    @Test
    void minFlips2() {
        assertThat(new Solution().minFlips(new int[][] {{0, 1}, {0, 1}, {0, 0}}), equalTo(1));
    }

    @Test
    void minFlips3() {
        assertThat(new Solution().minFlips(new int[][] {{1}, {0}}), equalTo(0));
    }
}
