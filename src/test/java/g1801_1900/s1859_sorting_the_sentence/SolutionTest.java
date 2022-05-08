package g1801_1900.s1859_sorting_the_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortSentence() {
        assertThat(
                new Solution().sortSentence("is2 sentence4 This1 a3"),
                equalTo("This is a sentence"));
    }

    @Test
    void sortSentence2() {
        assertThat(new Solution().sortSentence("Myself2 Me1 I4 and3"), equalTo("Me Myself and I"));
    }
}
