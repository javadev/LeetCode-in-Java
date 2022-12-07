package g0801_0900.s0828_count_unique_characters_of_all_substrings_of_a_given_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniqueLetterString() {
        assertThat(new Solution().uniqueLetterString("ABC"), equalTo(10));
    }

    @Test
    void uniqueLetterString2() {
        assertThat(new Solution().uniqueLetterString("ABA"), equalTo(8));
    }

    @Test
    void uniqueLetterString3() {
        assertThat(new Solution().uniqueLetterString("LEETCODE"), equalTo(92));
    }
}
