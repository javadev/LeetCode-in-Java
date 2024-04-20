package g1001_1100.s1043_partition_array_for_maximum_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumAfterPartitioning() {
        assertThat(
                new Solution().maxSumAfterPartitioning(new int[] {1, 15, 7, 9, 2, 5, 10}, 3),
                equalTo(84));
    }

    @Test
    void maxSumAfterPartitioning2() {
        assertThat(
                new Solution()
                        .maxSumAfterPartitioning(new int[] {1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3}, 4),
                equalTo(83));
    }

    @Test
    void maxSumAfterPartitioning3() {
        assertThat(new Solution().maxSumAfterPartitioning(new int[] {1}, 1), equalTo(1));
    }
}
