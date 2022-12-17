package g0301_0400.s0331_verify_preorder_serialization_of_a_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minPatches() {
        assertThat(new Solution().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"), equalTo(true));
    }

    @Test
    void minPatches2() {
        assertThat(new Solution().isValidSerialization("1,#"), equalTo(false));
    }

    @Test
    void minPatches3() {
        assertThat(new Solution().isValidSerialization("9,#,#,1"), equalTo(false));
    }
}
