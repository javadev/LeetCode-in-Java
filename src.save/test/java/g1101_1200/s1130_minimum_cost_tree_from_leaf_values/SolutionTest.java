package g1101_1200.s1130_minimum_cost_tree_from_leaf_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mctFromLeafValues() {
        assertThat(new Solution().mctFromLeafValues(new int[] {6, 2, 4}), equalTo(32));
    }

    @Test
    void mctFromLeafValues2() {
        assertThat(new Solution().mctFromLeafValues(new int[] {4, 11}), equalTo(44));
    }
}
