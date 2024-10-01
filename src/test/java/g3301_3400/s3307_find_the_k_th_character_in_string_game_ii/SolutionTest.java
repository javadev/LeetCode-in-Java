package g3301_3400.s3307_find_the_k_th_character_in_string_game_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthCharacter() {
        assertThat(new Solution().kthCharacter(5, new int[] {0, 0, 0}), equalTo('a'));
    }

    @Test
    void kthCharacter2() {
        assertThat(new Solution().kthCharacter(10, new int[] {0, 1, 0, 1}), equalTo('b'));
    }
}
