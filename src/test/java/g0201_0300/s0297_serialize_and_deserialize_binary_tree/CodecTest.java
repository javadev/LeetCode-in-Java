package g0201_0300.s0297_serialize_and_deserialize_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class CodecTest {
    @Test
    void codec() {
        TreeNode treeNode =
                new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        Codec codec = new Codec();
        String actual = codec.serialize(treeNode);
        assertThat(actual, equalTo("3e93ea**3eb3ec**3ed**"));
        TreeNode result = codec.deserialize(actual);
        assertThat(result.toString(), equalTo("1,2,3,4,5"));
    }
}
