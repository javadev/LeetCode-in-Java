package g0901_1000.s0967_numbers_with_same_consecutive_differences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numsSameConsecDiff() {
        assertThat(
                new Solution().numsSameConsecDiff(3, 7),
                equalTo(new int[] {181, 292, 707, 818, 929}));
    }

    @Test
    void numsSameConsecDiff2() {
        assertThat(
                new Solution().numsSameConsecDiff(2, 1),
                equalTo(
                        new int[] {
                            10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98
                        }));
    }
}
