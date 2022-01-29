package g0701_0800.s0773_sliding_puzzle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void slidingPuzzle() {
        assertThat(new Solution().slidingPuzzle(new int[][] {{1, 2, 3}, {4, 0, 5}}), equalTo(1));
    }

    @Test
    void slidingPuzzle2() {
        assertThat(new Solution().slidingPuzzle(new int[][] {{1, 2, 3}, {5, 4, 0}}), equalTo(-1));
    }

    @Test
    void slidingPuzzle3() {
        assertThat(new Solution().slidingPuzzle(new int[][] {{4, 1, 2}, {5, 0, 3}}), equalTo(5));
    }
}
