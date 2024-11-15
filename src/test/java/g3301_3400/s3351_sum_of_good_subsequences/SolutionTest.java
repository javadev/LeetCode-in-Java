package g3301_3400.s3351_sum_of_good_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfGoodSubsequences() {
        assertThat(new Solution().sumOfGoodSubsequences(new int[] {1, 2, 1}), equalTo(14));
    }

    @Test
    void sumOfGoodSubsequences2() {
        assertThat(new Solution().sumOfGoodSubsequences(new int[] {3, 4, 5}), equalTo(40));
    }
}
