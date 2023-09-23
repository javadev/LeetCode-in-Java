package g2701_2800.s2735_collecting_chocolates;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(new int[] {20, 1, 15}, 5), equalTo(13L));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[] {1, 2, 3}, 4), equalTo(6L));
    }
}
