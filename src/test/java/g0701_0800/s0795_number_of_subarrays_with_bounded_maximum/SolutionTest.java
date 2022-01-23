package g0701_0800.s0795_number_of_subarrays_with_bounded_maximum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSubarrayBoundedMax() {
        assertThat(new Solution().numSubarrayBoundedMax(new int[] {2, 1, 4, 3}, 2, 3), equalTo(3));
    }

    @Test
    void numSubarrayBoundedMax2() {
        assertThat(
                new Solution().numSubarrayBoundedMax(new int[] {2, 9, 2, 5, 6}, 2, 8), equalTo(7));
    }
}
