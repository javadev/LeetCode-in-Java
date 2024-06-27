package g3101_3200.s3193_count_the_number_of_inversions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPermutations() {
        assertThat(
                new Solution().numberOfPermutations(3, new int[][] {{2, 2}, {0, 0}}), equalTo(2));
    }

    @Test
    void numberOfPermutations2() {
        assertThat(
                new Solution().numberOfPermutations(3, new int[][] {{2, 2}, {1, 1}, {0, 0}}),
                equalTo(1));
    }

    @Test
    void numberOfPermutations3() {
        assertThat(
                new Solution().numberOfPermutations(2, new int[][] {{0, 0}, {1, 0}}), equalTo(1));
    }
}
