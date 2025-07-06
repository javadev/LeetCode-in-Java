package g3601_3700.s3607_power_grid_maintenance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void processQueries() {
        assertThat(
                new Solution()
                        .processQueries(
                                5,
                                new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}},
                                new int[][] {{1, 3}, {2, 1}, {1, 1}, {2, 2}, {1, 2}}),
                equalTo(new int[] {3, 2, 3}));
    }

    @Test
    void processQueries2() {
        assertThat(
                new Solution()
                        .processQueries(3, new int[][] {}, new int[][] {{1, 1}, {2, 1}, {1, 1}}),
                equalTo(new int[] {1, -1}));
    }
}
