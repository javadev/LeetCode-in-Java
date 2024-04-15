package g0001_0100.s0028_find_the_index_of_the_first_occurrence_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void strStr() {
        assertThat(new Solution().strStr("hello", "ll"), equalTo(2));
    }

    @Test
    void strStr2() {
        assertThat(new Solution().strStr("hello", ""), equalTo(0));
    }

    @Test
    void strStr3() {
        assertThat(new Solution().strStr("hello", "oo"), equalTo(-1));
    }
}
