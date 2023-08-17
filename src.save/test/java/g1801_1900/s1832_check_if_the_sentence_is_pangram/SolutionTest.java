package g1801_1900.s1832_check_if_the_sentence_is_pangram;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkIfPangram() {
        assertThat(
                new Solution().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"),
                equalTo(true));
    }

    @Test
    void checkIfPangram2() {
        assertThat(new Solution().checkIfPangram("leetcode"), equalTo(false));
    }
}
