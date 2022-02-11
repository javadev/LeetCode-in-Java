package g0901_1000.s0986_interval_list_intersections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void intervalIntersection() {
        assertThat(
                new Solution()
                        .intervalIntersection(
                                new int[][] {{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                                new int[][] {{1, 5}, {8, 12}, {15, 24}, {25, 26}}),
                equalTo(new int[][] {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}}));
    }

    @Test
    void intervalIntersection2() {
        assertThat(
                new Solution().intervalIntersection(new int[][] {{1, 3}, {5, 9}}, new int[][] {}),
                equalTo(new int[][] {}));
    }
}
