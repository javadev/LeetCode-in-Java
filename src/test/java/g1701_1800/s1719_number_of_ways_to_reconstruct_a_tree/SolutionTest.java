package g1701_1800.s1719_number_of_ways_to_reconstruct_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkWays() {
        assertThat(new Solution().checkWays(new int[][] {{1, 2}, {2, 3}}), equalTo(1));
    }

    @Test
    void checkWays2() {
        assertThat(new Solution().checkWays(new int[][] {{1, 2}, {2, 3}, {1, 3}}), equalTo(2));
    }

    @Test
    void checkWays3() {
        assertThat(
                new Solution().checkWays(new int[][] {{1, 2}, {2, 3}, {2, 4}, {1, 5}}), equalTo(0));
    }
}
