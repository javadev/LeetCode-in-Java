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
}
