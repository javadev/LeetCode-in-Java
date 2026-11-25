package g4001_4100.s4023_elevator_requests_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void elevatorRequests() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {}), equalTo(0L));
    }

    @Test
    void elevatorRequests2() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {5, 5}), equalTo(0L));
    }

    @Test
    void elevatorRequests3() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {2, 4}), equalTo(4L));
    }

    @Test
    void elevatorRequests4() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {7, 9}), equalTo(6L));
    }
}
