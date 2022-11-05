package g0901_1000.s0968_binary_tree_cameras;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCameraCover() {
        assertThat(
                new Solution().minCameraCover(TreeNode.create(Arrays.asList(0, 0, null, 0, 0))),
                equalTo(1));
    }

    @Test
    void minCameraCover2() {
        assertThat(
                new Solution()
                        .minCameraCover(
                                TreeNode.create(
                                        Arrays.asList(0, 0, null, 0, null, 0, null, null, 0))),
                equalTo(2));
    }
}
