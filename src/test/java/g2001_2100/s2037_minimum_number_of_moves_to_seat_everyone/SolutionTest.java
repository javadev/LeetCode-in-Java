package g2001_2100.s2037_minimum_number_of_moves_to_seat_everyone;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMovesToSeat() {
        assertThat(
                new Solution().minMovesToSeat(new int[] {3, 1, 5}, new int[] {2, 7, 4}),
                equalTo(4));
    }

    @Test
    void minMovesToSeat2() {
        assertThat(
                new Solution().minMovesToSeat(new int[] {4, 1, 5, 9}, new int[] {1, 3, 2, 6}),
                equalTo(7));
    }

    @Test
    void minMovesToSeat3() {
        assertThat(
                new Solution().minMovesToSeat(new int[] {2, 2, 6, 6}, new int[] {1, 3, 2, 6}),
                equalTo(4));
    }
}
