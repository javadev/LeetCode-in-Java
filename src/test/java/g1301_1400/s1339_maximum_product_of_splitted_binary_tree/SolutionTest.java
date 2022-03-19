package g1301_1400.s1339_maximum_product_of_splitted_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(new Solution().maxProduct(treeNode), equalTo(110));
    }

    @Test
    void maxProduct2() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, null, 2, 3, 4, null, null, 5, 6));
        assertThat(new Solution().maxProduct(treeNode), equalTo(90));
    }
}
