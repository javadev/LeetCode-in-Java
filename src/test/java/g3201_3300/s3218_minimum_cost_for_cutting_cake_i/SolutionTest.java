package g3201_3300.s3218_minimum_cost_for_cutting_cake_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(3, 2, new int[] {1, 3}, new int[] {5}), equalTo(13));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(2, 2, new int[] {7}, new int[] {4}), equalTo(15));
    }
}
