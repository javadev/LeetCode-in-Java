package g0201_0300.s0297_serialize_and_deserialize_binary_tree_hard_top_100_liked_questions_top_interview_questions_string_depth_first_search_breadth_first_search_tree_binary_tree_design;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.TreeNode;
import org.junit.Test;

public class CodecTest {
    @Test
    public void codec() {
        TreeNode treeNode =
                new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        Codec codec = new Codec();
        String actual = codec.serialize(treeNode);
        assertThat(actual, equalTo("3e93ea**3eb3ec**3ed**"));
        TreeNode result = codec.deserialize(actual);
        assertThat(result.toString(), equalTo("1,2,3,4,5"));
    }
}
