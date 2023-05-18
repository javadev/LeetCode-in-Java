package g0701_0800.s0790_domino_and_tromino_tiling;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numTilings() {
        assertThat(new Solution().numTilings(3), equalTo(5));
    }

    @Test
    void numTilings2() {
        assertThat(new Solution().numTilings(1), equalTo(1));
    }

    @Test
    void numTilings3() {
        assertThat(new Solution().numTilings(2), equalTo(2));
    }

    @Test
    void numTilings4() {
        assertThat(new Solution().numTilings(3), equalTo(5));
    }

    @Test
    void numTilings5() {
        assertThat(new Solution().numTilings(4), equalTo(11));
    }

    @Test
    void numTilings6() {
        assertThat(new Solution().numTilings(5), equalTo(24));
    }

    @Test
    void numTilings7() {
        assertThat(new Solution().numTilings(6), equalTo(53));
    }
}
