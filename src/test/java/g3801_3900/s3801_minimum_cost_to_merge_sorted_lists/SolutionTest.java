package g3801_3900.s3801_minimum_cost_to_merge_sorted_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMergeCost() {
        assertThat(
                new Solution().minMergeCost(new int[][] {{1, 3, 5}, {2, 4}, {6, 7, 8}}),
                equalTo(18L));
    }

    @Test
    void minMergeCost2() {
        assertThat(
                new Solution().minMergeCost(new int[][] {{1, 1, 5}, {1, 4, 7, 8}}), equalTo(10L));
    }

    @Test
    void minMergeCost3() {
        assertThat(new Solution().minMergeCost(new int[][] {{1}, {3}}), equalTo(4L));
    }

    @Test
    void minMergeCost4() {
        assertThat(new Solution().minMergeCost(new int[][] {{1}, {1}}), equalTo(2L));
    }
}
