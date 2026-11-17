package g3901_4000.s3997_count_dominant_nodes_in_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDominantNodes() {
        TreeNode root = TreeNode.create(Arrays.asList(5, 3, 8, 2, 4, 7, 1));
        assertThat(new Solution().countDominantNodes(root), equalTo(5));
    }

    @Test
    void countDominantNodes2() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 2, 3, 1, 2));
        assertThat(new Solution().countDominantNodes(root), equalTo(4));
    }
}
