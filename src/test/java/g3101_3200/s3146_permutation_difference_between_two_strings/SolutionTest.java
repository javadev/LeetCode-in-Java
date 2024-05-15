package g3101_3200.s3146_permutation_difference_between_two_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPermutationDifference() {
        assertThat(new Solution().findPermutationDifference("abc", "bac"), equalTo(2));
    }

    @Test
    void findPermutationDifference2() {
        assertThat(new Solution().findPermutationDifference("abcde", "edbac"), equalTo(12));
    }
}
