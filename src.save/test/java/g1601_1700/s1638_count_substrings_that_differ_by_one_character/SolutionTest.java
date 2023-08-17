package g1601_1700.s1638_count_substrings_that_differ_by_one_character;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubstrings() {
        assertThat(new Solution().countSubstrings("aba", "baba"), equalTo(6));
    }

    @Test
    void countSubstrings2() {
        assertThat(new Solution().countSubstrings("ab", "bb"), equalTo(3));
    }
}
