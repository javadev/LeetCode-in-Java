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
}
