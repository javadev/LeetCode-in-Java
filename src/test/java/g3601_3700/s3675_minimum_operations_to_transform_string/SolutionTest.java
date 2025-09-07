package g3601_3700.s3675_minimum_operations_to_transform_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("yz"), equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("a"), equalTo(0));
    }
}
