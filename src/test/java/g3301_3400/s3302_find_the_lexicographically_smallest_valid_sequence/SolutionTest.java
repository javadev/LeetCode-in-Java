package g3301_3400.s3302_find_the_lexicographically_smallest_valid_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validSequence() {
        assertThat(new Solution().validSequence("vbcca", "abc"), equalTo(new int[] {0, 1, 2}));
    }

    @Test
    void validSequence2() {
        assertThat(new Solution().validSequence("bacdc", "abc"), equalTo(new int[] {1, 2, 4}));
    }

    @Test
    void validSequence3() {
        assertThat(new Solution().validSequence("aaaaaa", "aaabc"), equalTo(new int[] {}));
    }

    @Test
    void validSequence4() {
        assertThat(new Solution().validSequence("abc", "ab"), equalTo(new int[] {0, 1}));
    }
}
