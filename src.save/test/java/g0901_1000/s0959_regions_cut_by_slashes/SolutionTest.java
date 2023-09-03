package g0901_1000.s0959_regions_cut_by_slashes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void regionsBySlashes() {
        assertThat(new Solution().regionsBySlashes(new String[] {" /", "/ "}), equalTo(2));
    }

    @Test
    void regionsBySlashes2() {
        assertThat(new Solution().regionsBySlashes(new String[] {" /", "  "}), equalTo(1));
    }

    @Test
    void regionsBySlashes3() {
        assertThat(new Solution().regionsBySlashes(new String[] {"/\\", "\\/"}), equalTo(5));
    }
}
