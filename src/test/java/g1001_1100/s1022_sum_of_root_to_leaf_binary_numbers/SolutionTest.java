package g1001_1100.s1022_sum_of_root_to_leaf_binary_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumRootToLeaf() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 0, 1, 0, 1, 0, 1));
        assertThat(new Solution().sumRootToLeaf(root), equalTo(22));
    }

    @Test
    void sumRootToLeaf2() {
        TreeNode root = TreeNode.create(Collections.singletonList(0));
        assertThat(new Solution().sumRootToLeaf(root), equalTo(0));
    }
}
