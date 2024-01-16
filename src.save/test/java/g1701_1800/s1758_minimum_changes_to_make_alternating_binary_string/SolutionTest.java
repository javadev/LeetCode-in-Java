package g1701_1800.s1758_minimum_changes_to_make_alternating_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("0100"), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("10"), equalTo(0));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("1111"), equalTo(2));
    }
}
