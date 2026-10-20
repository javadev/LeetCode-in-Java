package g3901_4000.s3962_maximum_subarray_sum_after_at_most_k_swaps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(new int[] {1, -1, 0, 2}, 1), equalTo(3L));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(new int[] {4, 3, 2, 4}, 2), equalTo(13L));
    }

    @Test
    void maxSum3() {
        assertThat(new Solution().maxSum(new int[] {-1, -2}, 0), equalTo(-1L));
    }

    @Test
    void maxSum4() {
        assertThat(new Solution().maxSum(new int[] {-5, -1, -3}, 1), equalTo(-1L));
    }

    @Test
    void maxSum5() {
        assertThat(
                new Solution().maxSum(new int[] {1, -10, 1, -10, 1, -10, 1}, 1), equalTo(3L));
    }

    @Test
    void maxSum6() {
        assertThat(
                new Solution()
                        .maxSum(new int[] {10, -1000, 10, -1000, 10, -1000, 10, -1000, 10}, 1),
                equalTo(30L));
    }

    @Test
    void maxSum7() {
        assertThat(new Solution().maxSum(new int[] {5, -1, -2, -3, 6}, 1), equalTo(11L));
    }

    @Test
    void maxSum8() {
        assertThat(new Solution().maxSum(new int[] {3, -5, 4, -5, 8}, 2), equalTo(15L));
    }

    @Test
    void maxSum9() {
        assertThat(new Solution().maxSum(new int[] {1, 1, 1, -100, 2}, 1), equalTo(5L));
    }

    @Test
    void maxSum10() {
        assertThat(new Solution().maxSum(new int[] {7}, 1), equalTo(7L));
    }

    @Test
    void swapContext() {
        Solution.SwapContext context =
                new Solution.SwapContext(new int[] {1, 2}, new int[] {1, 0}, new int[] {1, 1});
        assertThat(context.equals(context), equalTo(true));
        assertThat(context.equals(null), equalTo(false));
        assertThat(context.equals("swap"), equalTo(false));
        Solution.SwapContext same =
                new Solution.SwapContext(new int[] {1, 2}, new int[] {1, 0}, new int[] {1, 1});
        assertThat(context.equals(same), equalTo(true));
        assertThat(context.hashCode(), equalTo(same.hashCode()));
        Solution.SwapContext differentValues =
                new Solution.SwapContext(new int[] {1, 3}, new int[] {1, 0}, new int[] {1, 1});
        assertThat(context.equals(differentValues), equalTo(false));
        Solution.SwapContext differentIncluded =
                new Solution.SwapContext(new int[] {1, 2}, new int[] {0, 1}, new int[] {1, 1});
        assertThat(context.equals(differentIncluded), equalTo(false));
        Solution.SwapContext differentCounts =
                new Solution.SwapContext(new int[] {1, 2}, new int[] {1, 0}, new int[] {2, 1});
        assertThat(context.equals(differentCounts), equalTo(false));
        assertThat(
                context.toString(),
                equalTo("SwapContext[values=[1, 2], included=[1, 0], totalCounts=[1, 1]]"));
    }
}
