package g3501_3600.s3579_minimum_steps_to_convert_string_with_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("abcdf", "dacbe"), equalTo(4));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("abceded", "baecfef"), equalTo(4));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("abcdef", "fedabc"), equalTo(2));
    }
}
