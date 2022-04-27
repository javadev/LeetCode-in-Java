package g1401_1500.s1477_find_two_non_overlapping_sub_arrays_each_with_target_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSumOfLengths() {
        assertThat(new Solution().minSumOfLengths(new int[] {3, 2, 2, 4, 3}, 3), equalTo(2));
    }

    @Test
    void minSumOfLengths2() {
        assertThat(new Solution().minSumOfLengths(new int[] {7, 3, 4, 7}, 7), equalTo(2));
    }

    @Test
    void minSumOfLengths3() {
        assertThat(new Solution().minSumOfLengths(new int[] {4, 3, 2, 6, 2, 3, 4}, 6), equalTo(-1));
    }
}
