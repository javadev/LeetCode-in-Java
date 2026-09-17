package g3901_4000.s3905_multi_source_flood_fill;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void colorGrid() {
        assertThat(
                new Solution().colorGrid(3, 3, new int[][] {{0, 0, 1}, {2, 2, 2}}),
                equalTo(new int[][] {{1, 1, 2}, {1, 2, 2}, {2, 2, 2}}));
    }

    @Test
    void colorGrid2() {
        assertThat(
                new Solution().colorGrid(3, 3, new int[][] {{0, 1, 3}, {1, 1, 5}}),
                equalTo(new int[][] {{3, 3, 3}, {5, 5, 5}, {5, 5, 5}}));
    }

    @Test
    void colorGrid3() {
        assertThat(
                new Solution().colorGrid(2, 2, new int[][] {{1, 1, 5}}),
                equalTo(new int[][] {{5, 5}, {5, 5}}));
    }

    @Test
    void colorGrid4() {
        assertThat(
                new Solution().colorGrid(1, 1, new int[][] {{0, 0, 7}}),
                equalTo(new int[][] {{7}}));
    }

    @Test
    void colorGrid5() {
        assertThat(
                new Solution().colorGrid(1, 5, new int[][] {{0, 0, 2}, {0, 4, 9}}),
                equalTo(new int[][] {{2, 2, 9, 9, 9}}));
    }

    @Test
    void colorGrid6() {
        assertThat(
                new Solution().colorGrid(5, 1, new int[][] {{4, 0, 9}, {0, 0, 2}}),
                equalTo(new int[][] {{2}, {2}, {9}, {9}, {9}}));
    }
}
