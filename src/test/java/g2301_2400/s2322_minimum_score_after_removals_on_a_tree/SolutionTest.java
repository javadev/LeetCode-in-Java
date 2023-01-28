package g2301_2400.s2322_minimum_score_after_removals_on_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumScore() {
        assertThat(
                new Solution()
                        .minimumScore(
                                new int[] {1, 5, 5, 4, 11},
                                new int[][] {{0, 1}, {1, 2}, {1, 3}, {3, 4}}),
                equalTo(9));
    }

    @Test
    void minimumScore2() {
        assertThat(
                new Solution()
                        .minimumScore(
                                new int[] {5, 5, 2, 4, 4, 2},
                                new int[][] {{0, 1}, {1, 2}, {5, 2}, {4, 3}, {1, 3}}),
                equalTo(0));
    }
}
