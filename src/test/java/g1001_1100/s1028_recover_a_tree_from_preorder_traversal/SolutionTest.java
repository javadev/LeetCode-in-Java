package g1001_1100.s1028_recover_a_tree_from_preorder_traversal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void recoverFromPreorder() {
        TreeNode expected = TreeNode.create(Arrays.asList(1, 2, 5, 3, 4, 6, 7));
        assertThat(
                new Solution().recoverFromPreorder("1-2--3--4-5--6--7").toString(),
                equalTo(expected.toString()));
    }

    @Test
    void recoverFromPreorder2() {
        TreeNode expected = TreeNode.create(Arrays.asList(1, 2, 5, 3, null, 6, null, 4, null, 7));
        assertThat(
                new Solution().recoverFromPreorder("1-2--3---4-5--6---7").toString(),
                equalTo(expected.toString()));
    }

    @Test
    void recoverFromPreorder3() {
        TreeNode expected = TreeNode.create(Arrays.asList(1, 401, null, 349, 88, 90));
        assertThat(
                new Solution().recoverFromPreorder("1-401--349---90--88").toString(),
                equalTo(expected.toString()));
    }
}
