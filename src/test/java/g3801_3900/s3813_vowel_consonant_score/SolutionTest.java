package g3801_3900.s3813_vowel_consonant_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void vowelConsonantScore() {
        assertThat(new Solution().vowelConsonantScore("cooear"), equalTo(2));
    }

    @Test
    void vowelConsonantScore2() {
        assertThat(new Solution().vowelConsonantScore("axeyizou"), equalTo(1));
    }

    @Test
    void vowelConsonantScore3() {
        assertThat(new Solution().vowelConsonantScore("au 123"), equalTo(0));
    }
}
