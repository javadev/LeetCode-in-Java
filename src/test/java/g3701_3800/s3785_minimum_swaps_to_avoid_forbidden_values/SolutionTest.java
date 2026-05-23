package g3701_3800.s3785_minimum_swaps_to_avoid_forbidden_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwaps() {
        assertThat(new Solution().minSwaps(new int[] {1, 2, 3}, new int[] {3, 2, 1}), equalTo(1));
    }

    @Test
    void minSwaps2() {
        assertThat(
                new Solution().minSwaps(new int[] {4, 6, 6, 5}, new int[] {4, 6, 5, 5}),
                equalTo(2));
    }

    @Test
    void minSwaps3() {
        assertThat(new Solution().minSwaps(new int[] {7, 7}, new int[] {8, 7}), equalTo(-1));
    }

    @Test
    void minSwaps4() {
        assertThat(new Solution().minSwaps(new int[] {1, 2}, new int[] {2, 1}), equalTo(0));
    }
}
