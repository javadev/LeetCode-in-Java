package g3901_4000.s3924_minimum_threshold_path_with_limited_heavy_edges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumThreshold() {
        assertThat(
                new Solution()
                        .minimumThreshold(
                                6,
                                new int[][] {{0, 1, 5}, {1, 2, 3}, {3, 4, 4}, {4, 5, 1}, {1, 4, 2}},
                                0,
                                3,
                                1),
                equalTo(4));
    }

    @Test
    void minimumThreshold2() {
        assertThat(
                new Solution()
                        .minimumThreshold(
                                6,
                                new int[][] {{0, 1, 3}, {1, 2, 4}, {3, 4, 5}, {4, 5, 6}},
                                0,
                                4,
                                1),
                equalTo(-1));
    }

    @Test
    void minimumThreshold3() {
        assertThat(new Solution().minimumThreshold(1, new int[][] {}, 0, 0, 0), equalTo(0));
    }

    @Test
    void minimumThreshold4() {
        assertThat(new Solution().minimumThreshold(2, new int[][] {}, 0, 1, 0), equalTo(-1));
    }

    @Test
    void minimumThreshold5() {
        assertThat(
                new Solution()
                        .minimumThreshold(
                                3, new int[][] {{0, 1, 9}, {1, 2, 4}, {0, 2, 7}}, 0, 2, 0),
                equalTo(7));
    }

    @Test
    void minimumThreshold6() {
        assertThat(
                new Solution().minimumThreshold(3, new int[][] {{0, 1, 9}, {1, 2, 4}}, 2, 0, 1),
                equalTo(4));
    }

    @Test
    void minimumThreshold7() {
        assertThat(
                new Solution().minimumThreshold(3, new int[][] {{0, 1, 9}, {1, 2, 4}}, 0, 2, 2),
                equalTo(0));
    }

    @Test
    void minimumThreshold8() {
        assertThat(
                new Solution().minimumThreshold(2, new int[][] {{0, 1, 1000000000}}, 0, 1, 0),
                equalTo(1000000000));
    }
}
