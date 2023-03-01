package g2101_2200.s2144_minimum_cost_of_buying_candies_with_discount;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(new Solution().minimumCost(new int[] {1, 2, 3}), equalTo(5));
    }

    @Test
    void minimumCost2() {
        assertThat(new Solution().minimumCost(new int[] {6, 5, 7, 9, 2, 2}), equalTo(23));
    }

    @Test
    void minimumCost3() {
        assertThat(new Solution().minimumCost(new int[] {5, 5}), equalTo(10));
    }
}
