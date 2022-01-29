package g0701_0800.s0768_max_chunks_to_make_sorted_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxChunksToSorted() {
        assertThat(new Solution().maxChunksToSorted(new int[] {5, 4, 3, 2, 1}), equalTo(1));
    }

    @Test
    void maxChunksToSorted2() {
        assertThat(new Solution().maxChunksToSorted(new int[] {2, 1, 3, 4, 4}), equalTo(4));
    }
}
