package g3601_3700.s3666_minimum_operations_to_equalize_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("110", 1), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("0101", 3), equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("101", 2), equalTo(-1));
    }
}
