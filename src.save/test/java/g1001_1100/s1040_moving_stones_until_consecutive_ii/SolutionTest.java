package g1001_1100.s1040_moving_stones_until_consecutive_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numMovesStonesII() {
        assertThat(new Solution().numMovesStonesII(new int[] {7, 4, 9}), equalTo(new int[] {1, 2}));
    }

    @Test
    void numMovesStonesII2() {
        assertThat(
                new Solution().numMovesStonesII(new int[] {6, 5, 4, 3, 10}),
                equalTo(new int[] {2, 3}));
    }
}
