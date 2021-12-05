package g0301_0400.s0331_verify_preorder_serialization_of_a_binary_tree_medium_string_tree_binary_tree_stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void minPatches() {
        assertThat(new Solution().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"), equalTo(true));
    }
}
