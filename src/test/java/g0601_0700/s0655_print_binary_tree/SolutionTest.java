package g0601_0700.s0655_print_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void printTree() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2));
        List<List<String>> expected =
                Arrays.asList(Arrays.asList("", "1", ""), Arrays.asList("2", "", ""));
        assertThat(new Solution().printTree(treeNode), equalTo(expected));
    }

    @Test
    void printTree2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, null, 4));
        List<List<String>> expected =
                Arrays.asList(
                        Arrays.asList("", "", "", "1", "", "", ""),
                        Arrays.asList("", "2", "", "", "", "3", ""),
                        Arrays.asList("", "", "4", "", "", "", ""));
        assertThat(new Solution().printTree(treeNode), equalTo(expected));
    }
}
