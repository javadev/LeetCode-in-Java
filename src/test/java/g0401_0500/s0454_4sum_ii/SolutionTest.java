package g0401_0500.s0454_4sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fourSumCount() {
        assertThat(
                new Solution()
                        .fourSumCount(
                                new int[] {1, 2},
                                new int[] {-2, -1},
                                new int[] {-1, 2},
                                new int[] {0, 2}),
                equalTo(2));
    }

    @Test
    void fourSumCount2() {
        assertThat(
                new Solution()
                        .fourSumCount(new int[] {0}, new int[] {0}, new int[] {0}, new int[] {0}),
                equalTo(1));
    }
}
