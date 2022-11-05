package g1301_1400.s1358_number_of_substrings_containing_all_three_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubstrings() {
        assertThat(new Solution().numberOfSubstrings("abcabc"), equalTo(10));
    }

    @Test
    void numberOfSubstrings2() {
        assertThat(new Solution().numberOfSubstrings("aaacb"), equalTo(3));
    }

    @Test
    void numberOfSubstrings3() {
        assertThat(new Solution().numberOfSubstrings("abc"), equalTo(1));
    }
}
