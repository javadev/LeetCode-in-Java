package g1601_1700.s1627_graph_connectivity_with_threshold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areConnected() {
        assertThat(
                new Solution().areConnected(6, 2, new int[][] {{1, 4}, {2, 5}, {3, 6}}),
                equalTo(Arrays.asList(false, false, true)));
    }

    @Test
    void areConnected2() {
        assertThat(
                new Solution()
                        .areConnected(6, 0, new int[][] {{4, 5}, {3, 4}, {3, 2}, {2, 6}, {1, 3}}),
                equalTo(Arrays.asList(true, true, true, true, true)));
    }

    @Test
    void areConnected3() {
        assertThat(
                new Solution()
                        .areConnected(5, 1, new int[][] {{4, 5}, {4, 5}, {3, 2}, {2, 3}, {3, 4}}),
                equalTo(Arrays.asList(false, false, false, false, false)));
    }
}
