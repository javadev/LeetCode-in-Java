package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void averageOfSubtree() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(4, 8, 5, 0, 1, null, 6));
        assertThat(new Solution().averageOfSubtree(root), equalTo(5));
    }

    @Test
    void averageOfSubtree2() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        assertThat(new Solution().averageOfSubtree(root), equalTo(1));
    }
}
