package g3801_3900.s3830_longest_alternating_subarray_after_removing_at_most_one_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestAlternating() {
        assertThat(new Solution().longestAlternating(new int[] {2, 1, 3, 2}), equalTo(4));
    }

    @Test
    void longestAlternating2() {
        assertThat(new Solution().longestAlternating(new int[] {3, 2, 1, 2, 3, 2, 1}), equalTo(4));
    }

    @Test
    void longestAlternating3() {
        assertThat(new Solution().longestAlternating(new int[] {100000, 100000}), equalTo(1));
    }
}
