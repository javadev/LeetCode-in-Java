package g4001_4100.s4027_elevator_requests_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void elevatorRequests() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[][] {}), equalTo(0L));
    }

    @Test
    void elevatorRequests2() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[][] {{0, 5}, {0, 5}}), equalTo(0L));
    }

    @Test
    void elevatorRequests3() {
        assertThat(new Solution().elevatorRequests(10, 5, new int[][] {{0, 7}}), equalTo(2L));
    }
}

