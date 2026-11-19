package g4001_4100.s4021_minimum_operations_to_make_a_rotated_palindrome_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("abc"), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("yb"), equalTo(3));
    }
}
