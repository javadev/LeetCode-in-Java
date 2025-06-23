package g3501_3600.s3587_minimum_adjacent_swaps_to_alternate_parity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwaps() {
        assertThat(new Solution().minSwaps(new int[] {2, 4, 6, 5, 7}), equalTo(3));
    }

    @Test
    void minSwaps2() {
        assertThat(new Solution().minSwaps(new int[] {2, 4, 5, 7}), equalTo(1));
    }

    @Test
    void minSwaps3() {
        assertThat(new Solution().minSwaps(new int[] {1, 2, 3}), equalTo(0));
    }

    @Test
    void minSwaps4() {
        assertThat(new Solution().minSwaps(new int[] {4, 5, 6, 8}), equalTo(-1));
    }
}
