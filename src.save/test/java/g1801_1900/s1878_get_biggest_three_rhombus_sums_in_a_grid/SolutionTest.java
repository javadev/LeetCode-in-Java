package g1801_1900.s1878_get_biggest_three_rhombus_sums_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getBiggestThree() {
        assertThat(
                new Solution()
                        .getBiggestThree(
                                new int[][] {
                                    {3, 4, 5, 1, 3},
                                    {3, 3, 4, 2, 3},
                                    {20, 30, 200, 40, 10},
                                    {1, 5, 5, 4, 1},
                                    {4, 3, 2, 2, 5}
                                }),
                equalTo(new int[] {228, 216, 211}));
    }

    @Test
    void getBiggestThree2() {
        assertThat(
                new Solution().getBiggestThree(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(new int[] {20, 9, 8}));
    }

    @Test
    void getBiggestThree3() {
        assertThat(new Solution().getBiggestThree(new int[][] {{7, 7, 7}}), equalTo(new int[] {7}));
    }
}
