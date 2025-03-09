package g3401_3500.s3478_choose_k_elements_with_maximum_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxSum() {
        assertThat(
                new Solution()
                        .findMaxSum(new int[] {4, 2, 1, 5, 3}, new int[] {10, 20, 30, 40, 50}, 2),
                equalTo(new long[] {80L, 30L, 0L, 80L, 50L}));
    }

    @Test
    void findMaxSum2() {
        assertThat(
                new Solution().findMaxSum(new int[] {2, 2, 2, 2}, new int[] {3, 1, 2, 3}, 1),
                equalTo(new long[] {0L, 0L, 0L, 0L}));
    }
}
