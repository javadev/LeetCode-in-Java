package g3901_4000.s3980_minimum_operations_to_transform_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("11", "00"), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("01", "10"), equalTo(3));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("1", "0"), equalTo(-1));
    }
}
