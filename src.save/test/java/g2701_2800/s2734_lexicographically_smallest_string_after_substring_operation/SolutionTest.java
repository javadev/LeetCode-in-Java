package g2701_2800.s2734_lexicographically_smallest_string_after_substring_operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestString() {
        assertThat(new Solution().smallestString("cbabc"), equalTo("baabc"));
    }

    @Test
    void smallestString2() {
        assertThat(new Solution().smallestString("acbbc"), equalTo("abaab"));
    }

    @Test
    void smallestString3() {
        assertThat(new Solution().smallestString("leetcode"), equalTo("kddsbncd"));
    }
}
