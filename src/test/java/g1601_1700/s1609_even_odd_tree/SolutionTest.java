package g1601_1700.s1609_even_odd_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isEvenOddTree() {
        TreeNode treeNode =
                TreeNode.create(Arrays.asList(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2));
        assertThat(new Solution().isEvenOddTree(treeNode), equalTo(true));
    }

    @Test
    void isEvenOddTree2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(5, 4, 2, 3, 3, 7));
        assertThat(new Solution().isEvenOddTree(treeNode), equalTo(false));
    }

    @Test
    void isEvenOddTree3() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(5, 9, 1, 3, 5, 7));
        assertThat(new Solution().isEvenOddTree(treeNode), equalTo(false));
    }
}
