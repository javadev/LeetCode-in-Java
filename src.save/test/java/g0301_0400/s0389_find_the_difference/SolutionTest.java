package g0301_0400.s0389_find_the_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheDifference() {
        assertThat(new Solution().findTheDifference("abcd", "abcde"), equalTo('e'));
    }

    @Test
    void findTheDifference2() {
        assertThat(new Solution().findTheDifference("", "y"), equalTo('y'));
    }

    @Test
    void findTheDifference3() {
        assertThat(new Solution().findTheDifference("a", "aa"), equalTo('a'));
    }

    @Test
    void findTheDifference4() {
        assertThat(new Solution().findTheDifference("ae", "aea"), equalTo('a'));
    }
}
