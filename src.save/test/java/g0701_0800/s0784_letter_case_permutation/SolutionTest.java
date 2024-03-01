package g0701_0800.s0784_letter_case_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void letterCasePermutation() {
        assertThat(
                new Solution().letterCasePermutation("a1b2"),
                equalTo(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2")));
    }

    @Test
    void letterCasePermutation2() {
        assertThat(
                new Solution().letterCasePermutation("3z4"), equalTo(Arrays.asList("3z4", "3Z4")));
    }

    @Test
    void letterCasePermutation3() {
        assertThat(new Solution().letterCasePermutation("C"), equalTo(Arrays.asList("C", "c")));
    }
}
