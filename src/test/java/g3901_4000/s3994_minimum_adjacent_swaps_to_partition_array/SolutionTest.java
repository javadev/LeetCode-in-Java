package g3901_4000.s3994_minimum_adjacent_swaps_to_partition_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAdjacentSwaps() {
        assertThat(new Solution().minAdjacentSwaps(new int[] {1, 3, 2, 4, 5, 6}, 3, 4), equalTo(1));
    }

    @Test
    void minAdjacentSwaps2() {
        assertThat(new Solution().minAdjacentSwaps(new int[] {9, 7, 5, 3}, 4, 8), equalTo(5));
    }

    @Test
    void minAdjacentSwaps3() {
        assertThat(new Solution().minAdjacentSwaps(new int[] {3, 7, 5, 9}, 4, 8), equalTo(0));
    }
}
