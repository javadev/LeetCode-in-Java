package g0901_1000.s0949_largest_time_for_given_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestTimeFromDigits() {
        assertThat(new Solution().largestTimeFromDigits(new int[] {1, 2, 3, 4}), equalTo("23:41"));
    }

    @Test
    void largestTimeFromDigits2() {
        assertThat(new Solution().largestTimeFromDigits(new int[] {5, 5, 5, 5}), equalTo(""));
    }
}
