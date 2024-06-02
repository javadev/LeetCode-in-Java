package g3101_3200.s3163_string_compression_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void compressedString() {
        assertThat(new Solution().compressedString("abcde"), equalTo("1a1b1c1d1e"));
    }

    @Test
    void compressedString2() {
        assertThat(new Solution().compressedString("aaaaaaaaaaaaaabb"), equalTo("9a5a2b"));
    }
}
