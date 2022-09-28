package g0901_1000.s0975_odd_even_jump;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void oddEvenJumps() {
        assertThat(new Solution().oddEvenJumps(new int[] {10, 13, 12, 14, 15}), equalTo(2));
    }

    @Test
    void oddEvenJumps2() {
        assertThat(new Solution().oddEvenJumps(new int[] {2, 3, 1, 1, 4}), equalTo(3));
    }

    @Test
    void oddEvenJumps3() {
        assertThat(new Solution().oddEvenJumps(new int[] {5, 1, 3, 4, 2}), equalTo(3));
    }
}
