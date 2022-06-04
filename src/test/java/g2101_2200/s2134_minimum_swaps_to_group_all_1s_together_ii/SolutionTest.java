package g2101_2200.s2134_minimum_swaps_to_group_all_1s_together_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwaps() {
        assertThat(new Solution().minSwaps(new int[] {0, 1, 0, 1, 1, 0, 0}), equalTo(1));
    }

    @Test
    void minSwaps2() {
        assertThat(new Solution().minSwaps(new int[] {0, 1, 1, 1, 0, 0, 1, 1, 0}), equalTo(2));
    }

    @Test
    void minSwaps3() {
        assertThat(new Solution().minSwaps(new int[] {1, 1, 0, 0, 1}), equalTo(0));
    }
}
