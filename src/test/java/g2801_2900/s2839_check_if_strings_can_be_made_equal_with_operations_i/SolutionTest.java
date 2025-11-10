package g2801_2900.s2839_check_if_strings_can_be_made_equal_with_operations_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canBeEqual() {
        assertThat(new Solution().canBeEqual("abcd", "cdab"), equalTo(true));
    }

    @Test
    void canBeEqual2() {
        assertThat(new Solution().canBeEqual("abcd", "cdab"), equalTo(true));
    }

    @Test
    void canBeEqual3() {
        assertThat(new Solution().canBeEqual("abcd", "abcd"), equalTo(true));
    }

    @Test
    void canBeEqual4() {
        assertThat(new Solution().canBeEqual("abcd", "cbad"), equalTo(true));
    }

    @Test
    void canBeEqual5() {
        assertThat(new Solution().canBeEqual("abcd", "adcb"), equalTo(true));
    }

    @Test
    void canBeEqual6() {
        assertThat(new Solution().canBeEqual("abcd", "abdc"), equalTo(false));
    }

    @Test
    void canBeEqual7() {
        assertThat(new Solution().canBeEqual("abcd", "wxyz"), equalTo(false));
    }

    @Test
    void canBeEqual8() {
        assertThat(new Solution().canBeEqual("aabb", "bbaa"), equalTo(true));
    }

    @Test
    void canBeEqual9() {
        assertThat(new Solution().canBeEqual("abcd", "cdab"), equalTo(true));
    }

    @Test
    void canBeEqual10() {
        assertThat(new Solution().canBeEqual("abba", "baab"), equalTo(true));
    }
}
