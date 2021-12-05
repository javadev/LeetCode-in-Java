package g0001_0100.s0096_unique_binary_search_trees_medium_top_100_liked_questions_dynamic_programming_math_tree_binary_tree_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void numTrees() {
        assertThat(new Solution().numTrees(3), equalTo(5));
        assertThat(new Solution().numTrees(1), equalTo(1));
    }
}
