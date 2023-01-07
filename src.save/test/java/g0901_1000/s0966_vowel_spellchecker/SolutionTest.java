package g0901_1000.s0966_vowel_spellchecker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void spellchecker() {
        assertThat(
                new Solution()
                        .spellchecker(
                                new String[] {"KiTe", "kite", "hare", "Hare"},
                                new String[] {
                                    "kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti",
                                    "keet", "keto"
                                }),
                equalTo(
                        new String[] {
                            "kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"
                        }));
    }

    @Test
    void spellchecker2() {
        assertThat(
                new Solution().spellchecker(new String[] {"yellow"}, new String[] {"YellOw"}),
                equalTo(new String[] {"yellow"}));
    }
}
