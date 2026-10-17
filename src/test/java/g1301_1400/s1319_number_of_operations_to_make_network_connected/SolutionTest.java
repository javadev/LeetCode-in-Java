package g1301_1400.s1319_number_of_operations_to_make_network_connected;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeConnected() {
        assertThat(
                new Solution().makeConnected(4, new int[][] {{0, 1}, {0, 2}, {1, 2}}), equalTo(1));
    }

    @Test
    void makeConnected2() {
        assertThat(
                new Solution()
                        .makeConnected(6, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}}),
                equalTo(2));
    }

    @Test
    void makeConnected3() {
        assertThat(
                new Solution().makeConnected(6, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}}),
                equalTo(-1));
    }

    @Test
    void makeConnected4() {
        // Single node, no connections
        assertThat(new Solution().makeConnected(1, new int[][] {}), equalTo(0));
    }

    @Test
    void makeConnected5() {
        // Two nodes, no connections
        assertThat(new Solution().makeConnected(2, new int[][] {}), equalTo(-1));
    }

    @Test
    void makeConnected6() {
        // Two nodes connected
        assertThat(new Solution().makeConnected(2, new int[][] {{0, 1}}), equalTo(0));
    }

    @Test
    void makeConnected7() {
        // Too few cables
        assertThat(new Solution().makeConnected(5, new int[][] {{0, 1}, {2, 3}}), equalTo(-1));
    }

    @Test
    void makeConnected8() {
        // Already connected chain
        assertThat(
                new Solution().makeConnected(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}}),
                equalTo(0));
    }

    @Test
    void makeConnected9() {
        // Already connected star
        assertThat(
                new Solution().makeConnected(5, new int[][] {{0, 1}, {0, 2}, {0, 3}, {0, 4}}),
                equalTo(0));
    }

    @Test
    void makeConnected10() {
        // Already connected complete graph
        assertThat(
                new Solution()
                        .makeConnected(
                                4, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3}}),
                equalTo(0));
    }

    @Test
    void makeConnected11() {
        // Connected with edges in non-sequential order
        assertThat(
                new Solution().makeConnected(5, new int[][] {{0, 1}, {0, 2}, {3, 4}, {2, 3}}),
                equalTo(0));
    }

    @Test
    void makeConnected12() {
        // Reversed edge direction
        assertThat(
                new Solution().makeConnected(4, new int[][] {{1, 0}, {2, 1}, {3, 2}}), equalTo(0));
    }

    @Test
    void makeConnected13() {
        // {0,1,2} has a cycle (1 spare cable), {3,4} is separate -> 1 move needed
        assertThat(
                new Solution().makeConnected(5, new int[][] {{0, 1}, {0, 2}, {1, 2}, {3, 4}}),
                equalTo(1));
    }

    @Test
    void makeConnected14() {
        // Only {0,1} is connected; 4 duplicate cables can connect 4 isolated nodes
        assertThat(
                new Solution()
                        .makeConnected(6, new int[][] {{0, 1}, {0, 1}, {0, 1}, {0, 1}, {0, 1}}),
                equalTo(4));
    }
}
