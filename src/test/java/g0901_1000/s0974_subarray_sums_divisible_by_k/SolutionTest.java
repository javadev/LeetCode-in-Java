package g0901_1000.s0974_subarray_sums_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarraysDivByK() {
        assertThat(new Solution().subarraysDivByK(new int[] {4, 5, 0, -2, -3, 1}, 5), equalTo(7));
    }

    @Test
    void subarraysDivByK2() {
        assertThat(new Solution().subarraysDivByK(new int[] {5}, 9), equalTo(0));
    }
}
