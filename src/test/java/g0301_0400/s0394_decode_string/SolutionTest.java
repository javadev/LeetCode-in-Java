package g0301_0400.s0394_decode_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decodeString() {
        assertThat(new Solution().decodeString("3[a]2[bc]"), equalTo("aaabcbc"));
    }

    @Test
    void decodeString2() {
        assertThat(new Solution().decodeString("3[a2[c]]"), equalTo("accaccacc"));
    }

    @Test
    void decodeString3() {
        assertThat(new Solution().decodeString("2[abc]3[cd]ef"), equalTo("abcabccdcdcdef"));
    }

    @Test
    void decodeString4() {
        assertThat(new Solution().decodeString("abc3[cd]xyz"), equalTo("abccdcdcdxyz"));
    }
}
