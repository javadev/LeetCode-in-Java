package g1601_1700.s1615_maximal_network_rank;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximalNetworkRank() {
        assertThat(
                new Solution().maximalNetworkRank(4, new int[][] {{2, 1}, {0, 3}, {1, 2}, {1, 3}}),
                equalTo(4));
    }

    @Test
    void maximalNetworkRank2() {
        assertThat(
                new Solution()
                        .maximalNetworkRank(
                                8, new int[][] {{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}}),
                equalTo(5));
    }

    @Test
    void maximalNetworkRank3() {
        assertThat(
                new Solution()
                        .maximalNetworkRank(
                                5, new int[][] {{0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2, 4}}),
                equalTo(5));
    }
}
