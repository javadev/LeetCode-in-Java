package g1301_1400.s1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getTargetCopy() {
        TreeNode original = TreeNode.create(Arrays.asList(7, 4, 3, null, null, 6, 19));
        TreeNode cloned = TreeNode.create(Arrays.asList(7, 4, 3, null, null, 6, 19));
        TreeNode target = TreeNode.create(Arrays.asList(3, 6, 19));
        assertThat(
                new Solution().getTargetCopy(original, cloned, target).toString(),
                equalTo("3,6,19"));
    }

    @Test
    void getTargetCopy2() {
        TreeNode original = TreeNode.create(Arrays.asList(7));
        TreeNode cloned = TreeNode.create(Arrays.asList(7));
        TreeNode target = TreeNode.create(Arrays.asList(7));
        assertThat(new Solution().getTargetCopy(original, cloned, target).toString(), equalTo("7"));
    }

    @Test
    void getTargetCopy3() {
        TreeNode original =
                TreeNode.create(
                        Arrays.asList(8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1));
        TreeNode cloned =
                TreeNode.create(
                        Arrays.asList(8, null, 6, null, 5, null, 4, null, 3, null, 2, null, 1));
        TreeNode target = TreeNode.create(Arrays.asList(4, null, 3, null, 2, null, 1));
        assertThat(
                new Solution().getTargetCopy(original, cloned, target).toString(),
                equalTo("4,null,3,null,2,null,1"));
    }

    @Test
    void getTargetCopy4() {
        TreeNode original = TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        TreeNode cloned = TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        TreeNode target = TreeNode.create(Arrays.asList(5, 10));
        assertThat(
                new Solution().getTargetCopy(original, cloned, target).toString(),
                equalTo("5,10,null"));
    }

    @Test
    void getTargetCopy5() {
        TreeNode original = TreeNode.create(Arrays.asList(1, 2, null, 3));
        TreeNode cloned = TreeNode.create(Arrays.asList(1, 2, null, 3));
        TreeNode target = TreeNode.create(Arrays.asList(2, 3));
        assertThat(
                new Solution().getTargetCopy(original, cloned, target).toString(),
                equalTo("2,3,null"));
    }
}
