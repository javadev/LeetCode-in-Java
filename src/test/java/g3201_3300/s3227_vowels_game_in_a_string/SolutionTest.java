package g3201_3300.s3227_vowels_game_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void doesAliceWin() {
        assertThat(new Solution().doesAliceWin("leetcoder"), equalTo(true));
    }

    @Test
    void doesAliceWin2() {
        assertThat(new Solution().doesAliceWin("bbcd"), equalTo(false));
    }
}
