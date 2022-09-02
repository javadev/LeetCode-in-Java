package g0501_0600.s0508_most_frequent_subtree_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findFrequentTreeSum() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(5, 2, -3));
        int[] expected = new int[] {2, -3, 4};
        assertThat(new Solution().findFrequentTreeSum(treeNode), equalTo(expected));
    }

    @Test
    void findFrequentTreeSum2() {
        TreeNode treeNode = TreeUtils.constructBinaryTree(Arrays.asList(5, 2, -5));
        int[] expected = new int[] {2};
        assertThat(new Solution().findFrequentTreeSum(treeNode), equalTo(expected));
    }
}
