package g3701_3800.s3720_lexicographically_smallest_permutation_greater_than_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexGreaterPermutation() {
        assertThat(new Solution().lexGreaterPermutation("abc", "bba"), equalTo("bca"));
    }

    @Test
    void lexGreaterPermutation2() {
        assertThat(new Solution().lexGreaterPermutation("leet", "code"), equalTo("eelt"));
    }

    @Test
    void lexGreaterPermutation3() {
        assertThat(new Solution().lexGreaterPermutation("baba", "bbaa"), equalTo(""));
    }
}
