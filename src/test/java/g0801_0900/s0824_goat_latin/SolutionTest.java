package g0801_0900.s0824_goat_latin;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void toGoatLatin() {
        assertThat(new Solution().toGoatLatin("I speak Goat Latin"), equalTo("Imaa peaksmaaa oatGmaaaa atinLmaaaaa"));
    }

    @Test
    void toGoatLatin2() {
        assertThat(new Solution().toGoatLatin("The quick brown fox jumped over the lazy dog"), equalTo("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"));
    }
}
