package g2001_2100.s2075_decode_the_slanted_ciphertext;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decodeCiphertext() {
        assertThat(new Solution().decodeCiphertext("ch   ie   pr", 3), equalTo("cipher"));
    }

    @Test
    void decodeCiphertext2() {
        assertThat(
                new Solution().decodeCiphertext("iveo    eed   l te   olc", 4),
                equalTo("i love leetcode"));
    }

    @Test
    void decodeCiphertext3() {
        assertThat(new Solution().decodeCiphertext("coding", 1), equalTo("coding"));
    }
}
