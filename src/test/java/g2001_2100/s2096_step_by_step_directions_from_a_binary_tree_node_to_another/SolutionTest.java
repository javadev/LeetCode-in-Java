package g2001_2100.s2096_step_by_step_directions_from_a_binary_tree_node_to_another;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getDirections() {
        assertThat(
                new Solution()
                        .getDirections(
                                TreeNode.create(Arrays.asList(5, 1, 2, 3, null, 6, 4)), 3, 6),
                equalTo("UURL"));
    }

    @Test
    void getDirections2() {
        assertThat(
                new Solution().getDirections(TreeNode.create(Arrays.asList(2, 1)), 2, 1),
                equalTo("L"));
    }
}
