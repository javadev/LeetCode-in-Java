package g1701_1800.s1761_minimum_degree_of_a_connected_trio_in_a_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTrioDegree() {
        assertThat(
                new Solution()
                        .minTrioDegree(
                                6, new int[][] {{1, 2}, {1, 3}, {3, 2}, {4, 1}, {5, 2}, {3, 6}}),
                equalTo(3));
    }

    @Test
    void minTrioDegree2() {
        assertThat(
                new Solution()
                        .minTrioDegree(
                                7,
                                new int[][] {
                                    {1, 3}, {4, 1}, {4, 3}, {2, 5}, {5, 6}, {6, 7}, {7, 5}, {2, 6}
                                }),
                equalTo(0));
    }
}
