package g1301_1400.s1382_balance_a_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void balanceBST() {
        assertThat(
                new Solution()
                        .balanceBST(
                                TreeNode.create(
                                        Arrays.asList(1, null, 2, null, 3, null, 4, null, null)))
                        .toString(),
                equalTo("2,1,3,null,4"));
    }

    @Test
    void balanceBST2() {
        assertThat(
                new Solution().balanceBST(TreeNode.create(Arrays.asList(2, 1, 3))).toString(),
                equalTo("2,1,3"));
    }
}
