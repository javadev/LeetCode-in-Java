package g0801_0900.s0823_binary_trees_with_factors;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void numFactoredBinaryTrees() {
        assertThat(new Solution().numFactoredBinaryTrees(new int[]{2,4}), equalTo(3));
    }

    @Test
    void numFactoredBinaryTrees2() {
        assertThat(new Solution().numFactoredBinaryTrees(new int[]{2,4,5,10}), equalTo(7));
    }
}
