package g2401_2500.s2402_meeting_rooms_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostBooked() {
        assertThat(
                new Solution().mostBooked(2, new int[][] {{0, 10}, {1, 5}, {2, 7}, {3, 4}}),
                equalTo(0));
    }

    @Test
    void mostBooked2() {
        assertThat(
                new Solution()
                        .mostBooked(3, new int[][] {{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}}),
                equalTo(1));
    }
}
