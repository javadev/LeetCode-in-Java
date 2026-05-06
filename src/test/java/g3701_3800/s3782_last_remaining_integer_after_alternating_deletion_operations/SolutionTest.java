package g3701_3800.s3782_last_remaining_integer_after_alternating_deletion_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastInteger() {
        assertThat(new Solution().lastInteger(8L), equalTo(3L));
    }

    @Test
    void lastInteger2() {
        assertThat(new Solution().lastInteger(5L), equalTo(1L));
    }

    @Test
    void lastInteger3() {
        assertThat(new Solution().lastInteger(1L), equalTo(1L));
    }
}
