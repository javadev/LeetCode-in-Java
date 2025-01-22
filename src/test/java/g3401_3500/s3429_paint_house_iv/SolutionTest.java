package g3401_3500.s3429_paint_house_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution().minCost(4, new int[][] {{3, 5, 7}, {6, 2, 9}, {4, 8, 1}, {7, 3, 5}}),
                equalTo(9L));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost(
                                6,
                                new int[][] {
                                    {2, 4, 6}, {5, 3, 8}, {7, 1, 9}, {4, 6, 2}, {3, 5, 7}, {8, 2, 4}
                                }),
                equalTo(18L));
    }
}
