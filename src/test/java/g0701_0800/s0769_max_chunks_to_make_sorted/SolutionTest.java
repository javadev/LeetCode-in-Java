package g0701_0800.s0769_max_chunks_to_make_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxChunksToSorted() {
        assertThat(new Solution().maxChunksToSorted(new int[] {4, 3, 2, 1, 0}), equalTo(1));
    }

    @Test
    void maxChunksToSorted2() {
        assertThat(new Solution().maxChunksToSorted(new int[] {1, 0, 2, 3, 4}), equalTo(4));
    }
}
