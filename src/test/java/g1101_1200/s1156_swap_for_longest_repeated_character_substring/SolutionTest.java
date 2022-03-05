package g1101_1200.s1156_swap_for_longest_repeated_character_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxRepOpt1() {
        assertThat(new Solution().maxRepOpt1("ababa"), equalTo(3));
    }

    @Test
    void maxRepOpt12() {
        assertThat(new Solution().maxRepOpt1("aaabaaa"), equalTo(6));
    }

    @Test
    void maxRepOpt13() {
        assertThat(new Solution().maxRepOpt1("aaaaa"), equalTo(5));
    }
}
