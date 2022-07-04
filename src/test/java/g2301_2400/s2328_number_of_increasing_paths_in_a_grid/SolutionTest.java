package g2301_2400.s2328_number_of_increasing_paths_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPaths() {
        assertThat(new Solution().countPaths(new int[][] {{1, 1}, {3, 4}}), equalTo(8));
    }

    @Test
    void countPaths2() {
        assertThat(new Solution().countPaths(new int[][] {{1}, {2}}), equalTo(3));
    }
}
