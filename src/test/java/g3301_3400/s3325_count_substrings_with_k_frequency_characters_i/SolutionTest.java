package g3301_3400.s3325_count_substrings_with_k_frequency_characters_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubstrings() {
        assertThat(new Solution().numberOfSubstrings("abacb", 2), equalTo(4));
    }

    @Test
    void numberOfSubstrings2() {
        assertThat(new Solution().numberOfSubstrings("abcde", 1), equalTo(15));
    }
}
