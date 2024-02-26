package g2901_3000.s2958_length_of_longest_subarray_with_at_most_k_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarrayLength() {
        assertThat(
                new Solution().maxSubarrayLength(new int[] {1, 2, 3, 1, 2, 3, 1, 2}, 2),
                equalTo(6));
    }

    @Test
    void maxSubarrayLength2() {
        assertThat(
                new Solution().maxSubarrayLength(new int[] {1, 2, 1, 2, 1, 2, 1, 2}, 1),
                equalTo(2));
    }

    @Test
    void maxSubarrayLength3() {
        assertThat(
                new Solution().maxSubarrayLength(new int[] {5, 5, 5, 5, 5, 5, 5}, 4), equalTo(4));
    }
}
