package g0901_1000.s0984_string_without_aaa_or_bbb;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void strWithout3a3b() {
        assertThat(new Solution().strWithout3a3b(1, 2), equalTo("bba"));
    }

    @Test
    void strWithout3a3b2() {
        assertThat(new Solution().strWithout3a3b(4, 1), equalTo("aabaa"));
    }
}
