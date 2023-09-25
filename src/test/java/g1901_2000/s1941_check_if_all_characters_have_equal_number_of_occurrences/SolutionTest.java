package g1901_2000.s1941_check_if_all_characters_have_equal_number_of_occurrences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areOccurrencesEqual() {
        assertThat(new Solution().areOccurrencesEqual("abacbc"), equalTo(true));
    }

    @Test
    void areOccurrencesEqual2() {
        assertThat(new Solution().areOccurrencesEqual("aaabb"), equalTo(false));
    }
}
