package g1801_1900.s1850_minimum_adjacent_swaps_to_reach_the_kth_smallest_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMinSwaps() {
        assertThat(new Solution().getMinSwaps("5489355142", 4), equalTo(2));
    }

    @Test
    void getMinSwaps2() {
        assertThat(new Solution().getMinSwaps("11112", 4), equalTo(4));
    }

    @Test
    void getMinSwaps3() {
        assertThat(new Solution().getMinSwaps("00123", 1), equalTo(1));
    }
}
