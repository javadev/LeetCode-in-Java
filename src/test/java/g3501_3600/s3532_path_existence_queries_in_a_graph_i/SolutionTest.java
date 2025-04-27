package g3501_3600.s3532_path_existence_queries_in_a_graph_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pathExistenceQueries() {
        assertThat(
                new Solution()
                        .pathExistenceQueries(2, new int[] {1, 3}, 1, new int[][] {{0, 0}, {0, 1}}),
                equalTo(new boolean[] {true, false}));
    }

    @Test
    void pathExistenceQueries2() {
        assertThat(
                new Solution()
                        .pathExistenceQueries(
                                4,
                                new int[] {2, 5, 6, 8},
                                2,
                                new int[][] {{0, 1}, {0, 2}, {1, 3}, {2, 3}}),
                equalTo(new boolean[] {false, false, true, true}));
    }
}
