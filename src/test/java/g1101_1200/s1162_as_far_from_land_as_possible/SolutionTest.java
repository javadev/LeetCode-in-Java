package g1101_1200.s1162_as_far_from_land_as_possible;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(
                new Solution().maxDistance(new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}),
                equalTo(2));
    }

    @Test
    void maxDistance2() {
        assertThat(
                new Solution().maxDistance(new int[][] {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}}),
                equalTo(4));
    }
}
