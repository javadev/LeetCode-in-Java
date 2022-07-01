package g0201_0300.s0230_kth_smallest_element_in_a_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallest() {
        TreeNode root = TreeNode.create(Arrays.asList(3, 1, 4, null, 2));
        assertThat(new Solution().kthSmallest(root, 1), equalTo(1));
    }

    @Test
    void kthSmallest2() {
        TreeNode root = TreeNode.create(Arrays.asList(5, 3, 6, 2, 4, null, null, 1));
        assertThat(new Solution().kthSmallest(root, 3), equalTo(3));
    }
}
