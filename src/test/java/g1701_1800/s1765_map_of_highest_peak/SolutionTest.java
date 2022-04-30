package g1701_1800.s1765_map_of_highest_peak;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void highestPeak() {
        assertThat(
                new Solution().highestPeak(new int[][] {{0, 1}, {0, 0}}),
                equalTo(new int[][] {{1, 0}, {2, 1}}));
    }

    @Test
    void highestPeak2() {
        assertThat(
                new Solution().highestPeak(new int[][] {{0, 0, 1}, {1, 0, 0}, {0, 0, 0}}),
                equalTo(new int[][] {{1, 1, 0}, {0, 1, 1}, {1, 2, 2}}));
    }
}
