package g0101_0200.s0173_binary_search_tree_iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class BSTIteratorTest {

    @Test
    void iteratorBST() {
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(15, new TreeNode(9), new TreeNode(20));
        TreeNode root = new TreeNode(7, left, right);
        BSTIterator iterator = new BSTIterator(root);
        assertThat(iterator.next(), equalTo(3));
        assertThat(iterator.next(), equalTo(7));
        assertThat(iterator.hasNext(), equalTo(true));
        assertThat(iterator.next(), equalTo(9));
        assertThat(iterator.hasNext(), equalTo(true));
        assertThat(iterator.next(), equalTo(15));
        assertThat(iterator.hasNext(), equalTo(true));
        assertThat(iterator.next(), equalTo(20));
        assertThat(iterator.hasNext(), equalTo(false));
    }
}
