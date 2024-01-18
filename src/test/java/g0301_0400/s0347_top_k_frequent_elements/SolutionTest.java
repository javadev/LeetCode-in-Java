package g0301_0400.s0347_top_k_frequent_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void topKFrequent() {
        assertThat(
                new Solution().topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2),
                equalTo(new int[] {1, 2}));
    }

    @Test
    void topKFrequent2() {
        assertThat(new Solution().topKFrequent(new int[] {1}, 1), equalTo(new int[] {1}));
    }
}
