package g0801_0900.s0888_fair_candy_swap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fairCandySwap() {
        assertThat(
                new Solution().fairCandySwap(new int[] {1, 1}, new int[] {2, 2}),
                equalTo(new int[] {1, 2}));
    }

    @Test
    void fairCandySwap2() {
        assertThat(
                new Solution().fairCandySwap(new int[] {1, 2}, new int[] {2, 3}),
                equalTo(new int[] {1, 2}));
    }

    @Test
    void fairCandySwap3() {
        assertThat(
                new Solution().fairCandySwap(new int[] {2}, new int[] {1, 3}),
                equalTo(new int[] {2, 3}));
    }
}
