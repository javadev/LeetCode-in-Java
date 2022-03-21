package g1301_1400.s1374_generate_a_string_with_characters_that_have_odd_counts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateTheString() {
        assertThat(new Solution().generateTheString(4), equalTo("aaaz"));
    }

    @Test
    void generateTheString2() {
        assertThat(new Solution().generateTheString(2), equalTo("az"));
    }

    @Test
    void generateTheString3() {
        assertThat(new Solution().generateTheString(7), equalTo("aaaaabz"));
    }
}
