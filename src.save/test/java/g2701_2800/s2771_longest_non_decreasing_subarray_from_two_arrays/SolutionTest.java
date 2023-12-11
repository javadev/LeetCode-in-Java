package g2701_2800.s2771_longest_non_decreasing_subarray_from_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNonDecreasingLength() {
        assertThat(
                new Solution().maxNonDecreasingLength(new int[] {2, 3, 1}, new int[] {1, 2, 1}),
                equalTo(2));
    }

    @Test
    void maxNonDecreasingLength2() {
        assertThat(
                new Solution()
                        .maxNonDecreasingLength(new int[] {1, 3, 2, 1}, new int[] {2, 2, 3, 4}),
                equalTo(4));
    }
}
