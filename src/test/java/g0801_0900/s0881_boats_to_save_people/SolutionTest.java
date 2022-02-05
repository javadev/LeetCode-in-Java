package g0801_0900.s0881_boats_to_save_people;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numRescueBoats() {
        assertThat(new Solution().numRescueBoats(new int[] {1, 2}, 3), equalTo(1));
    }

    @Test
    void numRescueBoats2() {
        assertThat(new Solution().numRescueBoats(new int[] {3, 2, 2, 1}, 3), equalTo(3));
    }

    @Test
    void numRescueBoats3() {
        assertThat(new Solution().numRescueBoats(new int[] {3, 5, 3, 4}, 5), equalTo(4));
    }
}
