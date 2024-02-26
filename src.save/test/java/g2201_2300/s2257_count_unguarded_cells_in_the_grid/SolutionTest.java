package g2201_2300.s2257_count_unguarded_cells_in_the_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countUnguarded() {
        assertThat(
                new Solution()
                        .countUnguarded(
                                4,
                                6,
                                new int[][] {{0, 0}, {1, 1}, {2, 3}},
                                new int[][] {{0, 1}, {2, 2}, {1, 4}}),
                equalTo(7));
    }

    @Test
    void countUnguarded2() {
        assertThat(
                new Solution()
                        .countUnguarded(
                                3,
                                3,
                                new int[][] {{1, 1}},
                                new int[][] {{0, 1}, {1, 0}, {2, 1}, {1, 2}}),
                equalTo(4));
    }
}
