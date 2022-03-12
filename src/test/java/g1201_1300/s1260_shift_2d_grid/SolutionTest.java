package g1201_1300.s1260_shift_2d_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shiftGrid() {
        assertThat(
                new Solution().shiftGrid(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(9, 1, 2),
                                Arrays.asList(3, 4, 5),
                                Arrays.asList(6, 7, 8))));
    }

    @Test
    void shiftGrid2() {
        assertThat(
                new Solution()
                        .shiftGrid(
                                new int[][] {
                                    {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}
                                },
                                4),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(12, 0, 21, 13),
                                Arrays.asList(3, 8, 1, 9),
                                Arrays.asList(19, 7, 2, 5),
                                Arrays.asList(4, 6, 11, 10))));
    }

    @Test
    void shiftGrid3() {
        assertThat(
                new Solution().shiftGrid(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9),
                equalTo(
                        Arrays.asList(
                                Arrays.asList(1, 2, 3),
                                Arrays.asList(4, 5, 6),
                                Arrays.asList(7, 8, 9))));
    }
}
