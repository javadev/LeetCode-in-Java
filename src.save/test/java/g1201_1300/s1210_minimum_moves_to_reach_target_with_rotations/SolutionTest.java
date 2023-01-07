package g1201_1300.s1210_minimum_moves_to_reach_target_with_rotations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumMoves() {
        int[][] input =
                new int[][] {
                    {0, 0, 0, 0, 0, 1},
                    {1, 1, 0, 0, 1, 0},
                    {0, 0, 0, 0, 1, 1},
                    {0, 0, 1, 0, 1, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0}
                };
        assertThat(new Solution().minimumMoves(input), equalTo(11));
    }

    @Test
    void minimumMoves2() {
        int[][] input =
                new int[][] {
                    {0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 1, 1},
                    {1, 1, 0, 0, 0, 1},
                    {1, 1, 1, 0, 0, 1},
                    {1, 1, 1, 0, 0, 1},
                    {1, 1, 1, 0, 0, 0}
                };
        assertThat(new Solution().minimumMoves(input), equalTo(9));
    }
}
