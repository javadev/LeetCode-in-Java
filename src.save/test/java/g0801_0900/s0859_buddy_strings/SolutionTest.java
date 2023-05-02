package g0801_0900.s0859_buddy_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void buddyStrings() {
        assertThat(new Solution().buddyStrings("ab", "ba"), equalTo(true));
    }

    @Test
    void buddyStrings2() {
        assertThat(new Solution().buddyStrings("ab", "ab"), equalTo(false));
    }

    @Test
    void buddyStrings3() {
        assertThat(new Solution().buddyStrings("aa", "aa"), equalTo(true));
    }
}
