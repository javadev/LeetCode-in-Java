package g0801_0900.s0818_race_car;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void raceCar() {
        assertThat(new Solution().racecar(3), equalTo(2));
    }

    @Test
    void raceCar2() {
        assertThat(new Solution().racecar(6), equalTo(5));
    }
}
