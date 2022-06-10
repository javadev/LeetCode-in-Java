package g1901_2000.s1916_count_ways_to_build_rooms_in_an_ant_colony;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToBuildRooms() {
        assertThat(new Solution().waysToBuildRooms(new int[] {-1, 0, 1}), equalTo(1));
    }

    @Test
    void waysToBuildRooms2() {
        assertThat(new Solution().waysToBuildRooms(new int[] {-1, 0, 0, 1, 2}), equalTo(6));
    }
}
