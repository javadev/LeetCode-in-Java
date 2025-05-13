package g3501_3600.s3543_maximum_weighted_k_edge_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxWeight() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 1}, {1, 2, 2}}, 2, 4), equalTo(3));
    }

    @Test
    void maxWeight2() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 2}, {0, 2, 3}}, 1, 3), equalTo(2));
    }

    @Test
    void maxWeight3() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 6}, {1, 2, 8}}, 1, 6), equalTo(-1));
    }

    @Test
    void maxWeight4() {
        assertThat(
                new Solution().maxWeight(3, new int[][] {{0, 1, 6}, {1, 2, 8}}, 0, 6), equalTo(0));
    }

    @Test
    void maxWeight5() {
        assertThat(
                new Solution()
                        .maxWeight(
                                6,
                                new int[][] {
                                    {0, 1, 10},
                                    {0, 2, 1},
                                    {1, 3, 2},
                                    {2, 3, 5},
                                    {3, 4, 5},
                                    {3, 5, 3}
                                },
                                3,
                                12),
                equalTo(11));
    }

    @Test
    void maxWeight6() {
        assertThat(
                new Solution()
                        .maxWeight(
                                5,
                                new int[][] {{0, 1, 2}, {0, 2, 3}, {1, 3, 3}, {2, 3, 1}, {3, 4, 2}},
                                3,
                                7),
                equalTo(6));
    }
}
