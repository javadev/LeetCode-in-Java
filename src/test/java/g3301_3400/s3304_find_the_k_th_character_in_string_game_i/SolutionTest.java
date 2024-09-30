package g3301_3400.s3304_find_the_k_th_character_in_string_game_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthCharacter() {
        assertThat(new Solution().kthCharacter(5), equalTo('b'));
    }

    @Test
    void kthCharacter2() {
        assertThat(new Solution().kthCharacter(10), equalTo('c'));
    }
}
