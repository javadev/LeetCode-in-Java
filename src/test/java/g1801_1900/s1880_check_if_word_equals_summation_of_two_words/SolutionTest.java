package g1801_1900.s1880_check_if_word_equals_summation_of_two_words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSumEqual() {
        assertThat(new Solution().isSumEqual("acb", "cba", "cdb"), equalTo(true));
    }

    @Test
    void isSumEqual2() {
        assertThat(new Solution().isSumEqual("aaa", "a", "aab"), equalTo(false));
    }

    @Test
    void isSumEqual3() {
        assertThat(new Solution().isSumEqual("aaa", "a", "aaaa"), equalTo(true));
    }
}
