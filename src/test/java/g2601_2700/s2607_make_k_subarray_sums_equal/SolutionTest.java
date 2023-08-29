package g2601_2700.s2607_make_k_subarray_sums_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeSubKSumEqual() {
        assertThat(new Solution().makeSubKSumEqual(new int[] {1, 4, 1, 3}, 2), equalTo(1L));
    }

    @Test
    void makeSubKSumEqual2() {
        assertThat(new Solution().makeSubKSumEqual(new int[] {2, 5, 5, 7}, 3), equalTo(5L));
    }
}
