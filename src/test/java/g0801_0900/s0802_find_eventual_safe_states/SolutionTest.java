package g0801_0900.s0802_find_eventual_safe_states;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void eventualSafeNodes() {
        assertThat(
                new Solution()
                        .eventualSafeNodes(new int[][] {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}}),
                equalTo(Arrays.asList(2, 4, 5, 6)));
    }

    @Test
    void eventualSafeNodes2() {
        assertThat(
                new Solution()
                        .eventualSafeNodes(new int[][] {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}}),
                equalTo(Arrays.asList(4)));
    }
}
