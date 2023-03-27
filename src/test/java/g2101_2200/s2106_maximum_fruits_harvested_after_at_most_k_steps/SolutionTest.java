package g2101_2200.s2106_maximum_fruits_harvested_after_at_most_k_steps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTotalFruits() {
        assertThat(
                new Solution().maxTotalFruits(new int[][] {{2, 8}, {6, 3}, {8, 6}}, 5, 4),
                equalTo(9));
    }

    @Test
    void maxTotalFruits2() {
        assertThat(
                new Solution()
                        .maxTotalFruits(
                                new int[][] {{0, 9}, {4, 1}, {5, 7}, {6, 2}, {7, 4}, {10, 9}},
                                5,
                                4),
                equalTo(14));
    }

    @Test
    void maxTotalFruits3() {
        assertThat(
                new Solution().maxTotalFruits(new int[][] {{0, 3}, {6, 4}, {8, 5}}, 3, 2),
                equalTo(0));
    }
}
