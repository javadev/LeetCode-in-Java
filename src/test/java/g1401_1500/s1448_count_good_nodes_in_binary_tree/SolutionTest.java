package g1401_1500.s1448_count_good_nodes_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodNodes() {
        TreeNode root = TreeNode.create(Arrays.asList(3, 1, 4, 3, null, 1, 5));
        assertThat(new Solution().goodNodes(root), equalTo(4));
    }

    @Test
    void goodNodes2() {
        TreeNode root = TreeNode.create(Arrays.asList(3, 3, null, 4, 2));
        assertThat(new Solution().goodNodes(root), equalTo(3));
    }

    @Test
    void goodNodes3() {
        TreeNode root = TreeNode.create(Collections.singletonList(1));
        assertThat(new Solution().goodNodes(root), equalTo(1));
    }
}
