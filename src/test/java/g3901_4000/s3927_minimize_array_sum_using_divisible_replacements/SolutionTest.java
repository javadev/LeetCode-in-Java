package g3901_4000.s3927_minimize_array_sum_using_divisible_replacements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minArraySum8() {
        int[] nums = new int[30000];
        java.util.Arrays.fill(nums, 100000);
        assertThat(new Solution().minArraySum(nums), equalTo(3000000000L));
    }

    @Test
    void minArraySum() {
        assertThat(new Solution().minArraySum(new int[] {3, 6, 2}), equalTo(7L));
    }

    @Test
    void minArraySum2() {
        assertThat(new Solution().minArraySum(new int[] {4, 2, 8, 3}), equalTo(9L));
    }

    @Test
    void minArraySum3() {
        assertThat(new Solution().minArraySum(new int[] {7, 5, 9}), equalTo(21L));
    }

    @Test
    void minArraySum4() {
        assertThat(new Solution().minArraySum(new int[] {100000, 1, 7}), equalTo(3L));
    }

    @Test
    void minArraySum5() {
        assertThat(new Solution().minArraySum(new int[] {8}), equalTo(8L));
    }

    @Test
    void minArraySum6() {
        assertThat(new Solution().minArraySum(new int[] {12, 6, 3, 2, 12}), equalTo(11L));
    }

    @Test
    void minArraySum7() {
        assertThat(new Solution().minArraySum(new int[] {5, 5, 5}), equalTo(15L));
    }
}
