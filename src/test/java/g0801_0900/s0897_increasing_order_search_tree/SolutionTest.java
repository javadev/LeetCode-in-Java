package g0801_0900.s0897_increasing_order_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void increasingBST() {
        assertThat(
                new Solution()
                        .increasingBST(
                                TreeUtils.constructBinaryTree(
                                        Arrays.asList(
                                                5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9)))
                        .toString(),
                equalTo("1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9"));
    }

    @Test
    void increasingBST2() {
        assertThat(
                new Solution()
                        .increasingBST(TreeUtils.constructBinaryTree(Arrays.asList(5, 1, 7)))
                        .toString(),
                equalTo("1,null,5,null,7"));
    }
}
