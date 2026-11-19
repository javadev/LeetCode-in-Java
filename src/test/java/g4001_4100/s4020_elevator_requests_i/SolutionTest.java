package g4001_4100.s4020_elevator_requests_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void elevatorRequests() {
        assertThat(new Solution().elevatorRequests(5, new int[] {2, 1, 4, 3}), equalTo(7));
    }

    @Test
    void elevatorRequests2() {
        assertThat(new Solution().elevatorRequests(3, new int[] {2, 0, 0}), equalTo(4));
    }
}
