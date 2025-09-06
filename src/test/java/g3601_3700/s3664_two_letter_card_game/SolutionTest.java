package g3601_3700.s3664_two_letter_card_game;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void score() {
        assertThat(new Solution().score(new String[] {"aa", "ab", "ba", "ac"}, 'a'), equalTo(2));
    }

    @Test
    void score2() {
        assertThat(new Solution().score(new String[] {"aa", "ab", "ba"}, 'a'), equalTo(1));
    }

    @Test
    void score3() {
        assertThat(new Solution().score(new String[] {"aa", "ab", "ba", "ac"}, 'b'), equalTo(0));
    }
}
