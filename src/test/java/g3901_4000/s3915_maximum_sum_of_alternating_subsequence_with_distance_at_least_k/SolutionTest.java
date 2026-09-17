package g3901_4000.s3915_maximum_sum_of_alternating_subsequence_with_distance_at_least_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAlternatingSum() {
        int[] nums = new int[30000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 2 == 0 ? 100000 : 99999;
        }
        assertThat(new Solution().maxAlternatingSum(nums, 1), equalTo(2999985000L));
    }

    @Test
    void maxAlternatingSum2() {
        assertThat(new Solution().maxAlternatingSum(new int[] {5, 4, 2}, 2), equalTo(7L));
    }

    @Test
    void maxAlternatingSum3() {
        assertThat(new Solution().maxAlternatingSum(new int[] {3, 5, 4, 2, 4}, 1), equalTo(14L));
    }

    @Test
    void maxAlternatingSum4() {
        assertThat(new Solution().maxAlternatingSum(new int[] {5}, 1), equalTo(5L));
    }

    @Test
    void maxAlternatingSum5() {
        assertThat(new Solution().maxAlternatingSum(new int[] {4, 4, 4}, 1), equalTo(4L));
    }

    @Test
    void maxAlternatingSum6() {
        assertThat(new Solution().maxAlternatingSum(new int[] {3, 9, 4}, 3), equalTo(9L));
    }

    @Test
    void maxAlternatingSum7() {
        assertThat(new Solution().maxAlternatingSum(new int[] {1, 2, 3, 4}, 1), equalTo(7L));
    }

    @Test
    void maxAlternatingSum8() {
        assertThat(new Solution().maxAlternatingSum(new int[] {4, 3, 2, 1}, 1), equalTo(7L));
    }

    @Test
    void maxAlternatingSum9() {
        assertThat(new Solution().maxAlternatingSum(new int[] {2, 5, 1, 4, 2}, 1), equalTo(14L));
    }

    @Test
    void maxAlternatingSum10() {
        assertThat(new Solution().maxAlternatingSum(new int[] {5, 1, 4, 2, 6}, 2), equalTo(15L));
    }
}
