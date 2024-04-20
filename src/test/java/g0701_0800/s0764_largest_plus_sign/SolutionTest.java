package g0701_0800.s0764_largest_plus_sign;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void orderOfLargestPlusSign() {
        assertThat(new Solution().orderOfLargestPlusSign(5, new int[][] {{4, 2}}), equalTo(2));
    }

    @Test
    void orderOfLargestPlusSign2() {
        assertThat(new Solution().orderOfLargestPlusSign(1, new int[][] {{0, 0}}), equalTo(0));
    }
}
