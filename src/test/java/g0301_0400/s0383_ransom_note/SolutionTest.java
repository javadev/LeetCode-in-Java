package g0301_0400.s0383_ransom_note;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canConstruct() {
        assertThat(new Solution().canConstruct("a", "b"), equalTo(false));
    }

    @Test
    void canConstruct2() {
        assertThat(new Solution().canConstruct("aa", "ab"), equalTo(false));
    }

    @Test
    void canConstruct3() {
        assertThat(new Solution().canConstruct("aa", "aab"), equalTo(true));
    }
}
