package g2701_2800.s2750_ways_to_split_array_into_good_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfGoodSubarraySplits() {
        assertThat(
                new Solution().numberOfGoodSubarraySplits(new int[] {0, 1, 0, 0, 1}), equalTo(3));
    }

    @Test
    void numberOfGoodSubarraySplits2() {
        assertThat(new Solution().numberOfGoodSubarraySplits(new int[] {0, 1, 0}), equalTo(1));
    }

    @Test
    void numberOfGoodSubarraySplits3() {
        assertThat(new Solution().numberOfGoodSubarraySplits(new int[] {0, 0}), equalTo(0));
    }
}
