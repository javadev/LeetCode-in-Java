package g1201_1300.s1288_remove_covered_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeCoveredIntervals() {
        assertThat(
                new Solution().removeCoveredIntervals(new int[][] {{1, 4}, {3, 6}, {2, 8}}),
                equalTo(2));
    }

    @Test
    void removeCoveredIntervals2() {
        assertThat(new Solution().removeCoveredIntervals(new int[][] {{1, 4}, {2, 3}}), equalTo(1));
    }
}
