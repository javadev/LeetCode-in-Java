package g1501_1600.s1544_make_the_string_great;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeGood() {
        assertThat(new Solution().makeGood("leEeetcode"), equalTo("leetcode"));
    }

    @Test
    void makeGood2() {
        assertThat(new Solution().makeGood("abBAcC"), equalTo(""));
    }

    @Test
    void makeGood3() {
        assertThat(new Solution().makeGood("s"), equalTo("s"));
    }
}
