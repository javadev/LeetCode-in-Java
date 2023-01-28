package g0401_0500.s0449_serialize_and_deserialize_bst;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class CodecTest {
    @Test
    void serializeDeserialize() {
        TreeNode expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(1);
        expectedRoot.right = new TreeNode(4);
        expectedRoot.left.right = new TreeNode(2);
        assertThat(
                new Codec().deserialize(new Codec().serialize(expectedRoot)).toString(),
                equalTo(expectedRoot.toString()));
        assertThat(
                new Codec().deserialize(new Codec().serialize(expectedRoot)).toString(),
                equalTo(expectedRoot.toString()));
        assertThat(
                new Codec().deserialize(new Codec().serialize(expectedRoot)).toString(),
                equalTo(expectedRoot.toString()));
        assertThat(
                new Codec().deserialize(new Codec().serialize(expectedRoot)).toString(),
                equalTo(expectedRoot.toString()));
    }
}
