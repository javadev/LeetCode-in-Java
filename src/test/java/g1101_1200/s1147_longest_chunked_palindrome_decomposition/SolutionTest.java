package g1101_1200.s1147_longest_chunked_palindrome_decomposition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestDecomposition() {
        assertThat(
                new Solution().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"),
                equalTo(7));
    }

    @Test
    void longestDecomposition2() {
        assertThat(new Solution().longestDecomposition("merchant"), equalTo(1));
    }

    @Test
    void longestDecompositio3() {
        assertThat(new Solution().longestDecomposition("antaprezatepzapreanta"), equalTo(11));
    }
}
