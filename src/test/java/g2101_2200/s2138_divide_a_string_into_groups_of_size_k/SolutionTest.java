package g2101_2200.s2138_divide_a_string_into_groups_of_size_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void divideString() {
        assertThat(
                new Solution().divideString("abcdefghi", 3, 'x'),
                equalTo(new String[] {"abc", "def", "ghi"}));
    }

    @Test
    void divideString2() {
        assertThat(
                new Solution().divideString("abcdefghij", 3, 'x'),
                equalTo(new String[] {"abc", "def", "ghi", "jxx"}));
    }
}
