package g3501_3600.s3552_grid_teleportation_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new String[] {"A..", ".A.", "..."}), equalTo(2));
    }

    @Test
    void minMoves2() {
        assertThat(
                new Solution().minMoves(new String[] {".#...", ".#.#.", ".#.#.", "...#."}),
                equalTo(13));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(new String[] {".", "A"}), equalTo(1));
    }

    @Test
    void minMoves4() {
        assertThat(new Solution().minMoves(new String[] {".D", "EH"}), equalTo(2));
    }
}
