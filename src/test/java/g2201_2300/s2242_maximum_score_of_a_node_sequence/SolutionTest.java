package g2201_2300.s2242_maximum_score_of_a_node_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScore() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[] {5, 2, 9, 8, 4},
                                new int[][] {{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}}),
                equalTo(24));
    }

    @Test
    void maximumScore2() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[] {9, 20, 6, 4, 11, 12},
                                new int[][] {{0, 3}, {5, 3}, {2, 4}, {1, 3}}),
                equalTo(-1));
    }
}
