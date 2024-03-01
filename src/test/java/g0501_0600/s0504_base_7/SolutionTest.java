package g0501_0600.s0504_base_7;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convertToBase7() {
        assertThat(new Solution().convertToBase7(100), equalTo("202"));
    }

    @Test
    void convertToBase72() {
        assertThat(new Solution().convertToBase7(-7), equalTo("-10"));
    }
}
