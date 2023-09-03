package g2301_2400.s2348_number_of_zero_filled_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void zeroFilledSubarray() {
        assertThat(
                new Solution().zeroFilledSubarray(new int[] {1, 3, 0, 0, 2, 0, 0, 4}), equalTo(6L));
    }

    @Test
    void zeroFilledSubarray2() {
        assertThat(new Solution().zeroFilledSubarray(new int[] {0, 0, 0, 2, 0, 0}), equalTo(9L));
    }

    @Test
    void zeroFilledSubarray3() {
        assertThat(new Solution().zeroFilledSubarray(new int[] {2, 10, 2019}), equalTo(0L));
    }
}
