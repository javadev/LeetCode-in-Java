package g2101_2200.s2185_counting_words_with_a_given_prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void prefixCount() {
        assertThat(
                new Solution()
                        .prefixCount(new String[] {"pay", "attention", "practice", "attend"}, "at"),
                equalTo(2));
    }

    @Test
    void prefixCount2() {
        assertThat(
                new Solution()
                        .prefixCount(new String[] {"leetcode", "win", "loops", "success"}, "code"),
                equalTo(0));
    }
}
