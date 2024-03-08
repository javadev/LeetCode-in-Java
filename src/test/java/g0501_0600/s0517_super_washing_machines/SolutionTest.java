package g0501_0600.s0517_super_washing_machines;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinMoves() {
        assertThat(new Solution().findMinMoves(new int[] {1, 0, 5}), equalTo(3));
    }

    @Test
    void findMinMoves2() {
        assertThat(new Solution().findMinMoves(new int[] {0, 3, 0}), equalTo(2));
    }
}
