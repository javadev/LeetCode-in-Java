package g2401_2500.s2490_circular_sentence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isCircularSentence() {
        assertThat(
                new Solution().isCircularSentence("leetcode exercises sound delightful"),
                equalTo(true));
    }

    @Test
    void isCircularSentence2() {
        assertThat(new Solution().isCircularSentence("eetcode"), equalTo(true));
    }

    @Test
    void isCircularSentence3() {
        assertThat(new Solution().isCircularSentence("Leetcode is cool"), equalTo(false));
    }
}
