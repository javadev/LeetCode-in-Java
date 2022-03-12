package g1201_1300.s1227_airplane_seat_assignment_probability;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nthPersonGetsNthSeat() {
        assertThat(new Solution().nthPersonGetsNthSeat(1), equalTo(1.000));
    }

    @Test
    void nthPersonGetsNthSeat2() {
        assertThat(new Solution().nthPersonGetsNthSeat(2), equalTo(0.50000));
    }
}
