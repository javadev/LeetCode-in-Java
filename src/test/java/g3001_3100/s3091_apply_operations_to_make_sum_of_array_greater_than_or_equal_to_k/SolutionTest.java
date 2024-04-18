package g3001_3100.s3091_apply_operations_to_make_sum_of_array_greater_than_or_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations(11), equalTo(5));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations(1), equalTo(0));
    }
}
