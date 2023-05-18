package g1201_1300.s1220_count_vowels_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countVowelPermutation() {
        assertThat(new Solution().countVowelPermutation(1), equalTo(5));
    }

    @Test
    void countVowelPermutation2() {
        assertThat(new Solution().countVowelPermutation(2), equalTo(10));
    }

    @Test
    void countVowelPermutation3() {
        assertThat(new Solution().countVowelPermutation(5), equalTo(68));
    }
}
