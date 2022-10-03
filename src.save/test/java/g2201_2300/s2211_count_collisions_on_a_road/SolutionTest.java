package g2201_2300.s2211_count_collisions_on_a_road;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCollisions() {
        assertThat(new Solution().countCollisions("RLRSLL"), equalTo(5));
    }

    @Test
    void countCollisions2() {
        assertThat(new Solution().countCollisions("LLRR"), equalTo(0));
    }

    @Test
    void countCollisions3() {
        assertThat(
                new Solution().countCollisions("SRRLRLRSRLRSSRRLSLRLLRSLSLLSSRRLSRSLSLRRS"),
                equalTo(28));
    }

    @Test
    void countCollisions4() {
        assertThat(new Solution().countCollisions("SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR"), equalTo(20));
    }
}
