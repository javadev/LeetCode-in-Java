package g1201_1300.s1255_maximum_score_words_formed_by_letters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScoreWords() {
        assertThat(
                new Solution()
                        .maxScoreWords(
                                new String[] {"dog", "cat", "dad", "good"},
                                new char[] {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'},
                                new int[] {
                                    1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0,
                                    0, 0, 0, 0, 0
                                }),
                equalTo(23));
    }

    @Test
    void maxScoreWords2() {
        assertThat(
                new Solution()
                        .maxScoreWords(
                                new String[] {"xxxz", "ax", "bx", "cx"},
                                new char[] {'z', 'a', 'b', 'c', 'x', 'x', 'x'},
                                new int[] {
                                    4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                    0, 0, 5, 0, 10
                                }),
                equalTo(27));
    }

    @Test
    void maxScoreWords3() {
        assertThat(
                new Solution()
                        .maxScoreWords(
                                new String[] {"leetcode"},
                                new char[] {'l', 'e', 't', 'c', 'o', 'd'},
                                new int[] {
                                    0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0,
                                    0, 0, 0, 0, 0
                                }),
                equalTo(0));
    }
}
