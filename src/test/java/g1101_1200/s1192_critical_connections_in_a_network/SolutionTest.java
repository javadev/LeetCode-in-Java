package g1101_1200.s1192_critical_connections_in_a_network;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void criticalConnections() {
        assertThat(
                new Solution()
                        .criticalConnections(
                                4,
                                ArrayUtils.getLists(new int[][] {{0, 1}, {1, 2}, {2, 0}, {1, 3}})),
                equalTo(ArrayUtils.getLists(new int[][] {{3, 1}})));
    }

    @Test
    void criticalConnections2() {
        assertThat(
                new Solution().criticalConnections(2, ArrayUtils.getLists(new int[][] {{0, 1}})),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 0}})));
    }
}
