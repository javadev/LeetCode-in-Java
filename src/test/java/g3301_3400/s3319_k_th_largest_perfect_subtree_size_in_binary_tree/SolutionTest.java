package g3301_3400.s3319_k_th_largest_perfect_subtree_size_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthLargestPerfectSubtree() {
        assertThat(
                new Solution()
                        .kthLargestPerfectSubtree(
                                TreeNode.create(
                                        Arrays.asList(5, 3, 6, 5, 2, 5, 7, 1, 8, null, null, 6, 8)),
                                2),
                equalTo(3));
    }

    @Test
    void kthLargestPerfectSubtree2() {
        assertThat(
                new Solution()
                        .kthLargestPerfectSubtree(
                                TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6, 7)), 1),
                equalTo(7));
    }

    @Test
    void kthLargestPerfectSubtree3() {
        assertThat(
                new Solution()
                        .kthLargestPerfectSubtree(
                                TreeNode.create(Arrays.asList(1, 2, 3, null, 4)), 3),
                equalTo(-1));
    }
}
