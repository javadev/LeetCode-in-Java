package g1801_1900.s1824_minimum_sideway_jumps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSideJumps() {
        assertThat(new Solution().minSideJumps(new int[] {0, 1, 2, 3, 0}), equalTo(2));
    }

    @Test
    void minSideJumps2() {
        assertThat(new Solution().minSideJumps(new int[] {0, 1, 1, 3, 3, 0}), equalTo(0));
    }

    @Test
    void minSideJumps3() {
        assertThat(new Solution().minSideJumps(new int[] {0, 2, 1, 0, 3, 0}), equalTo(2));
    }
}
