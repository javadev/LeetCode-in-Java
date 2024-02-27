package g3001_3100.s3010_divide_an_array_into_subarrays_with_minimum_cost_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(new int[] {1, 2, 3, 12}), equalTo(6));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(new int[] {5, 4, 3}), equalTo(12));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost(new int[] {10, 3, 1, 1}), equalTo(12));
    }
}
