package g0101_0200.s0102_binary_tree_level_order_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void binaryTreeLevelOrderTraversal() {
        TreeNode left = new TreeNode(9, null, null);
        TreeNode right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, left, right);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));

        List<List<Integer>> actual = new Solution().levelOrder(root);

        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i), equalTo(expected.get(i)));
        }
    }
}
