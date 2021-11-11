package g0101_0200.s0113_path_sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void pathSumII() {
        TreeNode fourthLevelLeftMostLeft = new TreeNode(7);
        TreeNode fourthLevelLeftMostRight = new TreeNode(2);

        TreeNode thirtLevelLeftMostRoot =
                new TreeNode(11, fourthLevelLeftMostLeft, fourthLevelLeftMostRight);

        TreeNode secondLevelLeftMostRoot = new TreeNode(4, thirtLevelLeftMostRoot, null);

        TreeNode fourthLevelRightMostRight = new TreeNode(1);
        TreeNode fourthLevelRightMostLeft = new TreeNode(5);

        TreeNode thirdLevelRightRoot =
                new TreeNode(4, fourthLevelRightMostRight, fourthLevelRightMostLeft);
        TreeNode thirdLevelLeftRoot = new TreeNode(13);

        TreeNode secondLevelRightRoot = new TreeNode(8, thirdLevelLeftRoot, thirdLevelRightRoot);

        TreeNode root = new TreeNode(5, secondLevelLeftMostRoot, secondLevelRightRoot);

        List<List<Integer>> actual = new Solution().pathSum(root, 22);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5, 4, 11, 2));
        expected.add(Arrays.asList(5, 8, 4, 5));

        for (int i = 0; i < actual.size(); i++) {
            assertThat(actual.get(i), equalTo(expected.get(i)));
        }
    }
}
