package g3701_3800.s3721_longest_balanced_subarray_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestBalanced() {
        assertThat(new Solution().longestBalanced(new int[] {2, 5, 4, 3}), equalTo(4));
    }

    @Test
    void longestBalanced2() {
        assertThat(new Solution().longestBalanced(new int[] {3, 2, 2, 5, 4}), equalTo(5));
    }

    @Test
    void longestBalanced3() {
        assertThat(new Solution().longestBalanced(new int[] {1, 2, 3, 2}), equalTo(3));
    }
}
