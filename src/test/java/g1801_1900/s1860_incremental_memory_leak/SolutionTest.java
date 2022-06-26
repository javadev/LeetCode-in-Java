package g1801_1900.s1860_incremental_memory_leak;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void memLeak() {
        assertThat(new Solution().memLeak(2, 2), equalTo(new int[] {3, 1, 0}));
    }

    @Test
    void memLeak2() {
        assertThat(new Solution().memLeak(8, 11), equalTo(new int[] {6, 0, 4}));
    }
}
