package g0701_0800.s0792_number_of_matching_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numMatchingSubseq() {
        assertThat(
                new Solution().numMatchingSubseq("abcde", new String[] {"a", "bb", "acd", "ace"}),
                equalTo(3));
    }

    @Test
    void numMatchingSubseq2() {
        assertThat(
                new Solution()
                        .numMatchingSubseq(
                                "dsahjpjauf",
                                new String[] {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}),
                equalTo(2));
    }
}
