package g0401_0500.s0424_longest_repeating_character_replacement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void characterReplacement() {
        assertThat(new Solution().characterReplacement("ABAB", 2), equalTo(4));
    }

    @Test
    void characterReplacement2() {
        assertThat(new Solution().characterReplacement("AABABBA", 1), equalTo(4));
    }
}
