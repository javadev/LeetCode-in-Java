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
}
