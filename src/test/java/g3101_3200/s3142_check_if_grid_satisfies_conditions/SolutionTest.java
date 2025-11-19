package g3101_3200.s3142_check_if_grid_satisfies_conditions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void satisfiesConditions() {
        assertThat(
                new Solution().satisfiesConditions(new int[][] {{1, 0, 2}, {1, 0, 2}}),
                equalTo(true));
    }

    @Test
    void satisfiesConditions2() {
        assertThat(
                new Solution().satisfiesConditions(new int[][] {{1, 1, 1}, {0, 0, 0}}),
                equalTo(false));
    }

    @Test
    void satisfiesConditions3() {
        assertThat(new Solution().satisfiesConditions(new int[][] {{1}, {2}, {3}}), equalTo(false));
    }

    @Test
    void satisfiesConditions4() {
        assertThat(new Solution().satisfiesConditions(new int[][] {{1}, {1}}), equalTo(true));
    }

    @Test
    void satisfiesConditions5() {
        assertThat(new Solution().satisfiesConditions(new int[][] {{1, 2, 3}}), equalTo(true));
    }

    @Test
    void satisfiesConditions6() {
        assertThat(new Solution().satisfiesConditions(new int[][] {{1, 1}}), equalTo(false));
    }

    @Test
    void satisfiesConditions7() {
        assertThat(
                new Solution().satisfiesConditions(new int[][] {{1, 2, 2}, {3, 4, 5}}),
                equalTo(false));
    }

    @Test
    void satisfiesConditions8() {
        int[][] grid = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };
        assertThat(new Solution().satisfiesConditions(grid), equalTo(false));
    }

    @Test
    void satisfiesConditions9() {
        assertThat(new Solution().satisfiesConditions(new int[][] {{5, 1}, {5, 0}}), equalTo(true));
    }

    @Test
    void satisfiesConditions10() {
        assertThat(
                new Solution().satisfiesConditions(new int[][] {{1, 0}, {2, 2}}), equalTo(false));
    }

    @Test
    void satisfiesConditions11() {
        assertThat(new Solution().satisfiesConditions(new int[][] {{7}}), equalTo(true));
    }

    @Test
    void satisfiesConditions12() {
        int[][] grid = {
            {4, 1, 5, 2},
            {3, 0, 4, 1}
        };
        assertThat(new Solution().satisfiesConditions(grid), equalTo(false));
    }

    @Test
    void satisfiesConditions13() {
        int[][] grid = {
            {2, 3, 3, 1},
            {1, 0, 4, 2}
        };
        assertThat(new Solution().satisfiesConditions(grid), equalTo(false));
    }
}
