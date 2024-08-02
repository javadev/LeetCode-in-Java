package g3201_3300.s3235_check_if_the_rectangle_corner_is_reachable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canReachCorner() {
        assertThat(new Solution().canReachCorner(3, 4, new int[][] {{2, 1, 1}}), equalTo(true));
    }

    @Test
    void canReachCorner2() {
        assertThat(new Solution().canReachCorner(3, 3, new int[][] {{1, 1, 2}}), equalTo(false));
    }

    @Test
    void canReachCorner3() {
        assertThat(
                new Solution().canReachCorner(3, 3, new int[][] {{2, 1, 1}, {1, 2, 1}}),
                equalTo(false));
    }

    @Test
    void canReachCorner4() {
        assertThat(new Solution().canReachCorner(4, 4, new int[][] {{5, 5, 1}}), equalTo(true));
    }
}
