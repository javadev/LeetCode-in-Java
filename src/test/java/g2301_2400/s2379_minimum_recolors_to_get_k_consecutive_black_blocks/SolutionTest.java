package g2301_2400.s2379_minimum_recolors_to_get_k_consecutive_black_blocks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumRecolors() {
        assertThat(new Solution().minimumRecolors("WBBWWBBWBW", 7), equalTo(3));
    }

    @Test
    void minimumRecolors2() {
        assertThat(new Solution().minimumRecolors("WBWBBBW", 2), equalTo(0));
    }
}
