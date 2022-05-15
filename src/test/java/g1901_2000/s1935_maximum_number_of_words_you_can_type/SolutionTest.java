package g1901_2000.s1935_maximum_number_of_words_you_can_type;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canBeTypedWords() {
        assertThat(new Solution().canBeTypedWords("hello world", "ad"), equalTo(1));
    }

    @Test
    void canBeTypedWords2() {
        assertThat(new Solution().canBeTypedWords("leet code", "lt"), equalTo(1));
    }

    @Test
    void canBeTypedWords3() {
        assertThat(new Solution().canBeTypedWords("leet code", "e"), equalTo(0));
    }
}
