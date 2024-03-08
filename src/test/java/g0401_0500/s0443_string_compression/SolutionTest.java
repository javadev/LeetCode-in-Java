package g0401_0500.s0443_string_compression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void compress() {
        assertThat(
                new Solution().compress(new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}),
                equalTo(6));
    }

    @Test
    void compress2() {
        assertThat(new Solution().compress(new char[] {'a'}), equalTo(1));
    }

    @Test
    void compress3() {
        assertThat(
                new Solution()
                        .compress(
                                new char[] {
                                    'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'
                                }),
                equalTo(4));
    }
}
