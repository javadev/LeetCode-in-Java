package g0301_0400.s0316_remove_duplicate_letters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeDuplicateLetters() {
        assertThat(new Solution().removeDuplicateLetters("bcabc"), equalTo("abc"));
    }

    @Test
    void removeDuplicateLetters2() {
        assertThat(new Solution().removeDuplicateLetters("cbacdcbc"), equalTo("acdb"));
    }
}
