package g0901_1000.s0998_maximum_binary_tree_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void insertIntoMaxTree() {
        assertThat(
                new Solution()
                        .insertIntoMaxTree(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(4, 1, 3, null, null, 2)),
                                5)
                        .toString(),
                equalTo("5,4,1,3,2,null,null"));
    }

    @Test
    void insertIntoMaxTree2() {
        assertThat(
                new Solution()
                        .insertIntoMaxTree(
                                TreeUtils.constructBinaryTree(Arrays.asList(5, 2, 4, null, 1)), 3)
                        .toString(),
                equalTo("5,2,null,1,4,null,3"));
    }

    @Test
    void insertIntoMaxTree3() {
        assertThat(
                new Solution()
                        .insertIntoMaxTree(
                                TreeUtils.constructBinaryTree(Arrays.asList(5, 2, 3, null, 1)), 4)
                        .toString(),
                equalTo("5,2,null,1,4,3,null"));
    }
}
