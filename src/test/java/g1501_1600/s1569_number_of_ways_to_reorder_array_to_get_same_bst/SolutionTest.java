package g1501_1600.s1569_number_of_ways_to_reorder_array_to_get_same_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfWays() {
        assertThat(new Solution().numOfWays(new int[] {2, 1, 3}), equalTo(1));
    }

    @Test
    void numOfWays2() {
        assertThat(new Solution().numOfWays(new int[] {3, 4, 5, 1, 2}), equalTo(5));
    }

    @Test
    void numOfWays3() {
        assertThat(new Solution().numOfWays(new int[] {1, 2, 3}), equalTo(0));
    }
}
