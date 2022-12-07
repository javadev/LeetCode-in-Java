package g1901_2000.s1914_cyclically_rotating_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rotateGrid() {
        assertThat(
                new Solution().rotateGrid(new int[][] {{40, 10}, {30, 20}}, 1),
                equalTo(new int[][] {{10, 20}, {40, 30}}));
    }

    @Test
    void rotateGrid2() {
        assertThat(
                new Solution()
                        .rotateGrid(
                                new int[][] {
                                    {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
                                },
                                2),
                equalTo(
                        new int[][] {
                            {3, 4, 8, 12}, {2, 11, 10, 16}, {1, 7, 6, 15}, {5, 9, 13, 14}
                        }));
    }
}
