package g0201_0300.s0257_binary_tree_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void binaryTreePaths() {
        TreeNode treeNode =
                new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        assertThat(
                new Solution().binaryTreePaths(treeNode),
                equalTo(Arrays.asList("1->2->5", "1->3")));
    }

    @Test
    void binaryTreePaths2() {
        TreeNode treeNode = new TreeNode(1);
        assertThat(new Solution().binaryTreePaths(treeNode), equalTo(Arrays.asList("1")));
    }
}
