package g1701_1800.s1774_closest_dessert_cost;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestCost() {
        assertThat(new Solution().closestCost(new int[] {1, 7}, new int[] {3, 4}, 10), equalTo(10));
    }

    @Test
    void closestCost2() {
        assertThat(
                new Solution().closestCost(new int[] {2, 3}, new int[] {4, 5, 100}, 18),
                equalTo(17));
    }

    @Test
    void closestCost3() {
        assertThat(new Solution().closestCost(new int[] {3, 10}, new int[] {2, 5}, 9), equalTo(8));
    }
}
