package g1001_1100.s1094_car_pooling;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void carPooling() {
        assertThat(
                new Solution().carPooling(new int[][] {{2, 1, 5}, {3, 3, 7}}, 4), equalTo(false));
    }

    @Test
    void carPooling2() {
        assertThat(new Solution().carPooling(new int[][] {{2, 1, 5}, {3, 3, 7}}, 5), equalTo(true));
    }
}
