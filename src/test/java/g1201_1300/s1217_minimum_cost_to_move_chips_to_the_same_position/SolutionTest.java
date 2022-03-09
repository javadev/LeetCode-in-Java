package g1201_1300.s1217_minimum_cost_to_move_chips_to_the_same_position;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCostToMoveChips() {
        assertThat(new Solution().minCostToMoveChips(new int[] {1, 2, 3}), equalTo(1));
    }

    @Test
    void minCostToMoveChips2() {
        assertThat(new Solution().minCostToMoveChips(new int[] {2, 2, 2, 3, 3}), equalTo(2));
    }

    @Test
    void minCostToMoveChips3() {
        assertThat(new Solution().minCostToMoveChips(new int[] {1, 1000000000}), equalTo(1));
    }
}
