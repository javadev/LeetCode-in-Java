package g3301_3400.s3367_maximize_sum_of_weights_after_edge_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeSumOfWeights() {
        assertThat(
                new Solution()
                        .maximizeSumOfWeights(
                                new int[][] {{0, 1, 4}, {0, 2, 2}, {2, 3, 12}, {2, 4, 6}}, 2),
                equalTo(22L));
    }

    @Test
    void maximizeSumOfWeights2() {
        assertThat(
                new Solution()
                        .maximizeSumOfWeights(
                                new int[][] {
                                    {0, 1, 5},
                                    {1, 2, 10},
                                    {0, 3, 15},
                                    {3, 4, 20},
                                    {3, 5, 5},
                                    {0, 6, 10}
                                },
                                3),
                equalTo(65L));
    }
}
