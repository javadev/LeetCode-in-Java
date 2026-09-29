package g3901_4000.s3936_minimum_swaps_to_move_zeros_to_end;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSwaps() {
        assertThat(new Solution().minimumSwaps(new int[] {0, 1, 0, 3, 12}), equalTo(2));
    }

    @Test
    void minimumSwaps2() {
        assertThat(new Solution().minimumSwaps(new int[] {0, 1, 0, 2}), equalTo(1));
    }

    @Test
    void minimumSwaps3() {
        assertThat(new Solution().minimumSwaps(new int[] {1, 2, 0}), equalTo(0));
    }

    @Test
    void minimumSwaps4() {
        assertThat(new Solution().minimumSwaps(new int[] {0}), equalTo(0));
    }

    @Test
    void minimumSwaps5() {
        assertThat(new Solution().minimumSwaps(new int[] {1, 2, 3}), equalTo(0));
    }

    @Test
    void minimumSwaps6() {
        assertThat(new Solution().minimumSwaps(new int[] {0, 0, 0}), equalTo(0));
    }

    @Test
    void minimumSwaps7() {
        assertThat(new Solution().minimumSwaps(new int[] {0, 0, 1, 2}), equalTo(2));
    }
}
