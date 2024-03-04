package g3001_3100.s3039_apply_operations_to_make_string_empty;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastNonEmptyString() {
        assertThat(new Solution().lastNonEmptyString("aabcbbca"), equalTo("ba"));
    }

    @Test
    void lastNonEmptyString2() {
        assertThat(new Solution().lastNonEmptyString("abcd"), equalTo("abcd"));
    }
}
