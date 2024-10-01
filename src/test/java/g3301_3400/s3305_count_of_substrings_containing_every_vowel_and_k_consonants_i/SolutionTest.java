package g3301_3400.s3305_count_of_substrings_containing_every_vowel_and_k_consonants_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOfSubstrings() {
        assertThat(new Solution().countOfSubstrings("aeioqq", 1), equalTo(0));
    }

    @Test
    void countOfSubstrings2() {
        assertThat(new Solution().countOfSubstrings("aeiou", 0), equalTo(1));
    }

    @Test
    void countOfSubstrings3() {
        assertThat(new Solution().countOfSubstrings("ieaouqqieaouqq", 1), equalTo(3));
    }
}
