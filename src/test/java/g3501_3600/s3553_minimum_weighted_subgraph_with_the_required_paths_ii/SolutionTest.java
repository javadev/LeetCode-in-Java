package g3501_3600.s3553_minimum_weighted_subgraph_with_the_required_paths_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumWeight() {
        assertThat(
                new Solution()
                        .minimumWeight(
                                new int[][] {{0, 1, 2}, {1, 2, 3}, {1, 3, 5}, {1, 4, 4}, {2, 5, 6}},
                                new int[][] {{2, 3, 4}, {0, 2, 5}}),
                equalTo(new int[] {12, 11}));
    }

    @Test
    void minimumWeight2() {
        assertThat(
                new Solution()
                        .minimumWeight(new int[][] {{1, 0, 8}, {0, 2, 7}}, new int[][] {{0, 1, 2}}),
                equalTo(new int[] {15}));
    }
}
