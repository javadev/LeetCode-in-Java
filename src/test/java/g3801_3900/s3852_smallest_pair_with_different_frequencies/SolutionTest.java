package g3801_3900.s3852_smallest_pair_with_different_frequencies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDistinctFreqPair() {
        assertThat(
                new Solution().minDistinctFreqPair(new int[] {1, 1, 2, 2, 3, 4}),
                equalTo(new int[] {1, 3}));
    }

    @Test
    void minDistinctFreqPair2() {
        assertThat(
                new Solution().minDistinctFreqPair(new int[] {1, 5}), equalTo(new int[] {-1, -1}));
    }

    @Test
    void minDistinctFreqPair3() {
        assertThat(new Solution().minDistinctFreqPair(new int[] {7}), equalTo(new int[] {-1, -1}));
    }
}
