package g1901_2000.s1911_maximum_alternating_subsequence_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAlternatingSum() {
        assertThat(new Solution().maxAlternatingSum(new int[] {4, 2, 5, 3}), equalTo(7L));
    }

    @Test
    void maxAlternatingSum2() {
        assertThat(new Solution().maxAlternatingSum(new int[] {5, 6, 7, 8}), equalTo(8L));
    }

    @Test
    void maxAlternatingSum3() {
        assertThat(new Solution().maxAlternatingSum(new int[] {6, 2, 1, 2, 4, 5}), equalTo(10L));
    }
}
