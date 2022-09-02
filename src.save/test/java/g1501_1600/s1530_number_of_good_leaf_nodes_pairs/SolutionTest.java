package g1501_1600.s1530_number_of_good_leaf_nodes_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, null, 4));
        assertThat(new Solution().countPairs(treeNode, 3), equalTo(1));
    }

    @Test
    void countPairs2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        assertThat(new Solution().countPairs(treeNode, 3), equalTo(2));
    }

    @Test
    void countPairs3() {
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(7, 1, 4, 6, null, 5, 3, null, null, null, null, null, 2));
        assertThat(new Solution().countPairs(treeNode, 3), equalTo(1));
    }
}
