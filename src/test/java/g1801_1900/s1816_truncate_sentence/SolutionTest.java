package g1801_1900.s1816_truncate_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void truncateSentence() {
        assertThat(
                new Solution().truncateSentence("Hello how are you Contestant", 4),
                equalTo("Hello how are you"));
    }

    @Test
    void truncateSentence2() {
        assertThat(
                new Solution().truncateSentence("What is the solution to this problem", 4),
                equalTo("What is the solution"));
    }

    @Test
    void truncateSentence3() {
        assertThat(
                new Solution().truncateSentence("chopper is not a tanuki", 5),
                equalTo("chopper is not a tanuki"));
    }
}
