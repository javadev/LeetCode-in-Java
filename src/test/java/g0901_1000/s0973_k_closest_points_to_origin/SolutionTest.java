package g0901_1000.s0973_k_closest_points_to_origin;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kClosest() {
        assertThat(
                new Solution().kClosest(new int[][] {{1, 3}, {-2, 2}}, 1),
                equalTo(new int[][] {{-2, 2}}));
    }

    @Test
    void kClosest2() {
        assertThat(
                new Solution().kClosest(new int[][] {{3, 3}, {5, -1}, {-2, 4}}, 2),
                equalTo(new int[][] {{3, 3}, {-2, 4}}));
    }
}
