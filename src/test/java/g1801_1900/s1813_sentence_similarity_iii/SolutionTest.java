package g1801_1900.s1813_sentence_similarity_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areSentencesSimilar() {
        assertThat(
                new Solution().areSentencesSimilar("My name is Haley", "My Haley"), equalTo(true));
    }

    @Test
    void areSentencesSimilar2() {
        assertThat(new Solution().areSentencesSimilar("of", "A lot of words"), equalTo(false));
    }

    @Test
    void areSentencesSimilar3() {
        assertThat(new Solution().areSentencesSimilar("Eating right now", "Eating"), equalTo(true));
    }
}
