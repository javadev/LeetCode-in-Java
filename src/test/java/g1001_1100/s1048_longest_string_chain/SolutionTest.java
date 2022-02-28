package g1001_1100.s1048_longest_string_chain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestStrChain() {
        assertThat(
                new Solution().longestStrChain(new String[] {"a", "b", "ba", "bca", "bda", "bdca"}),
                equalTo(4));
    }

    @Test
    void longestStrChain2() {
        assertThat(
                new Solution()
                        .longestStrChain(new String[] {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"}),
                equalTo(5));
    }

    @Test
    void longestStrChain3() {
        assertThat(new Solution().longestStrChain(new String[] {"abcd", "dbqca"}), equalTo(1));
    }
}
