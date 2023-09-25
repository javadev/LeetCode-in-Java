package g2001_2100.s2024_maximize_the_confusion_of_an_exam;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxConsecutiveAnswers() {
        assertThat(new Solution().maxConsecutiveAnswers("TTFF", 2), equalTo(4));
    }

    @Test
    void maxConsecutiveAnswers2() {
        assertThat(new Solution().maxConsecutiveAnswers("TTFF", 1), equalTo(3));
    }

    @Test
    void maxConsecutiveAnswers3() {
        assertThat(new Solution().maxConsecutiveAnswers("TTFTTFTT", 1), equalTo(5));
    }
}
