package g3501_3600.s3534_path_existence_queries_in_a_graph_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pathExistenceQueries() {
        assertThat(
                new Solution()
                        .pathExistenceQueries(
                                5, new int[] {1, 8, 3, 4, 2}, 3, new int[][] {{0, 3}, {2, 4}}),
                equalTo(new int[] {1, 1}));
    }

    @Test
    void pathExistenceQueries2() {
        assertThat(
                new Solution()
                        .pathExistenceQueries(
                                5,
                                new int[] {5, 3, 1, 9, 10},
                                2,
                                new int[][] {{0, 1}, {0, 2}, {2, 3}, {4, 3}}),
                equalTo(new int[] {1, 2, -1, 1}));
    }

    @Test
    void pathExistenceQueries3() {
        assertThat(
                new Solution()
                        .pathExistenceQueries(
                                3, new int[] {3, 6, 1}, 1, new int[][] {{0, 0}, {0, 1}, {1, 2}}),
                equalTo(new int[] {0, -1, -1}));
    }
}
