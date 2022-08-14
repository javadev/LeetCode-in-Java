package g2301_2400.s2360_longest_cycle_in_a_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestCycle() {
        assertThat(new Solution().longestCycle(new int[] {3, 3, 4, 2, 3}), equalTo(3));
    }

    @Test
    void longestCycle2() {
        assertThat(new Solution().longestCycle(new int[] {2, -1, 3, 1}), equalTo(-1));
    }
}
