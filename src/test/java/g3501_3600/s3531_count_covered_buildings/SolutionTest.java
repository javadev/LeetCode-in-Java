package g3501_3600.s3531_count_covered_buildings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCoveredBuildings() {
        assertThat(
                new Solution()
                        .countCoveredBuildings(
                                3, new int[][] {{1, 2}, {2, 2}, {3, 2}, {2, 1}, {2, 3}}),
                equalTo(1));
    }

    @Test
    void countCoveredBuildings2() {
        assertThat(
                new Solution()
                        .countCoveredBuildings(3, new int[][] {{1, 1}, {1, 2}, {2, 1}, {2, 2}}),
                equalTo(0));
    }

    @Test
    void countCoveredBuildings3() {
        assertThat(
                new Solution()
                        .countCoveredBuildings(
                                5, new int[][] {{1, 3}, {3, 2}, {3, 3}, {3, 5}, {5, 3}}),
                equalTo(1));
    }
}
