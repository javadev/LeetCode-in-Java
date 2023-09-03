package g2401_2500.s2435_paths_in_matrix_whose_sum_is_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPaths() {
        assertThat(
                new Solution().numberOfPaths(new int[][] {{5, 2, 4}, {3, 0, 5}, {0, 7, 2}}, 3),
                equalTo(2));
    }

    @Test
    void numberOfPairs2() {
        assertThat(new Solution().numberOfPaths(new int[][] {{0, 0}}, 5), equalTo(1));
    }

    @Test
    void numberOfPairs3() {
        assertThat(
                new Solution()
                        .numberOfPaths(new int[][] {{7, 3, 4, 9}, {2, 3, 6, 2}, {2, 3, 7, 0}}, 1),
                equalTo(10));
    }
}
