package g2201_2300.s2203_minimum_weighted_subgraph_with_the_required_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumWeight() {
        assertThat(
                new Solution()
                        .minimumWeight(
                                6,
                                new int[][] {
                                    {0, 2, 2}, {0, 5, 6}, {1, 0, 3}, {1, 4, 5}, {2, 1, 1},
                                    {2, 3, 3}, {2, 3, 4}, {3, 4, 2}, {4, 5, 1}
                                },
                                0,
                                1,
                                5),
                equalTo(9L));
    }

    @Test
    void minimumWeight2() {
        assertThat(
                new Solution().minimumWeight(3, new int[][] {{0, 1, 1}, {2, 1, 1}}, 0, 1, 2),
                equalTo(-1L));
    }
}
