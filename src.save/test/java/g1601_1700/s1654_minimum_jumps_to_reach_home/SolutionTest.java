package g1601_1700.s1654_minimum_jumps_to_reach_home;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumJumps() {
        assertThat(new Solution().minimumJumps(new int[] {14, 4, 18, 1, 15}, 3, 15, 9), equalTo(3));
    }

    @Test
    void minimumJumps2() {
        assertThat(
                new Solution().minimumJumps(new int[] {8, 3, 16, 6, 12, 20}, 15, 13, 11),
                equalTo(-1));
    }

    @Test
    void minimumJumps3() {
        assertThat(
                new Solution().minimumJumps(new int[] {1, 6, 2, 14, 5, 17, 4}, 16, 9, 7),
                equalTo(2));
    }
}
