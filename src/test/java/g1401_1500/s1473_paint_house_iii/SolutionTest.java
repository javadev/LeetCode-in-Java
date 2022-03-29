package g1401_1500.s1473_paint_house_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(
                new Solution()
                        .minCost(
                                new int[] {0, 0, 0, 0, 0},
                                new int[][] {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}},
                                2,
                                3),
                equalTo(9));
    }

    @Test
    void minCost2() {
        assertThat(
                new Solution()
                        .minCost(
                                new int[] {0, 2, 1, 2, 0},
                                new int[][] {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}},
                                2,
                                3),
                equalTo(11));
    }

    @Test
    void minCost3() {
        assertThat(
                new Solution()
                        .minCost(
                                new int[] {3, 1, 2, 3},
                                new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
                                3,
                                3),
                equalTo(-1));
    }
}
