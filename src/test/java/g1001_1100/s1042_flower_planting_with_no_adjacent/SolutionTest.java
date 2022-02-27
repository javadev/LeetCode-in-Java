package g1001_1100.s1042_flower_planting_with_no_adjacent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gardenNoAdj() {
        assertThat(
                new Solution().gardenNoAdj(3, new int[][] {{1, 2}, {2, 3}, {3, 1}}),
                equalTo(new int[] {1, 2, 3}));
    }

    @Test
    void gardenNoAdj2() {
        assertThat(
                new Solution().gardenNoAdj(4, new int[][] {{1, 2}, {3, 4}}),
                equalTo(new int[] {1, 2, 1, 2}));
    }

    @Test
    void gardenNoAdj3() {
        assertThat(
                new Solution()
                        .gardenNoAdj(
                                4, new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}, {2, 4}}),
                equalTo(new int[] {1, 2, 3, 4}));
    }
}
