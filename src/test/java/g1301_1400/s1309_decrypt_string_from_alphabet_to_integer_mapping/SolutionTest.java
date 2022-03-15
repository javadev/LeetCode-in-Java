package g1301_1400.s1309_decrypt_string_from_alphabet_to_integer_mapping;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void freqAlphabets() {
        assertThat(new Solution().freqAlphabets("10#11#12"), equalTo("jkab"));
    }

    @Test
    void freqAlphabets2() {
        assertThat(new Solution().freqAlphabets("1326#"), equalTo("acz"));
    }
}
