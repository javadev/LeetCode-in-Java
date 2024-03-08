package g0701_0800.s0717_1_bit_and_2_bit_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isOneBitCharacter() {
        assertThat(new Solution().isOneBitCharacter(new int[] {1, 0, 0}), equalTo(true));
    }

    @Test
    void isOneBitCharacter2() {
        assertThat(new Solution().isOneBitCharacter(new int[] {1, 1, 1, 0}), equalTo(false));
    }
}
