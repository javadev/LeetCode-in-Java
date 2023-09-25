package g0901_1000.s0919_complete_binary_tree_inserter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class CBTInserterTest {
    @Test
    void cBTInserterTest() {
        TreeNode treeNode = TreeNode.create(Arrays.asList(1, 2));
        CBTInserter cBTInserter = new CBTInserter(treeNode);
        assertThat(cBTInserter.insert(3), equalTo(1));
        assertThat(cBTInserter.insert(4), equalTo(2));
        TreeNode expected = TreeNode.create(Arrays.asList(1, 2, 3, 4));
        assertThat(cBTInserter.getRoot().toString(), equalTo(expected.toString()));
    }
}
