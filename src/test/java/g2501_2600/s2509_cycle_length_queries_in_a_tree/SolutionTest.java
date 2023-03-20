package g2501_2600.s2509_cycle_length_queries_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void cycleLengthQueries() {
        assertThat(
                new Solution().cycleLengthQueries(3, new int[][] {{5, 3}, {4, 7}, {2, 3}}),
                equalTo(new int[] {4, 5, 3}));
    }

    @Test
    void cycleLengthQueries2() {
        assertThat(
                new Solution().cycleLengthQueries(2, new int[][] {{1, 2}}), equalTo(new int[] {2}));
    }
}
