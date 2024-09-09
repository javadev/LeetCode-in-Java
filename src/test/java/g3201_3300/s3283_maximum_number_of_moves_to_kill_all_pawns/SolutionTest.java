package g3201_3300.s3283_maximum_number_of_moves_to_kill_all_pawns;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxMoves() {
        assertThat(new Solution().maxMoves(1, 1, new int[][] {{0, 0}}), equalTo(4));
    }

    @Test
    void maxMoves2() {
        assertThat(new Solution().maxMoves(0, 2, new int[][] {{1, 1}, {2, 2}, {3, 3}}), equalTo(8));
    }

    @Test
    void maxMoves3() {
        assertThat(new Solution().maxMoves(0, 0, new int[][] {{1, 2}, {2, 4}}), equalTo(3));
    }
}
