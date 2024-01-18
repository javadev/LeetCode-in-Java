package g2701_2800.s2746_decremental_string_concatenation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizeConcatenatedLength() {
        assertThat(
                new Solution().minimizeConcatenatedLength(new String[] {"aa", "ab", "bc"}),
                equalTo(4));
    }

    @Test
    void minimizeConcatenatedLength2() {
        assertThat(new Solution().minimizeConcatenatedLength(new String[] {"ab", "b"}), equalTo(2));
    }

    @Test
    void minimizeConcatenatedLength3() {
        assertThat(
                new Solution().minimizeConcatenatedLength(new String[] {"aaa", "c", "aba"}),
                equalTo(6));
    }
}
