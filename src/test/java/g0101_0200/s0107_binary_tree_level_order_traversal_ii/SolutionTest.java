package g0101_0200.s0107_binary_tree_level_order_traversal_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void binaryTreeLevelOrderTraversalII() {
        TreeNode bottomLeft = new TreeNode(15);
        TreeNode bottomRight = new TreeNode(7);
        TreeNode upRight = new TreeNode(20, bottomLeft, bottomRight);
        TreeNode upLeft = new TreeNode(9);
        TreeNode root = new TreeNode(3, upLeft, upRight);

        List<List<Integer>> actual = new Solution().levelOrderBottom(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15, 7));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(3));

        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i), equalTo(expected.get(i)));
        }
    }
}
