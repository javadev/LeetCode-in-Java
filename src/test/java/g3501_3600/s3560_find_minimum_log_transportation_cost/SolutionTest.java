package g3501_3600.s3560_find_minimum_log_transportation_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCuttingCost() {
        assertThat(new Solution().minCuttingCost(6, 5, 5), equalTo(5L));
    }

    @Test
    void minCuttingCost2() {
        assertThat(new Solution().minCuttingCost(4, 4, 6), equalTo(0L));
    }

    @Test
    void minCuttingCost3() {
        assertThat(new Solution().minCuttingCost(0, 5, 3), equalTo(0L));
    }

    @Test
    void minCuttingCost4() {
        assertThat(new Solution().minCuttingCost(5, 0, 3), equalTo(0L));
    }

    @Test
    void minCuttingCost5() {
        assertThat(new Solution().minCuttingCost(5, 3, 0), equalTo(0L));
    }

    @Test
    void minCuttingCost6() {
        assertThat(new Solution().minCuttingCost(2, 2, 2), equalTo(0L));
    }

    @Test
    void minCuttingCost7() {
        assertThat(new Solution().minCuttingCost(1, 1, 3), equalTo(0L));
    }

    @Test
    void minCuttingCost8() {
        assertThat(new Solution().minCuttingCost(2, 5, 2), equalTo((5L - 2L) * 2L)); // 6
    }

    @Test
    void minCuttingCost9() {
        assertThat(new Solution().minCuttingCost(1, 10, 9), equalTo((10L - 9L) * 9L)); // 9
    }

    @Test
    void minCuttingCost10() {
        assertThat(new Solution().minCuttingCost(8, 3, 2), equalTo(0L));
    }

    @Test
    void minCuttingCost11() {
        assertThat(new Solution().minCuttingCost(11, 5, 9), equalTo((11L - 9L) * 9L));
    }

    @Test
    void minCuttingCost12() {
        assertThat(new Solution().minCuttingCost(10, 15, 2), equalTo(0L));
    }

    @Test
    void minCuttingCost13() {
        assertThat(
                new Solution().minCuttingCost(Integer.MAX_VALUE, Integer.MAX_VALUE, 2),
                equalTo(0L));
    }
}
