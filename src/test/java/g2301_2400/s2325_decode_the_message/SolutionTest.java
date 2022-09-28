package g2301_2400.s2325_decode_the_message;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decodeMessage() {
        assertThat(
                new Solution()
                        .decodeMessage(
                                "the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"),
                equalTo("this is a secret"));
    }

    @Test
    void decodeMessage2() {
        assertThat(
                new Solution()
                        .decodeMessage(
                                "eljuxhpwnyrdgtqkviszcfmabo",
                                "zwx hnfx lqantp mnoeius ycgk vcnjrdb"),
                equalTo("the five boxing wizards jump quickly"));
    }
}
