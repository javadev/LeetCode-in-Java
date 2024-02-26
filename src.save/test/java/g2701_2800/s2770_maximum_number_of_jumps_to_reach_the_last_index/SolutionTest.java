package g2701_2800.s2770_maximum_number_of_jumps_to_reach_the_last_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumJumps() {
        assertThat(new Solution().maximumJumps(new int[] {1, 3, 6, 4, 1, 2}, 2), equalTo(3));
    }

    @Test
    void maximumJumps2() {
        assertThat(new Solution().maximumJumps(new int[] {1, 3, 6, 4, 1, 2}, 3), equalTo(5));
    }

    @Test
    void maximumJumps3() {
        assertThat(new Solution().maximumJumps(new int[] {1, 3, 6, 4, 1, 2}, 0), equalTo(-1));
    }
}
