package g2801_2900.s2896_apply_operations_to_make_two_strings_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("1100011000", "0101001010", 2), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("10110", "00011", 4), equalTo(-1));
    }
}
