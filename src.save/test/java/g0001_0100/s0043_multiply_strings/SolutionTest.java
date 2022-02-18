package g0001_0100.s0043_multiply_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void multiply() {
        assertThat(new Solution().multiply("2", "3"), equalTo("6"));
    }
}
