package g0401_0500.s0463_island_perimeter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void islandPerimeter() {
        assertThat(
                new Solution()
                        .islandPerimeter(
                                new int[][] {
                                    {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
                                }),
                equalTo(16));
    }

    @Test
    void islandPerimeter2() {
        assertThat(new Solution().islandPerimeter(new int[][] {{1}}), equalTo(4));
    }

    @Test
    void islandPerimeter3() {
        assertThat(new Solution().islandPerimeter(new int[][] {{1, 0}}), equalTo(4));
    }
}
