package g0601_0700.s0606_construct_string_from_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void tree2str() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, 4));
        assertThat(new Solution().tree2str(treeNode), equalTo("1(2(4))(3)"));
    }

    @Test
    void tree2str2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, null, 4));
        assertThat(new Solution().tree2str(treeNode), equalTo("1(2()(4))(3)"));
    }
}
