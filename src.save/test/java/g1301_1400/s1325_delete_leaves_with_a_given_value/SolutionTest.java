package g1301_1400.s1325_delete_leaves_with_a_given_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeLeafNodes() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, 2, null, 2, 4));
        TreeNode expected = TreeNode.create(Arrays.asList(1, null, 3, null, 4));
        assertThat(
                new Solution().removeLeafNodes(treeNode, 2).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void removeLeafNodes2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 3, 3, 3, 2));
        TreeNode expected = TreeNode.create(Arrays.asList(1, 3, null, null, 2));
        assertThat(
                new Solution().removeLeafNodes(treeNode, 3).toString(),
                equalTo(expected.toString()));
    }

    @Test
    void removeLeafNodes3() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, null, 2, null, 2));
        TreeNode expected = TreeNode.create(Collections.singletonList(1));
        assertThat(
                new Solution().removeLeafNodes(treeNode, 2).toString(),
                equalTo(expected.toString()));
    }
}
