package g3901_4000.s3988_create_grid_with_exactly_k_paths_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void createGrid() {
        assertThat(new Solution().createGrid(2, 3, 2), equalTo(new String[] {"..#", "..."}));
    }

    @Test
    void createGrid2() {
        assertThat(new Solution().createGrid(3, 3, 4), equalTo(new String[] {"..#", "...", "#.."}));
    }

    @Test
    void createGrid3() {
        assertThat(new Solution().createGrid(1, 4, 2), equalTo(new String[] {}));
    }

    @Test
    void createGrid4() {
        assertThat(new Solution().createGrid(2, 3, 1), equalTo(new String[] {".##", "..."}));
    }

    @Test
    void createGrid5() {
        // Single cell, k = 1
        assertThat(new Solution().createGrid(1, 1, 1), equalTo(new String[] {"."}));
    }

    @Test
    void createGrid6() {
        // Single row, k = 1 -> only horizontal connection
        assertThat(new Solution().createGrid(1, 5, 1), equalTo(new String[] {"....."}));
    }

    @Test
    void createGrid7() {
        // Single column, k = 1 -> only vertical connection
        assertThat(new Solution().createGrid(4, 1, 1), equalTo(new String[] {".", ".", ".", "."}));
    }

    @Test
    void createGrid8() {
        // k = 3, m >= 3 && n >= 2 -> dimensions {2, 1}, whole grid open
        assertThat(new Solution().createGrid(3, 2, 3), equalTo(new String[] {"..", "..", ".."}));
    }

    @Test
    void createGrid9() {
        // k = 3, m < 3 but n >= 3 -> dimensions {1, 2}, whole grid open
        assertThat(new Solution().createGrid(2, 3, 3), equalTo(new String[] {"...", "..."}));
    }

    @Test
    void createGrid10() {
        // k = 3 on larger grid -> dimensions {2, 1} plus connection to bottom-right
        assertThat(
                new Solution().createGrid(4, 4, 3),
                equalTo(new String[] {"..##", "..##", "..##", "#..."}));
    }

    @Test
    void createGrid11() {
        // k = 3 impossible on 2x2 grid
        assertThat(new Solution().createGrid(2, 2, 3), equalTo(new String[] {}));
    }

    @Test
    void createGrid12() {
        // k = 4, m >= 4 && n >= 2 -> dimensions {3, 1}
        assertThat(
                new Solution().createGrid(4, 2, 4), equalTo(new String[] {"..", "..", "..", ".."}));
    }

    @Test
    void createGrid13() {
        // k = 4, m < 4 but n >= 4 -> dimensions {1, 3}
        assertThat(new Solution().createGrid(2, 4, 4), equalTo(new String[] {"....", "...."}));
    }

    @Test
    void createGrid14() {
        // k = 4 on 5x5 grid -> dimensions {3, 1} plus connection
        assertThat(
                new Solution().createGrid(5, 5, 4),
                equalTo(new String[] {"..###", "..###", "..###", "..###", "#...."}));
    }

    @Test
    void createGrid15() {
        // k = 4 with dimensions {1, 3} and a vertical connection
        assertThat(
                new Solution().createGrid(3, 4, 4), equalTo(new String[] {"....", "....", "###."}));
    }

    @Test
    void createGrid16() {
        // k = 4 impossible on 2x2 grid
        assertThat(new Solution().createGrid(2, 2, 4), equalTo(new String[] {}));
    }

    @Test
    void createGrid17() {
        // k = 2 on 3x5 grid -> dimensions {1, 1} plus connection
        assertThat(
                new Solution().createGrid(3, 5, 2),
                equalTo(new String[] {"..###", "..###", "#...."}));
    }

    @Test
    void createGrid18() {
        // Unsupported k (> 4)
        assertThat(new Solution().createGrid(3, 3, 5), equalTo(new String[] {}));
    }

    @Test
    void createGrid19() {
        // Unsupported k (0)
        assertThat(new Solution().createGrid(3, 3, 0), equalTo(new String[] {}));
    }
}
