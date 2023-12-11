package g1701_1800.s1742_maximum_number_of_balls_in_a_box;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBalls() {
        assertThat(new Solution().countBalls(1, 10), equalTo(2));
    }

    @Test
    void countBalls2() {
        assertThat(new Solution().countBalls(5, 15), equalTo(2));
    }

    @Test
    void countBalls3() {
        assertThat(new Solution().countBalls(19, 28), equalTo(2));
    }
}
