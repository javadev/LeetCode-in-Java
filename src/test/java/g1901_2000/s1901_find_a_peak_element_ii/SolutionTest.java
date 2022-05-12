package g1901_2000.s1901_find_a_peak_element_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPeakGrid() {
        assertThat(
                new Solution().findPeakGrid(new int[][] {{1, 4}, {3, 2}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void findPeakGrid2() {
        assertThat(
                new Solution().findPeakGrid(new int[][] {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}}),
                equalTo(new int[] {1, 1}));
    }
}
