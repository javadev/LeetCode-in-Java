package g0901_1000.s0952_largest_component_size_by_common_factor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestComponentSize() {
        assertThat(new Solution().largestComponentSize(new int[] {4, 6, 15, 35}), equalTo(4));
    }

    @Test
    void largestComponentSize2() {
        assertThat(new Solution().largestComponentSize(new int[] {20, 50, 9, 63}), equalTo(2));
    }

    @Test
    void largestComponentSize3() {
        assertThat(
                new Solution().largestComponentSize(new int[] {2, 3, 6, 7, 4, 12, 21, 39}),
                equalTo(8));
    }
}
