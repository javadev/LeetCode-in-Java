package g1601_1700.s1620_coordinate_with_maximum_network_quality;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bestCoordinate() {
        assertThat(
                new Solution().bestCoordinate(new int[][] {{1, 2, 5}, {2, 1, 7}, {3, 1, 9}}, 2),
                equalTo(new int[] {2, 1}));
    }

    @Test
    void bestCoordinate2() {
        assertThat(
                new Solution().bestCoordinate(new int[][] {{23, 11, 21}}, 9),
                equalTo(new int[] {23, 11}));
    }

    @Test
    void bestCoordinate3() {
        assertThat(
                new Solution().bestCoordinate(new int[][] {{1, 2, 13}, {2, 1, 7}, {0, 1, 9}}, 2),
                equalTo(new int[] {1, 2}));
    }
}
