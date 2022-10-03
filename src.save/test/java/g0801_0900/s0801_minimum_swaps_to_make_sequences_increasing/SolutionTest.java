package g0801_0900.s0801_minimum_swaps_to_make_sequences_increasing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwap() {
        assertThat(
                new Solution().minSwap(new int[] {1, 3, 5, 4}, new int[] {1, 2, 3, 7}), equalTo(1));
    }

    @Test
    void minSwap2() {
        assertThat(
                new Solution().minSwap(new int[] {0, 3, 5, 8, 9}, new int[] {2, 1, 4, 6, 9}),
                equalTo(1));
    }
}
