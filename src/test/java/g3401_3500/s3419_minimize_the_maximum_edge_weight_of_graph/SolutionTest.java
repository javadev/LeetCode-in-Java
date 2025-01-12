package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMaxWeight() {
        assertThat(
                new Solution()
                        .minMaxWeight(
                                5,
                                new int[][] {{1, 0, 1}, {2, 0, 2}, {3, 0, 1}, {4, 3, 1}, {2, 1, 1}},
                                2),
                equalTo(1));
    }

    @Test
    void minMaxWeight2() {
        assertThat(
                new Solution()
                        .minMaxWeight(
                                5,
                                new int[][] {
                                    {0, 1, 1}, {0, 2, 2}, {0, 3, 1}, {0, 4, 1}, {1, 2, 1}, {1, 4, 1}
                                },
                                1),
                equalTo(-1));
    }

    @Test
    void minMaxWeight3() {
        assertThat(
                new Solution()
                        .minMaxWeight(
                                5,
                                new int[][] {
                                    {1, 2, 1}, {1, 3, 3}, {1, 4, 5}, {2, 3, 2}, {3, 4, 2}, {4, 0, 1}
                                },
                                1),
                equalTo(2));
    }

    @Test
    void minMaxWeight4() {
        assertThat(
                new Solution()
                        .minMaxWeight(
                                5,
                                new int[][] {{1, 2, 1}, {1, 3, 3}, {1, 4, 5}, {2, 3, 2}, {4, 0, 1}},
                                1),
                equalTo(-1));
    }
}
