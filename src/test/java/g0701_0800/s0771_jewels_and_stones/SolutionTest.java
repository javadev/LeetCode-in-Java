package g0701_0800.s0771_jewels_and_stones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numJewelsInStones() {
        assertThat(new Solution().numJewelsInStones("aA", "aAAbbbb"), equalTo(3));
    }

    @Test
    void numJewelsInStones2() {
        assertThat(new Solution().numJewelsInStones("z", "ZZ"), equalTo(0));
    }
}
