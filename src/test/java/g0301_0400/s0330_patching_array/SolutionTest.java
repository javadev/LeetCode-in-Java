package g0301_0400.s0330_patching_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPatches() {
        assertThat(new Solution().minPatches(new int[] {1, 3}, 6), equalTo(1));
    }
}
