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

    @Test
    void elevatorRequests5() {
        // One request below start: just go down the distance.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {2}), equalTo(3L));
    }

    @Test
    void elevatorRequests6() {
        // One request above start: just go up the distance.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {8}), equalTo(3L));
    }

    @Test
    void elevatorRequests7() {
        // All requests equal to start contribute nothing.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {5, 5, 5, 5}), equalTo(0L));
    }

    @Test
    void elevatorRequests8() {
        // Requests at 1,2,3 below start 5.
        // Total requests t = 3, distances sorted: 2,3,4 (5-3,5-2,5-1).
        // dl[i][0]: i=1: 2*3=6; i=2: 6+(3-2)*2=8; i=3: 8+(4-3)*1=9.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {3, 2, 1}), equalTo(9L));
    }

    @Test
    void elevatorRequests9() {
        // Requests at 7,8,9 above start 5.
        // distances sorted: 2,3,4. Same structure -> 9.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {9, 8, 7}), equalTo(9L));
    }

    @Test
    void elevatorRequests10() {
        // Below: 3 -> dist 2; Above: 7 -> dist 2.
        // Best: handle both, total travel chooses cheaper direction switch.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {3, 7}), equalTo(8L));
    }

    @Test
    void elevatorRequests11() {
        // Below: 4 (dist 1); Above: 9 (dist 4).
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {4, 9}), equalTo(7L));
    }

    @Test
    void elevatorRequests12() {
        // start = 0, all requests above.
        // distances: 1,2,3 -> dr[0][j]: j=1:1*3=3; j=2:3+(2-1)*2=5; j=3:5+(3-2)*1=6.
        assertThat(new Solution().elevatorRequests(10, 0, new int[] {1, 2, 3}), equalTo(6L));
    }

    @Test
    void elevatorRequests13() {
        // start = 10, all requests below.
        // distances: 10-9=1, 10-8=2, 10-7=3 -> 6.
        assertThat(new Solution().elevatorRequests(10, 10, new int[] {7, 8, 9}), equalTo(6L));
    }

    @Test
    void elevatorRequests14() {
        // Duplicate requests on both sides.
        assertThat(new Solution().elevatorRequests(10, 5, new int[] {3, 3, 7, 7}), equalTo(16L));
    }

    @Test
    void elevatorRequests15() {
        // Check long arithmetic with larger spread.
        long result = new Solution().elevatorRequests(1000000, 500000, new int[] {1, 999999});
        // Below dist: 499999; Above dist: 499999; t=2.
        assertThat(result, equalTo(1999996L));
    }

    @Test
    void elevatorRequests16() {
        // Mixed multiple requests both directions.
        assertThat(new Solution().elevatorRequests(20, 10, new int[] {5, 8, 12, 15}), equalTo(34L));
    }
}
