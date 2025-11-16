package g1901_2000.s1901_find_a_peak_element_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void findPeakGrid3() {
        assertThat(
                new Solution().findPeakGrid(new int[][] {{1, 3, 2, 4}}), equalTo(new int[] {0, 1}));
    }

    @Test
    void findPeakGrid4() {
        assertThat(
                new Solution().findPeakGrid(new int[][] {{1}, {3}, {2}, {4}}),
                equalTo(new int[] {3, 0}));
    }

    @Test
    void findPeakGrid5() {
        assertThat(
                new Solution().findPeakGrid(new int[][] {{2, 2}, {2, 2}}),
                equalTo(new int[] {0, 1}));
    }

    @Test
    void findPeakGrid6() {
        int[][] mat = {
            {1, 2, 3, 6},
            {5, 6, 7, 8},
            {4, 3, 2, 1}
        };
        int[] peak = new Solution().findPeakGrid(mat);
        assertTrue(peak[0] >= 0 && peak[1] >= 0);
        int val = mat[peak[0]][peak[1]];
        int up = peak[0] > 0 ? mat[peak[0] - 1][peak[1]] : -1;
        int down = peak[0] < mat.length - 1 ? mat[peak[0] + 1][peak[1]] : -1;
        int left = peak[1] > 0 ? mat[peak[0]][peak[1] - 1] : -1;
        int right = peak[1] < mat[0].length - 1 ? mat[peak[0]][peak[1] + 1] : -1;
        assertTrue(val > up && val > down && val > left && val > right);
    }

    @Test
    void findPeakGrid7() {
        assertThat(new Solution().findPeakGrid(new int[][] {{5}}), equalTo(new int[] {0, 0}));
    }
}
