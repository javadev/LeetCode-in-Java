package g3501_3600.s3551_minimum_swaps_to_sort_by_digit_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwaps() {
        assertThat(new Solution().minSwaps(new int[] {37, 100}), equalTo(1));
    }

    @Test
    void minSwaps2() {
        assertThat(new Solution().minSwaps(new int[] {22, 14, 33, 7}), equalTo(0));
    }

    @Test
    void minSwaps3() {
        assertThat(new Solution().minSwaps(new int[] {18, 43, 34, 16}), equalTo(2));
    }
}
