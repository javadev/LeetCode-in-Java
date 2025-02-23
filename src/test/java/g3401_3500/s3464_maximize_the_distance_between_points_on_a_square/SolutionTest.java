package g3401_3500.s3464_maximize_the_distance_between_points_on_a_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(
                new Solution().maxDistance(2, new int[][] {{0, 2}, {2, 0}, {2, 2}, {0, 0}}, 4),
                equalTo(2));
    }

    @Test
    void maxDistance2() {
        assertThat(
                new Solution()
                        .maxDistance(2, new int[][] {{0, 0}, {1, 2}, {2, 0}, {2, 2}, {2, 1}}, 4),
                equalTo(1));
    }

    @Test
    void maxDistance3() {
        assertThat(
                new Solution()
                        .maxDistance(
                                2,
                                new int[][] {
                                    {0, 0}, {0, 1}, {0, 2}, {1, 2}, {2, 0}, {2, 2}, {2, 1}
                                },
                                5),
                equalTo(1));
    }
}
