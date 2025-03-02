package g3401_3500.s3469_find_minimum_cost_to_remove_array_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost(new int[] {6, 2, 8, 4}), equalTo(12));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost(new int[] {2, 1, 3, 3}), equalTo(5));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost(new int[] {83, 47, 66, 24, 57, 85, 16}), equalTo(224));
    }
}
