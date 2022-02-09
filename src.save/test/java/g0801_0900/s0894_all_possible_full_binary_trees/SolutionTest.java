package g0801_0900.s0894_all_possible_full_binary_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void allPossibleFBT() {
        assertThat(
                new Solution().allPossibleFBT(7).toString(),
                equalTo(
                        "[0,0,0,0,0,0,0, 0,0,0,0,0,0,0, 0,0,0,0,0,0,0, 0,0,0,0,0,0,0, 0,0,0,0,0,0,0]"));
    }

    @Test
    void allPossibleFBT2() {
        assertThat(new Solution().allPossibleFBT(3).toString(), equalTo("[0,0,0]"));
    }
}
