package g3701_3800.s3794_reverse_string_prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reversePrefix() {
        assertThat(new Solution().reversePrefix("abcd", 2), equalTo("bacd"));
    }

    @Test
    void reversePrefix2() {
        assertThat(new Solution().reversePrefix("xyz", 3), equalTo("zyx"));
    }

    @Test
    void reversePrefix3() {
        assertThat(new Solution().reversePrefix("hey", 1), equalTo("hey"));
    }
}
