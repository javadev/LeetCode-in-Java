package g0101_0200.s0114_flatten_binary_tree_to_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flatten() {
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 5, 3, 4, null, 6));
        new Solution().flatten(root);
        assertThat(root.toString(), equalTo("1,null,2,null,3,null,4,null,5,null,6"));
    }

    @Test
    void flatten2() {
        TreeNode root = TreeUtils.constructBinaryTree(Collections.singletonList(0));
        new Solution().flatten(root);
        assertThat(root.toString(), equalTo("0"));
    }
}
