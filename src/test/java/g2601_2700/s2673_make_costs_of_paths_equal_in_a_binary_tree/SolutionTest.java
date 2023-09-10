package g2601_2700.s2673_make_costs_of_paths_equal_in_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minIncrements() {
        assertThat(new Solution().minIncrements(7, new int[] {1, 5, 2, 2, 3, 3, 1}), equalTo(6));
    }

    @Test
    void minIncrements2() {
        assertThat(new Solution().minIncrements(3, new int[] {5, 3, 3}), equalTo(0));
    }
}
