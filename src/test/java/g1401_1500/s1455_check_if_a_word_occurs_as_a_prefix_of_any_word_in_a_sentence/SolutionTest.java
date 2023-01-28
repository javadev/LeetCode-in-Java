package g1401_1500.s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPrefixOfWord() {
        assertThat(new Solution().isPrefixOfWord("i love eating burger", "burg"), equalTo(4));
    }

    @Test
    void isPrefixOfWord2() {
        assertThat(
                new Solution().isPrefixOfWord("this problem is an easy problem", "pro"),
                equalTo(2));
    }

    @Test
    void isPrefixOfWord3() {
        assertThat(new Solution().isPrefixOfWord("i am tired", "you"), equalTo(-1));
    }
}
