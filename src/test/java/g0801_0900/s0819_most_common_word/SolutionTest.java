package g0801_0900.s0819_most_common_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostCommonWord() {
        assertThat(
                new Solution()
                        .mostCommonWord(
                                "Bob hit a ball, the hit BALL flew far after it was hit.",
                                new String[] {"hit"}),
                equalTo("ball"));
    }

    @Test
    void mostCommonWord2() {
        assertThat(new Solution().mostCommonWord("a.", new String[] {}), equalTo("a"));
    }
}
