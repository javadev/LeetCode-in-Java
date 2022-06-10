package g2201_2300.s2236_root_equals_sum_of_children;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkTree() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(10, 4, 6));
        assertThat(new Solution().checkTree(treeNode), equalTo(true));
    }

    @Test
    void checkTree2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(5, 3, 1));
        assertThat(new Solution().checkTree(treeNode), equalTo(false));
    }
}
