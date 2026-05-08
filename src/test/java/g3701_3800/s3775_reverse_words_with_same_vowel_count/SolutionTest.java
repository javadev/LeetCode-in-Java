package g3701_3800.s3775_reverse_words_with_same_vowel_count;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reverseWords() {
        assertThat(new Solution().reverseWords("cat and mice"), equalTo("cat dna mice"));
    }

    @Test
    void reverseWords2() {
        assertThat(new Solution().reverseWords("book is nice"), equalTo("book is ecin"));
    }

    @Test
    void reverseWords3() {
        assertThat(new Solution().reverseWords("banana healthy"), equalTo("banana healthy"));
    }
}
