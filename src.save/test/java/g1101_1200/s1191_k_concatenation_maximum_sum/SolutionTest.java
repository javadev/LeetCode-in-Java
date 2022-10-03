package g1101_1200.s1191_k_concatenation_maximum_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kConcatenationMaxSum() {
        assertThat(new Solution().kConcatenationMaxSum(new int[] {1, 2}, 3), equalTo(9));
    }

    @Test
    void kConcatenationMaxSum2() {
        assertThat(new Solution().kConcatenationMaxSum(new int[] {1, -2, 1}, 5), equalTo(2));
    }

    @Test
    void kConcatenationMaxSum3() {
        assertThat(new Solution().kConcatenationMaxSum(new int[] {-1, -2}, 7), equalTo(0));
    }

    @Test
    void kConcatenationMaxSum4() {
        assertThat(new Solution().kConcatenationMaxSum(new int[] {-1, -2}, 1), equalTo(-1));
    }
}
