package g1901_2000.s1997_first_day_where_you_have_been_in_all_the_rooms;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstDayBeenInAllRooms() {
        assertThat(new Solution().firstDayBeenInAllRooms(new int[] {0, 0}), equalTo(2));
    }

    @Test
    void firstDayBeenInAllRooms2() {
        assertThat(new Solution().firstDayBeenInAllRooms(new int[] {0, 0, 2}), equalTo(6));
    }

    @Test
    void firstDayBeenInAllRooms3() {
        assertThat(new Solution().firstDayBeenInAllRooms(new int[] {0, 1, 2, 0}), equalTo(6));
    }
}
