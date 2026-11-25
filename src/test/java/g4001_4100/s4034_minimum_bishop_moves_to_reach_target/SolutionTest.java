package g4001_4100.s4034_minimum_bishop_moves_to_reach_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minBishopMoves() {
        assertThat(new Solution().minBishopMoves(new int[] {0, 0}, new int[] {0, 0}), equalTo(0));
    }

    @Test
    void minBishopMoves2() {
        assertThat(new Solution().minBishopMoves(new int[] {0, 0}, new int[] {3, 3}), equalTo(1));
    }

    @Test
    void minBishopMoves3() {
        assertThat(new Solution().minBishopMoves(new int[] {0, 0}, new int[] {2, 4}), equalTo(2));
    }

    @Test
    void minBishopMoves4() {
        assertThat(new Solution().minBishopMoves(new int[] {0, 0}, new int[] {1, 0}), equalTo(-1));
    }
}

