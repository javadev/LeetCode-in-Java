package g0701_0800.s0791_custom_sort_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void customSortString() {
        assertThat(new Solution().customSortString("cba", "abcd"), equalTo("cbad"));
    }

    @Test
    void customSortString2() {
        assertThat(new Solution().customSortString("cbafg", "abcd"), equalTo("cbad"));
    }
}
