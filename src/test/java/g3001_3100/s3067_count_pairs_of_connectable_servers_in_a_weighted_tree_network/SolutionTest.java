package g3001_3100.s3067_count_pairs_of_connectable_servers_in_a_weighted_tree_network;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairsOfConnectableServers() {
        assertThat(
                new Solution()
                        .countPairsOfConnectableServers(
                                new int[][] {
                                    {0, 1, 1}, {1, 2, 5}, {2, 3, 13}, {3, 4, 9}, {4, 5, 2}
                                },
                                1),
                equalTo(new int[] {0, 4, 6, 6, 4, 0}));
    }

    @Test
    void countPairsOfConnectableServers2() {
        assertThat(
                new Solution()
                        .countPairsOfConnectableServers(
                                new int[][] {
                                    {0, 6, 3}, {6, 5, 3}, {0, 3, 1}, {3, 2, 7}, {3, 1, 6}, {3, 4, 2}
                                },
                                3),
                equalTo(new int[] {2, 0, 0, 0, 0, 0, 2}));
    }
}
