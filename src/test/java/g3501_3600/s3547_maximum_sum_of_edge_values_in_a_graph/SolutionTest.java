package g3501_3600.s3547_maximum_sum_of_edge_values_in_a_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution()
                        .maxScore(7, new int[][] {{0, 1}, {1, 2}, {2, 0}, {3, 4}, {4, 5}, {5, 6}}),
                equalTo(130L));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution()
                        .maxScore(6, new int[][] {{0, 3}, {4, 5}, {2, 0}, {1, 3}, {2, 4}, {1, 5}}),
                equalTo(82L));
    }
}
