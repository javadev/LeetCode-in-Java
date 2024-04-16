package g3001_3100.s3081_replace_question_marks_in_string_to_minimize_its_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeStringValue() {
        assertThat(new Solution().minimizeStringValue("???"), equalTo("abc"));
    }

    @Test
    void minimizeStringValue2() {
        assertThat(new Solution().minimizeStringValue("a?a?"), equalTo("abac"));
    }
}
