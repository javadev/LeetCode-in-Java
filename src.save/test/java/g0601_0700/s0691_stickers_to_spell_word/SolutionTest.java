package g0601_0700.s0691_stickers_to_spell_word;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minStickers() {
        assertThat(
                new Solution().minStickers(new String[] {"with", "example", "science"}, "thehat"),
                equalTo(3));
    }

    @Test
    void minStickers2() {
        assertThat(
                new Solution().minStickers(new String[] {"notice", "possible"}, "basicbasic"),
                equalTo(-1));
    }
}
