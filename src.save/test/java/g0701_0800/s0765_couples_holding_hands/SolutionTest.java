package g0701_0800.s0765_couples_holding_hands;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwapsCouples() {
        assertThat(new Solution().minSwapsCouples(new int[] {0, 2, 1, 3}), equalTo(1));
    }

    @Test
    void minSwapsCouples2() {
        assertThat(
                new Solution().minSwapsCouples(new int[] {0, 4, 7, 3, 1, 5, 2, 8, 6, 9}),
                equalTo(3));
    }

    @Test
    void minSwapsCouples3() {
        assertThat(
                new Solution().minSwapsCouples(new int[] {5, 6, 4, 0, 2, 1, 9, 3, 8, 7, 11, 10}),
                equalTo(4));
    }
}
