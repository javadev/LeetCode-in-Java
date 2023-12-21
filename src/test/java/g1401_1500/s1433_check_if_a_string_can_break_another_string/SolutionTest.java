package g1401_1500.s1433_check_if_a_string_can_break_another_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkIfCanBreak() {
        assertThat(new Solution().checkIfCanBreak("abc", "xya"), equalTo(true));
    }

    @Test
    void checkIfCanBreak2() {
        assertThat(new Solution().checkIfCanBreak("abe", "acd"), equalTo(false));
    }

    @Test
    void checkIfCanBreak3() {
        assertThat(new Solution().checkIfCanBreak("leetcodee", "interview"), equalTo(true));
    }
}
