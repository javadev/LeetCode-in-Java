package g3301_3400.s3365_rearrange_k_substrings_to_form_target_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossibleToRearrange() {
        assertThat(new Solution().isPossibleToRearrange("abcd", "cdab", 2), equalTo(true));
    }

    @Test
    void isPossibleToRearrange2() {
        assertThat(new Solution().isPossibleToRearrange("aabbcc", "bbaacc", 3), equalTo(true));
    }

    @Test
    void isPossibleToRearrange3() {
        assertThat(new Solution().isPossibleToRearrange("aabbcc", "bbaacc", 2), equalTo(false));
    }
}
