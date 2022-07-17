package g1601_1700.s1630_arithmetic_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkArithmeticSubarrays() {
        assertThat(
                new Solution()
                        .checkArithmeticSubarrays(
                                new int[] {4, 6, 5, 9, 3, 7},
                                new int[] {0, 0, 2},
                                new int[] {2, 3, 5}),
                equalTo(Arrays.asList(true, false, true)));
    }

    @Test
    void checkArithmeticSubarrays2() {
        assertThat(
                new Solution()
                        .checkArithmeticSubarrays(
                                new int[] {-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10},
                                new int[] {0, 1, 6, 4, 8, 7},
                                new int[] {4, 4, 9, 7, 9, 10}),
                equalTo(Arrays.asList(false, true, false, false, true, true)));
    }
}
