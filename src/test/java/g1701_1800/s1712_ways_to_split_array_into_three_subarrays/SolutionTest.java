package g1701_1800.s1712_ways_to_split_array_into_three_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToSplit() {
        assertThat(new Solution().waysToSplit(new int[] {1, 1, 1}), equalTo(1));
    }

    @Test
    void waysToSplit2() {
        assertThat(new Solution().waysToSplit(new int[] {1, 2, 2, 2, 5, 0}), equalTo(3));
    }

    @Test
    void waysToSplit3() {
        assertThat(new Solution().waysToSplit(new int[] {3, 2, 1}), equalTo(0));
    }
}
