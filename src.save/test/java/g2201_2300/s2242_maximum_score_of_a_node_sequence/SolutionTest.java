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

    @Test
    void maximumScore3() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[] {14, 12, 10, 8, 1, 2, 3, 1},
                                new int[][] {
                                    {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 1}, {6, 1}, {7, 1}, {2, 1}
                                }),
                equalTo(44));
    }

    @Test
    void maximumScore4() {
        assertThat(
                new Solution()
                        .maximumScore(
                                new int[] {29, 28, 16, 28, 15, 27, 17, 10, 17},
                                new int[][] {
                                    {6, 2}, {2, 4}, {4, 7}, {3, 2}, {6, 4}, {7, 3}, {3, 6}, {6, 1},
                                    {2, 5}, {5, 7}, {7, 6}, {1, 4}, {3, 0}, {0, 4}, {5, 4}, {4, 8},
                                    {8, 0}, {0, 5}, {1, 5}
                                }),
                equalTo(112));
    }
}
