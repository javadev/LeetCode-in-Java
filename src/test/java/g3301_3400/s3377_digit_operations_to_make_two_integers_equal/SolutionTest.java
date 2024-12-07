package g3301_3400.s3377_digit_operations_to_make_two_integers_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(10, 12), equalTo(85));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(4, 8), equalTo(-1));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations(6, 2), equalTo(-1));
    }
}
