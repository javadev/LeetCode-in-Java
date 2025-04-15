package g3501_3600.s3515_shortest_path_in_a_weighted_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void treeQueries() {
        assertThat(
                new Solution()
                        .treeQueries(
                                2,
                                new int[][] {{1, 2, 7}},
                                new int[][] {{2, 2}, {1, 1, 2, 4}, {2, 2}}),
                equalTo(new int[] {7, 4}));
    }

    @Test
    void treeQueries2() {
        assertThat(
                new Solution()
                        .treeQueries(
                                3,
                                new int[][] {{1, 2, 2}, {1, 3, 4}},
                                new int[][] {{2, 1}, {2, 3}, {1, 1, 3, 7}, {2, 2}, {2, 3}}),
                equalTo(new int[] {0, 4, 2, 7}));
    }

    @Test
    void treeQueries3() {
        assertThat(
                new Solution()
                        .treeQueries(
                                4,
                                new int[][] {{1, 2, 2}, {2, 3, 1}, {3, 4, 5}},
                                new int[][] {{2, 4}, {2, 3}, {1, 2, 3, 3}, {2, 2}, {2, 3}}),
                equalTo(new int[] {8, 3, 2, 5}));
    }
}
