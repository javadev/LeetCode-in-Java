package g1101_1200.s1145_binary_tree_coloring_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void btreeGameWinningMove() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        assertThat(new Solution().btreeGameWinningMove(root, 11, 3), equalTo(true));
    }

    @Test
    void btreeGameWinningMove2() {
        TreeNode root = TreeNode.create(Arrays.asList(1, 2, 3));
        assertThat(new Solution().btreeGameWinningMove(root, 3, 1), equalTo(false));
    }
}
