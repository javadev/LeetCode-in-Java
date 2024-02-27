package g3001_3100.s3013_divide_an_array_into_subarrays_with_minimum_cost_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(new int[] {1, 3, 2, 6, 4, 2}, 3, 3), equalTo(5L));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(new int[] {10, 1, 2, 2, 2, 1}, 4, 3), equalTo(15L));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost(new int[] {10, 8, 18, 9}, 3, 1), equalTo(36L));
    }
}
