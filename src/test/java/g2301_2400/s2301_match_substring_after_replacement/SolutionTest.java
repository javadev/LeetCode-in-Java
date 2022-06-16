package g2301_2400.s2301_match_substring_after_replacement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matchReplacement() {
        assertThat(
                new Solution()
                        .matchReplacement(
                                "fool3e7bar",
                                "leet",
                                new char[][] {{'e', '3'}, {'t', '7'}, {'t', '8'}}),
                equalTo(true));
    }

    @Test
    void matchReplacement2() {
        assertThat(
                new Solution().matchReplacement("fooleetbar", "f00l", new char[][] {{'o', '0'}}),
                equalTo(false));
    }

    @Test
    void matchReplacement3() {
        assertThat(
                new Solution()
                        .matchReplacement(
                                "Fool33tbaR",
                                "leetd",
                                new char[][] {
                                    {'e', '3'}, {'t', '7'}, {'t', '8'}, {'d', 'b'}, {'p', 'b'}
                                }),
                equalTo(true));
    }
}
