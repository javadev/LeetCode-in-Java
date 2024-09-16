package g3201_3300.s3291_minimum_number_of_valid_strings_to_form_target_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minValidStrings() {
        assertThat(
                new Solution().minValidStrings(new String[] {"abc", "aaaaa", "bcdef"}, "aabcdabc"),
                equalTo(3));
    }

    @Test
    void minValidStrings2() {
        assertThat(
                new Solution().minValidStrings(new String[] {"abababab", "ab"}, "ababaababa"),
                equalTo(2));
    }

    @Test
    void minValidStrings3() {
        assertThat(new Solution().minValidStrings(new String[] {"abcdef"}, "xyz"), equalTo(-1));
    }
}
