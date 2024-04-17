package g3001_3100.s3083_existence_of_a_substring_in_a_string_and_its_reverse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSubstringPresent() {
        assertThat(new Solution().isSubstringPresent("leetcode"), equalTo(true));
    }

    @Test
    void isSubstringPresent2() {
        assertThat(new Solution().isSubstringPresent("abcba"), equalTo(true));
    }

    @Test
    void isSubstringPresent3() {
        assertThat(new Solution().isSubstringPresent("abcd"), equalTo(false));
    }
}
