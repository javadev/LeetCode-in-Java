package g2901_3000.s2967_minimum_cost_to_make_array_equalindromic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(new int[] {1, 2, 3, 4, 5}), equalTo(6L));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(new int[] {10, 12, 13, 14, 15}), equalTo(11L));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost(new int[] {22, 33, 22, 33, 22}), equalTo(22L));
    }
}
